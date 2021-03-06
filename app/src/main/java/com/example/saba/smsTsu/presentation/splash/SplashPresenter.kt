package com.example.saba.smsTsu.presentation.splash

import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.splash.actions.GoToAuthScreenAction

class SplashPresenter(private val splashNavigator: SplashNavigator)
    : BasePresenter<SplashViewState, SplashView>() {

    override fun onFirstAttach() {

        registerPerPresenterDisposables(getView()
                .goToMainFormScreen()
                .map { GoToAuthScreenAction(splashNavigator) }
                .subscribe(this::dispatchAction))
    }

    override fun onAttach(isFirstAttach: Boolean) { }

    override fun getInitialViewState():
            SplashViewState = SplashViewState(SPLASH_VIEW_INITIAL_STATE)

}