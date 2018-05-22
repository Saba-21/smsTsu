package com.example.saba.smsTsu.presentation.semesterTable.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableNavigator

class GoToStudentBlankScreenAction (navigator: SemesterTableNavigator):
        NavigatorAction<SemesterTableNavigator>(navigator) {

    override fun commitNavigatorAction() {
        navigator.goToStudentBlankScreen()
    }

}