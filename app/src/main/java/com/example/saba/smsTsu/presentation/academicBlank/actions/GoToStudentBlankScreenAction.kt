package com.example.saba.smsTsu.presentation.academicBlank.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankNavigator

class GoToStudentBlankScreenAction(navigator: AcademicBlankNavigator):
        NavigatorAction<AcademicBlankNavigator>(navigator){

    override fun commitNavigatorAction() {
        navigator.goToStudentBlankScreen()
    }

}