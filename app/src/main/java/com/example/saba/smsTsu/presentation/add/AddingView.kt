package com.example.saba.smsTsu.presentation.add

import com.example.saba.smsTsu.mvi.view.BaseView
import io.reactivex.Observable

interface AddingView: BaseView<AddingViewState> {

    fun onResultNavigatorClickIntent(): Observable<Unit>

}
