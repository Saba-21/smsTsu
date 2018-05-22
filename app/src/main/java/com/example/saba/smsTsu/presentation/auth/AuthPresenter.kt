package com.example.saba.smsTsu.presentation.auth

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.auth.actions.GoToMainFormsScreenAction

class AuthPresenter(private val authNavigator: AuthNavigator)
    : BasePresenter<AuthViewState, AuthView>() {

    override fun getInitialViewState(): AuthViewState = AuthViewState(SPLASH_VIEW_INITIAL_STATE)

    override fun onFirstAttach() {
        registerPerPresenterDisposables(getView()
                .goToMainFormScreen()
                .map { GoToMainFormsScreenAction(authNavigator) }
                .subscribe(this::dispatchAction)

        )
    }

    override fun onAttach(isFirstAttach: Boolean) {}
}