package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerFragment
import com.example.saba.smsTsu.presentation.auth.AuthFragment
import com.example.saba.smsTsu.presentation.auth.AuthFragmentModule
import com.example.saba.smsTsu.presentation.splash.SplashFragment
import com.example.saba.smsTsu.presentation.splash.SplashFragmentModule
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

}
