package com.example.saba.smsTsu.presentation.auth

import com.example.saba.smsTsu.mvi.view.BaseView
import io.reactivex.Observable

interface AuthView : BaseView<AuthViewState> {

    fun goToMainFormScreen(): Observable<Any>

}