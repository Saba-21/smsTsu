package com.example.saba.smsTsu.presentation.main

import com.example.saba.smsTsu.mvi.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule{

    @Provides
    @PerActivity
    fun provideMainPresenter(): MainPresenter = MainPresenter()

}
