package com.example.saba.smsTsu.presentation.get

import com.example.saba.smsTsu.mvi.view.BaseView
import io.reactivex.Observable

interface ResultView: BaseView<ResultViewState> {

    fun onAddingNavigatorClickIntent(): Observable<Unit>

}
