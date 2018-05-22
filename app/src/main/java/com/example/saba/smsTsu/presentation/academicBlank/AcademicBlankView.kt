package com.example.saba.smsTsu.presentation.academicBlank

import com.example.saba.smsTsu.mvi.view.BaseView

interface AcademicBlankView : BaseView<AcademicBlankViewState>{

    fun goToSemesterTableScreen()

    fun goToStudentBlankScreen()

    fun goToSemesterBlankScreen()

}