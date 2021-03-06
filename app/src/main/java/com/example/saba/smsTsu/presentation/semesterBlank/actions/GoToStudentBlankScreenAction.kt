package com.example.saba.smsTsu.presentation.semesterBlank.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankNavigator

class GoToStudentBlankScreenAction(navigator: SemesterBlankNavigator):
        NavigatorAction<SemesterBlankNavigator>(navigator) {

    override fun commitNavigatorAction() {
        navigator.goToStudentBlankScreen()
    }

}