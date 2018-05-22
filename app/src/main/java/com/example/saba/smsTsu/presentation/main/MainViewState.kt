package com.example.saba.smsTsu.presentation.main


const val MAIN_VIEW_DRAW_SPLASH_SCREEN_STATE: Int = 1
const val MAIN_VIEW_DRAW_AUTH_SCREEN_STATE: Int = 2
const val MAIN_VIEW_DRAW_STUDENT_BLANK_SCREEN_STATE: Int = 3
const val MAIN_VIEW_DRAW_SEMESTER_TABLE_SCREEN_STATE: Int = 4
const val MAIN_VIEW_DRAW_SEMESTER_BLANK_SCREEN_STATE: Int = 5
const val MAIN_VIEW_DRAW_ACADEMIC_BLANK_SCREEN_STATE: Int = 6

data class MainViewState(val state: Int)
