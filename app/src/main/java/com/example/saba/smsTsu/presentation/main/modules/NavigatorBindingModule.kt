package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerActivity
import com.example.saba.smsTsu.presentation.main.MainPresenter
import com.example.saba.smsTsu.presentation.add.AddingNavigator
import com.example.saba.smsTsu.presentation.auth.AuthNavigator
import com.example.saba.smsTsu.presentation.get.ResultNavigator
import com.example.saba.smsTsu.presentation.splash.SplashNavigator
import dagger.Binds
import dagger.Module

@Module
abstract class NavigatorBindingModule {

    @Binds
    @PerActivity
    abstract fun bindAddingNavigator(presenter: MainPresenter): AddingNavigator

    @Binds
    @PerActivity
    abstract fun bindResultsNavigator(presenter: MainPresenter): ResultNavigator

    @Binds
    @PerActivity
    abstract fun bindSplashNavigator(presenter: MainPresenter): SplashNavigator

    @Binds
    @PerActivity
    abstract fun bindAuthNavigator(presenter: MainPresenter): AuthNavigator

}
