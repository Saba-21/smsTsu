package com.example.saba.smsTsu.presentation.semesterTable

import com.example.saba.smsTsu.mvi.view.BaseView

interface SemesterTableView : BaseView<SemesterTableViewState>{

    fun goToStudentBlankScreen()

    fun goToAcademicBlankScreen()

    fun goToSemesterBlankScreen()


}