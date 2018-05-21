package com.example.saba.smsTsu.presentation.get

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.get.actions.*

class ResultPresenter(private val resultNavigator: ResultNavigator) :
        BasePresenter<ResultViewState, ResultView>() {

    override fun getInitialViewState():
            ResultViewState = ResultViewState(RESULT_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {}

    override fun onAttach(isFirstAttach: Boolean) {
        registerPerViewDisposables(
                getView().onAddingNavigatorClickIntent()
                        .map { GoToAddingScreenAction(resultNavigator) }
                        .subscribe(this::dispatchAction))
    }

}
