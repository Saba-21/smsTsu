package com.example.saba.smsTsu.presentation.semesterTable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import io.reactivex.Observable

class SemesterTableFragment : BaseFragment<SemesterTableViewState, SemesterTablePresenter>(), SemesterTableView {

    override fun renderView(view: View?, savedInstanceState: Bundle?) {

    }

    override fun reflectState(state: SemesterTableViewState) {

    }

    override fun onPresenterReady(presenter: SemesterTablePresenter) {
        presenter.attach(this)
    }

    override fun goToStudentBlankScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToAcademicBlankScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToSemesterBlankScreen(): Observable<Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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
