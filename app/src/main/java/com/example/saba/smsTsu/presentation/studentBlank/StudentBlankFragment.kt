package com.example.saba.smsTsu.presentation.studentBlank

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_student_blank.*

class StudentBlankFragment : BaseFragment<StudentBlankViewState, StudentBlankPresenter>(), StudentBlankView {

    override fun goToAcademicBlankScreen(): Observable<Any> = RxView.clicks(toolbarBlank)

    override fun goToSemesterBlankScreen(): Observable<Any> = RxView.clicks(toolbarSemester)

    override fun goToSemesterTableScreen(): Observable<Any> = RxView.clicks(toolbarTable)

    override fun renderView(view: View?, savedInstanceState: Bundle?) {
        toolbarPerson.setColorFilter(ContextCompat.getColor(context!!, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN)
    }

    override fun reflectState(state: StudentBlankViewState) { }

    override fun onPresenterReady(presenter: StudentBlankPresenter) {
        presenter.attach(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_student_blank, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = StudentBlankFragment()
    }
}
