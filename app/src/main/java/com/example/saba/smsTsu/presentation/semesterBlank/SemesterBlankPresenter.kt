package com.example.saba.smsTsu.presentation.semesterBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.semesterBlank.actions.GoToAcademicBlankScreenAction
import com.example.saba.smsTsu.presentation.semesterBlank.actions.GoToSemesterTableScreenAction
import com.example.saba.smsTsu.presentation.semesterBlank.actions.GoToStudentBlankScreenAction

class SemesterBlankPresenter(private val semesterBlankNavigator: SemesterBlankNavigator) :
        BasePresenter<SemesterBlankViewState, SemesterBlankView>() {

    override fun getInitialViewState(): SemesterBlankViewState = SemesterBlankViewState(SEMESTER_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {
        registerPerPresenterDisposables(
//                getView().goToAcademicBlankScreen().map { GoToAcademicBlankScreenAction(semesterBlankNavigator) }.subscribe(this::dispatchAction),
//                getView().goToSemesterTableScreen().map { GoToSemesterTableScreenAction(semesterBlankNavigator) }.subscribe(this::dispatchAction),
//                getView().goToStudentBlankScreen().map { GoToStudentBlankScreenAction(semesterBlankNavigator) }.subscribe(this::dispatchAction)
        )
    }

    override fun onAttach(isFirstAttach: Boolean) { }

}
