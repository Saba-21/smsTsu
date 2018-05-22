package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerFragment
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankFragment
import com.example.saba.smsTsu.presentation.academicBlank.AcademicBlankFragmentModule
import com.example.saba.smsTsu.presentation.auth.AuthFragment
import com.example.saba.smsTsu.presentation.auth.AuthFragmentModule
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankFragment
import com.example.saba.smsTsu.presentation.semesterBlank.SemesterBlankFragmentModule
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableFragment
import com.example.saba.smsTsu.presentation.semesterTable.SemesterTableFragmentModule
import com.example.saba.smsTsu.presentation.splash.SplashFragment
import com.example.saba.smsTsu.presentation.splash.SplashFragmentModule
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankFragment
import com.example.saba.smsTsu.presentation.studentBlank.StudentBlankFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [SplashFragmentModule::class])
    abstract fun provideSplashFragmentFactory(): SplashFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [AuthFragmentModule::class])
    abstract fun provideAuthFragmentFactory(): AuthFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [AcademicBlankFragmentModule::class])
    abstract fun provideAcademicBlankFragmentFactory(): AcademicBlankFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [SemesterBlankFragmentModule::class])
    abstract fun provideSemesterBlankFragmentFactory(): SemesterBlankFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [SemesterTableFragmentModule::class])
    abstract fun provideSemesterTableFragmentFactory(): SemesterTableFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [StudentBlankFragmentModule::class])
    abstract fun provideStudentBlankFragmentFactory(): StudentBlankFragment

}
