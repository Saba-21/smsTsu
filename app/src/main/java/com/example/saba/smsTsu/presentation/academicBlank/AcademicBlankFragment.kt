package com.example.saba.smsTsu.presentation.academicBlank

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_academic_blank.*

class AcademicBlankFragment : BaseFragment<AcademicBlankViewState, AcademicBlankPresenter>(), AcademicBlankView {

    override fun goToStudentBlankScreen(): Observable<Any> = RxView.clicks(toolbarPerson)

    override fun goToSemesterBlankScreen(): Observable<Any> = RxView.clicks(toolbarSemester)

    override fun goToSemesterTableScreen(): Observable<Any> = RxView.clicks(toolbarTable)

    override fun renderView(view: View?, savedInstanceState: Bundle?) {
        toolbarBlank.setColorFilter(ContextCompat.getColor(context!!, R.color.colorPrimary), android.graphics.PorterDuff.Mode.SRC_IN)
    }

    override fun reflectState(state: AcademicBlankViewState) { }

    override fun onPresenterReady(presenter: AcademicBlankPresenter) {
        presenter.attach(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_academic_blank, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = AcademicBlankFragment()
    }
}
