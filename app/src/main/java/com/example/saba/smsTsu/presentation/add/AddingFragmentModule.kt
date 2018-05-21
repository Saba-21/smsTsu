package com.example.saba.smsTsu.presentation.add

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class AddingFragmentModule{

    @Provides
    @PerFragment
    fun provideAddingPresenter(addingNavigator: AddingNavigator):
            AddingPresenter = AddingPresenter(addingNavigator)

}
