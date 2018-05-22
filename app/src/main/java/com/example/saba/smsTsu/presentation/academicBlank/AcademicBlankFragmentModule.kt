package com.example.saba.smsTsu.presentation.academicBlank

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class AcademicBlankFragmentModule {

    @Provides
    @PerFragment
    fun provideAcademicBlankPresenter(academicBlankNavigator: AcademicBlankNavigator):
            AcademicBlankPresenter = AcademicBlankPresenter(academicBlankNavigator)

}