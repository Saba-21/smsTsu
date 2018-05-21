package com.example.saba.smsTsu.presentation.get

const val RESULT_VIEW_INITIAL_STATE = 1
const val RESULT_VIEW_LOADING_STATE = 2
const val RESULT_VIEW_SUCCESS_STATE = 3
const val RESULT_VIEW_ERROR_STATE = 4

data class ResultViewState(val state: Int)