package com.example.saba.smsTsu.presentation.splash

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class SplashFragmentModule {

    @Provides
    @PerFragment
    fun provideSplashPresenter(splashNavigator: SplashNavigator):
            SplashPresenter = SplashPresenter(splashNavigator)

}