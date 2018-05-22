package com.example.saba.smsTsu.presentation.semesterTable

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.semesterTable.actions.GoToAcademicBlankScreenAction
import com.example.saba.smsTsu.presentation.semesterTable.actions.GoToSemesterBlankScreenAction
import com.example.saba.smsTsu.presentation.semesterTable.actions.GoToStudentBlankScreenAction

class SemesterTablePresenter(private val semesterTableNavigator: SemesterTableNavigator) :
        BasePresenter<SemesterTableViewState, SemesterTableView>() {

    override fun getInitialViewState(): SemesterTableViewState = SemesterTableViewState(SEMESTER_TABLE_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {
        registerPerPresenterDisposables(
                getView().goToAcademicBlankScreen().map { GoToAcademicBlankScreenAction(semesterTableNavigator) }.subscribe(this::dispatchAction),
                getView().goToSemesterBlankScreen().map { GoToSemesterBlankScreenAction(semesterTableNavigator) }.subscribe(this::dispatchAction),
                getView().goToStudentBlankScreen().map { GoToStudentBlankScreenAction(semesterTableNavigator) }.subscribe(this::dispatchAction)
        )
    }

    override fun onAttach(isFirstAttach: Boolean) { }

}
