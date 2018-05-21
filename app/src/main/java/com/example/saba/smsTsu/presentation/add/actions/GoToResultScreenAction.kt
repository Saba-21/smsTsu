package com.example.saba.smsTsu.presentation.add.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.add.AddingNavigator

class GoToResultScreenAction(navigator: AddingNavigator):
        NavigatorAction<AddingNavigator>(navigator){

    override fun commitNavigatorAction() {
        navigator.goToResultScreen()
    }

}