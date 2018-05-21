package com.example.saba.smsTsu.presentation.get

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class ResultFragmentModule {

    @Provides
    @PerFragment
    fun provideResultPresenter(resultNavigator: ResultNavigator):
            ResultPresenter = ResultPresenter(resultNavigator)

}
