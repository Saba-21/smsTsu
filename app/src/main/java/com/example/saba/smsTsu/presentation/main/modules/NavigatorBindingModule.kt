package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerActivity
import com.example.saba.smsTsu.presentation.main.MainPresenter
import com.example.saba.smsTsu.presentation.auth.AuthNavigator
import com.example.saba.smsTsu.presentation.splash.SplashNavigator
import dagger.Binds
import dagger.Module

@Module
abstract class NavigatorBindingModule {

    @Binds
    @PerActivity
    abstract fun bindSplashNavigator(presenter: MainPresenter): SplashNavigator

    @Binds
    @PerActivity
    abstract fun bindAuthNavigator(presenter: MainPresenter): AuthNavigator

}
