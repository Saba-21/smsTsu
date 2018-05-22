package com.example.saba.smsTsu.presentation.studentBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter

class StudentBlankPresenter(private val studentBlankNavigator: StudentBlankNavigator) :
        BasePresenter<StudentBlankViewState, StudentBlankView>() {

    override fun getInitialViewState(): StudentBlankViewState = StudentBlankViewState(STUDENT_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {

    }

    override fun onAttach(isFirstAttach: Boolean) {

    }
}