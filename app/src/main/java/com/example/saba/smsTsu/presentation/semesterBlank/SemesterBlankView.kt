package com.example.saba.smsTsu.presentation.semesterBlank

import com.example.saba.smsTsu.mvi.view.BaseView

interface SemesterBlankView : BaseView<SemesterBlankViewState>{

    fun goToSemesterTableScreen()

    fun goToStudentBlankScreen()

    fun goToAcademicBlankScreen()

}