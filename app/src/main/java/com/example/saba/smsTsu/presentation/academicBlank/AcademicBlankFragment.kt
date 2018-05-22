package com.example.saba.smsTsu.presentation.academicBlank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import io.reactivex.Observable

class AcademicBlankFragment : BaseFragment<AcademicBlankViewState, AcademicBlankPresenter>(), AcademicBlankView {

    override fun goToStudentBlankScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToSemesterBlankScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToSemesterTableScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun renderView(view: View?, savedInstanceState: Bundle?) {

    }

    override fun reflectState(state: AcademicBlankViewState) {

    }

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
