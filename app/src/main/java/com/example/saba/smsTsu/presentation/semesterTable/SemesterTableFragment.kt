package com.example.saba.smsTsu.presentation.semesterTable

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_semester_table.*

class SemesterTableFragment : BaseFragment<SemesterTableViewState, SemesterTablePresenter>(), SemesterTableView {

    override fun goToStudentBlankScreen(): Observable<Any> = RxView.clicks(toolbarPerson)

    override fun goToAcademicBlankScreen(): Observable<Any> = RxView.clicks(toolbarBlank)

    override fun goToSemesterBlankScreen(): Observable<Any> = RxView.clicks(toolbarSemester)

    override fun renderView(view: View?, savedInstanceState: Bundle?) {
        toolbarTable.setColorFilter(ContextCompat.getColor(context!!, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN)
    }

    override fun reflectState(state: SemesterTableViewState) { }

    override fun onPresenterReady(presenter: SemesterTablePresenter) {
        presenter.attach(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_semester_table, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SemesterTableFragment()
    }
}
