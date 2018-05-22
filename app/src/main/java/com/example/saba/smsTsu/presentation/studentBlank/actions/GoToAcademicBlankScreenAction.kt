package com.example.saba.smsTsu.presentation.studentBlank.actions

import com.example.saba.smsTsu.mvi.actions.NavigatorAction
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankNavigator

class GoToAcademicBlankScreenAction (navigator : StudentBlankNavigator) :
        NavigatorAction<StudentBlankNavigator>(navigator) {

    override fun commitNavigatorAction() {
        navigator.goToAcademicBlankScreen()
    }

}