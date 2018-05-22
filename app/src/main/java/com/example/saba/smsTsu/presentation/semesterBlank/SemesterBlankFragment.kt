package com.example.saba.smsTsu.presentation.semesterBlank

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_semester_blank.*

class SemesterBlankFragment : BaseFragment<SemesterBlankViewState, SemesterBlankPresenter>(), SemesterBlankView {

    override fun goToSemesterTableScreen(): Observable<Any> = RxView.clicks(toolbarTable)

    override fun goToStudentBlankScreen(): Observable<Any> = RxView.clicks(toolbarPerson)

    override fun goToAcademicBlankScreen(): Observable<Any> = RxView.clicks(toolbarBlank)

    override fun renderView(view: View?, savedInstanceState: Bundle?) {
        toolbarSemester.setColorFilter(ContextCompat.getColor(context!!, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN)
    }

    override fun reflectState(state: SemesterBlankViewState) { }

    override fun onPresenterReady(presenter: SemesterBlankPresenter) {
        presenter.attach(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_semester_blank, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SemesterBlankFragment()
    }
}
