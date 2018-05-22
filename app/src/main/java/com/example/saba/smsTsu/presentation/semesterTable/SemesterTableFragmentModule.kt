package com.example.saba.smsTsu.presentation.semesterTable

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class SemesterTableFragmentModule {

    @Provides
    @PerFragment
    fun provideSemesterTablePresenter(semesterTableNavigator: SemesterTableNavigator):
            SemesterTablePresenter = SemesterTablePresenter(semesterTableNavigator)

}