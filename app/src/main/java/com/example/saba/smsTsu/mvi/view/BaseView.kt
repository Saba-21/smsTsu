package com.example.saba.smsTsu.mvi.view

import io.reactivex.Observable


interface BaseView<ViewState: Any>{
    fun subscribe(continuousViewStateObservable: Observable<ViewState>,
                  viewStateObservable: Observable<ViewState>)
}
