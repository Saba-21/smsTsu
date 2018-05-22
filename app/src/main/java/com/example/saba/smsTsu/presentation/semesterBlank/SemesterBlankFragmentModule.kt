package com.example.saba.smsTsu.presentation.semesterBlank

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class SemesterBlankFragmentModule {

    @Provides
    @PerFragment
    fun provideSemesterBlankPresenter(semesterBlankNavigator: SemesterBlankNavigator):
            SemesterBlankPresenter = SemesterBlankPresenter(semesterBlankNavigator)

}