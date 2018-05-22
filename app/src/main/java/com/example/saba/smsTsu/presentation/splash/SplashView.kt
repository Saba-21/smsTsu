package com.example.saba.smsTsu.presentation.splash

import com.example.saba.smsTsu.mvi.view.BaseView
import io.reactivex.Observable

interface SplashView : BaseView<SplashViewState>{

    fun goToMainFormScreen(): Observable<Boolean>

}