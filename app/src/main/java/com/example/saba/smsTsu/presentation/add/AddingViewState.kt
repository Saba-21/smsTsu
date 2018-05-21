package com.example.saba.smsTsu.presentation.add

const val ADDING_VIEW_INITIAL_STATE = 1
const val ADDING_VIEW_LOADING_STATE = 2
const val ADDING_VIEW_SUCCESS_STATE = 3
const val ADDING_VIEW_ERROR_STATE = 4

data class AddingViewState(val state: Int)