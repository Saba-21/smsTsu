package com.example.saba.smsTsu.presentation.auth

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class AuthFragmentModule {

    @Provides
    @PerFragment
    fun provideAuthPresenter(authNavigator: AuthNavigator):
            AuthPresenter = AuthPresenter(authNavigator)

}