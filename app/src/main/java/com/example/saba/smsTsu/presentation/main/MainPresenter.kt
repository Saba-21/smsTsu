package com.example.saba.smsTsu.presentation.main

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankNavigator
import com.example.saba.smsTsu.presentation.auth.AuthNavigator
import com.example.saba.smsTsu.presentation.main.actions.*
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankNavigator
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableNavigator
import com.example.saba.smsTsu.presentation.splash.SplashNavigator
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankNavigator

class MainPresenter : BasePresenter<MainViewState, MainView>(),
        SplashNavigator,
        AuthNavigator,
        AcademicBlankNavigator,
        SemesterBlankNavigator,
        SemesterTableNavigator,
        StudentBlankNavigator {

    override fun getInitialViewState():
            MainViewState = MainViewState(MAIN_VIEW_DRAW_SPLASH_SCREEN_STATE)

    override fun onFirstAttach() {}

    override fun onAttach(isFirstAttach: Boolean) {}

    override fun goToStudentBlankScreen() {
        dispatchAction(DrawStudentBlankScreenAction())
    }

    override fun goToAcademicBlankScreen() {
        dispatchAction(DrawAcademicBlankScreenAction())
    }

    override fun goToSemesterTableScreen() {
        dispatchAction(DrawSemesterTableScreenAction())
    }

    override fun goToSemesterBlankScreen() {
        dispatchAction(DrawSemesterBlankScreenAction())
    }

    override fun goToAuthScreen() {
        dispatchAction(DrawAuthScreenAction())
    }

}
