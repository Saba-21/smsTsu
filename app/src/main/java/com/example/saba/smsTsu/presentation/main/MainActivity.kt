package com.example.saba.smsTsu.presentation.main

import android.os.Bundle
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.activity.BaseActivity
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankFragment
import com.example.saba.smsTsu.presentation.auth.AuthFragment
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankFragment
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableFragment
import com.example.saba.smsTsu.presentation.splash.SplashFragment
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankFragment

class MainActivity : BaseActivity<MainViewState, MainPresenter>(), MainView {

    override fun reflectState(state: MainViewState) {
        when (state.state) {
            MAIN_VIEW_DRAW_SPLASH_SCREEN_STATE -> onSplashScreenNavigationState()

            MAIN_VIEW_DRAW_AUTH_SCREEN_STATE -> onAuthScreenNavigationState()

            MAIN_VIEW_DRAW_STUDENT_BLANK_SCREEN_STATE -> onStudentBlankScreenNavigationState()

            MAIN_VIEW_DRAW_SEMESTER_TABLE_SCREEN_STATE -> onSemesterTableScreenNavigationState()

            MAIN_VIEW_DRAW_SEMESTER_BLANK_SCREEN_STATE -> onSemesterBlankScreenNavigationState()

            MAIN_VIEW_DRAW_ACADEMIC_BLANK_SCREEN_STATE -> onAcademicBlankScreenNavigationState()
        }
    }

    override fun onPresenterReady(presenter: MainPresenter) {
        presenter.attach(this)
    }

    override fun renderView(savedInstanceState: Bundle?) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun onSplashScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, SplashFragment.newInstance())
                .commit()
    }

    private fun onAuthScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, AuthFragment.newInstance())
                .commit()
    }

    private fun onAcademicBlankScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, AcademicBlankFragment.newInstance())
                .commit()
    }

    private fun onSemesterBlankScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, SemesterBlankFragment.newInstance())
                .commit()
    }

    private fun onSemesterTableScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, SemesterTableFragment.newInstance())
                .commit()
    }

    private fun onStudentBlankScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, StudentBlankFragment.newInstance())
                .commit()
    }


}
