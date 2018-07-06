package com.example.saba.smsTsu.presentation.studentBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.studentBlank.actions.GoToAcademicBlankScreenAction
import com.example.saba.smsTsu.presentation.studentBlank.actions.GoToSemesterBlankScreenAction
import com.example.saba.smsTsu.presentation.studentBlank.actions.GoToSemesterTableScreenAction

class StudentBlankPresenter(private val studentBlankNavigator: StudentBlankNavigator) :
        BasePresenter<StudentBlankViewState, StudentBlankView>() {

    override fun getInitialViewState(): StudentBlankViewState = StudentBlankViewState(STUDENT_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {
        registerPerPresenterDisposables(
//                getView().goToAcademicBlankScreen().map { GoToAcademicBlankScreenAction(studentBlankNavigator) }.subscribe(this::dispatchAction),
//                getView().goToSemesterBlankScreen().map { GoToSemesterBlankScreenAction(studentBlankNavigator) }.subscribe(this::dispatchAction),
//                getView().goToSemesterTableScreen().map { GoToSemesterTableScreenAction(studentBlankNavigator) }.subscribe(this::dispatchAction)
        )
    }

    override fun onAttach(isFirstAttach: Boolean) {}

}
