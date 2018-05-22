package com.example.saba.smsTsu.presentation.academicBlank

import com.example.saba.smsTsu.mvi.presenter.BasePresenter

class AcademicBlankPresenter(private val academicBlankNavigator: AcademicBlankNavigator) :
        BasePresenter<AcademicBlankViewState, AcademicBlankView>() {

    override fun getInitialViewState(): AcademicBlankViewState = AcademicBlankViewState(ACADEMIC_BLANK_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {

    }

    override fun onAttach(isFirstAttach: Boolean) {

    }
}