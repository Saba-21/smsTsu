package com.example.saba.smsTsu.presentation.studentBlank

import com.example.saba.smsTsu.mvi.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class StudentBlankFragmentModule {

    @Provides
    @PerFragment
    fun provideStudentBlankPresenter(studentBlankNavigator: StudentBlankNavigator):
            StudentBlankPresenter = StudentBlankPresenter(studentBlankNavigator)

}