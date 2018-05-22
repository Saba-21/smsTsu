package com.example.saba.smsTsu.presentation.semesterTable.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableNavigator

class GoToAcademicBlankScreenAction (navigator: SemesterTableNavigator):
        NavigatorAction<SemesterTableNavigator>(navigator) {

    override fun commitNavigatorAction() {
        navigator.goToAcademicBlankScreen()
    }

}