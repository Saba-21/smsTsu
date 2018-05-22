package com.example.saba.smsTsu.presentation.main.modules

import com.example.saba.smsTsu.mvi.scope.PerFragment
import com.example.saba.smsTsu.presentation.add.AddingFragment
import com.example.saba.smsTsu.presentation.add.AddingFragmentModule
import com.example.saba.smsTsu.presentation.get.ResultFragment
import com.example.saba.smsTsu.presentation.get.ResultFragmentModule
import com.example.saba.smsTsu.presentation.splash.SplashFragment
import com.example.saba.smsTsu.presentation.splash.SplashFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [ResultFragmentModule::class])
    abstract fun provideResultFragmentFactory(): ResultFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [AddingFragmentModule::class])
    abstract fun provideAddingFragmentFactory(): AddingFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [SplashFragmentModule::class])
    abstract fun provideSplashFragmentFactory(): SplashFragment

}
