package com.example.saba.smsTsu.presentation.splash.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.splash.SplashNavigator

class GoToAuthScreenAction (navigator: SplashNavigator):
        NavigatorAction<SplashNavigator>(navigator){

    override fun commitNavigatorAction() {
        navigator.goToAuthScreen()
    }

}