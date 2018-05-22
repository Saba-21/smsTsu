package com.example.saba.smsTsu.presentation.academicBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.academicBlank.actions.GoToSemesterBlankScreenAction
import com.example.saba.smsTsu.presentation.academicBlank.actions.GoToSemesterTableScreenAction
import com.example.saba.smsTsu.presentation.academicBlank.actions.GoToStudentBlankScreenAction

class AcademicBlankPresenter(private val academicBlankNavigator: AcademicBlankNavigator) :
        BasePresenter<AcademicBlankViewState, AcademicBlankView>() {

    override fun getInitialViewState(): AcademicBlankViewState = AcademicBlankViewState(ACADEMIC_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {
        registerPerPresenterDisposables(
                getView().goToSemesterBlankScreen().map { GoToSemesterBlankScreenAction(academicBlankNavigator) }.subscribe(this::dispatchAction),
                getView().goToSemesterTableScreen().map { GoToSemesterTableScreenAction(academicBlankNavigator) }.subscribe(this::dispatchAction),
                getView().goToStudentBlankScreen().map { GoToStudentBlankScreenAction(academicBlankNavigator) }.subscribe(this::dispatchAction)
        )
    }

    override fun onAttach(isFirstAttach: Boolean) { }

}
