package com.example.saba.smsTsu.presentation.add

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.add.actions.*

class AddingPresenter(private val addingNavigator: AddingNavigator) :
        BasePresenter<AddingViewState, AddingView>() {

    override fun getInitialViewState():
            AddingViewState = AddingViewState(ADDING_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {}

    override fun onAttach(isFirstAttach: Boolean) {
        registerPerViewDisposables(
                getView().onResultNavigatorClickIntent()
                        .map { GoToResultScreenAction(addingNavigator) }
                        .subscribe(this::dispatchAction))
    }
}


