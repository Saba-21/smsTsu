package com.example.saba.smsTsu.presentation.get.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.get.ResultNavigator

class GoToAddingScreenAction(navigator: ResultNavigator):
        NavigatorAction<ResultNavigator>(navigator){

    override fun commitNavigatorAction() {
        navigator.goToAddingScreen()
    }

}