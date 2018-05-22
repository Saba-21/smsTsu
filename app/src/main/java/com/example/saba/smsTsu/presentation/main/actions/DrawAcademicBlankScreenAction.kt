package com.example.saba.smsTsu.presentation.main.actions

import com.example.saba.smsTsu.mvi.actions.ViewStateAction
import com.example.saba.smsTsu.presentation.main.MAIN_VIEW_DRAW_ACADEMIC_BLANK_SCREEN_STATE
import com.example.saba.smsTsu.presentation.main.MainViewState

class DrawAcademicBlankScreenAction : ViewStateAction<MainViewState>() {

    override fun newState(oldState: MainViewState):
            MainViewState = oldState.copy(state = MAIN_VIEW_DRAW_ACADEMIC_BLANK_SCREEN_STATE)

}
