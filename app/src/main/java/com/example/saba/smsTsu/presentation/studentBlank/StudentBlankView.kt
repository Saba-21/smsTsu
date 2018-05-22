package com.example.saba.smsTsu.presentation.studentBlank

import com.example.saba.smsTsu.mvi.view.BaseView

interface StudentBlankView : BaseView<StudentBlankViewState>{

    fun goToAcademicBlankScreen()

    fun goToSemesterBlankScreen()

    fun goToSemesterTableScreen()

}