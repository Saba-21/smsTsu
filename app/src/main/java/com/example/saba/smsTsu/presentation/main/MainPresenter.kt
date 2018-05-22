package com.example.saba.smsTsu.presentation.main

import android.util.Log
import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.presentation.auth.AuthNavigator
import com.example.saba.smsTsu.presentation.main.actions.DrawAuthScreenAction
import com.example.saba.smsTsu.presentation.splash.SplashNavigator

class MainPresenter: BasePresenter<MainViewState, MainView>(), SplashNavigator , AuthNavigator{

    override fun getInitialViewState():
            MainViewState = MainViewState(MAIN_VIEW_DRAW_SPLASH_SCREEN_STATE)

    override fun onFirstAttach() { }

    override fun onAttach(isFirstAttach: Boolean) { }

    override fun goToMainFormScreen() {
        Log.e("goToMainFormScreen", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")//todo
    }

    override fun goToAuthScreen() {
        dispatchAction(DrawAuthScreenAction())
    }

}
