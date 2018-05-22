package com.example.saba.smsTsu.presentation.auth.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.auth.AuthNavigator

class GoToMainFormsScreenAction(navigator: AuthNavigator) :
        NavigatorAction<AuthNavigator>(navigator) {

    override fun commitNavigatorAction() {
        navigator.goToMainFormScreen()
    }

}