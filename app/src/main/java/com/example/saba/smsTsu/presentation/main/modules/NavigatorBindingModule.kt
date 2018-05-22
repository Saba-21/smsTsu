package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerActivity
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankNavigator
import com.example.saba.smsTsu.presentation.main.MainPresenter
import com.example.saba.smsTsu.presentation.auth.AuthNavigator
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankNavigator
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableNavigator
import com.example.saba.smsTsu.presentation.splash.SplashNavigator
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankNavigator
import dagger.Binds
import dagger.Module

@Module
abstract class NavigatorBindingModule {

    @Binds
    @PerActivity
    abstract fun bindSplashNavigator(presenter: MainPresenter): SplashNavigator

    @Binds
    @PerActivity
    abstract fun bindAuthNavigator(presenter: MainPresenter): AuthNavigator

    @Binds
    @PerActivity
    abstract fun bindAcademicBlankNavigator(presenter: MainPresenter): AcademicBlankNavigator

    @Binds
    @PerActivity
    abstract fun bindSemesterBlankNavigator(presenter: MainPresenter): SemesterBlankNavigator

    @Binds
    @PerActivity
    abstract fun bindSemesterTableNavigator(presenter: MainPresenter): SemesterTableNavigator

    @Binds
    @PerActivity
    abstract fun bindStudentBlankNavigator(presenter: MainPresenter): StudentBlankNavigator


}
