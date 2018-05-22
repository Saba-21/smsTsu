package com.example.saba.smsTsu.presentation.semesterBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter

class SemesterBlankPresenter(private val semesterBlankNavigator: SemesterBlankNavigator) :
        BasePresenter<SemesterBlankViewState, SemesterBlankView>() {

    override fun getInitialViewState(): SemesterBlankViewState = SemesterBlankViewState(SEMESTER_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {

    }

    override fun onAttach(isFirstAttach: Boolean) {

    }
}