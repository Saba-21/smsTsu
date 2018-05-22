package com.example.saba.smsTsu.presentation.semesterTable

import com.example.saba.smsTsu.mvi.presenter.BasePresenter

class SemesterTablePresenter(private val semesterTableNavigator: SemesterTableNavigator) :
        BasePresenter<SemesterTableViewState, SemesterTableView>() {

    override fun getInitialViewState(): SemesterTableViewState = SemesterTableViewState(SEMESTER_TABLE_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {

    }

    override fun onAttach(isFirstAttach: Boolean) {

    }

}