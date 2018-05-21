package com.example.saba.smsTsu.app

import com.example.saba.smsTsu.presentation.main.MainActivity
import com.example.saba.smsTsu.presentation.main.MainActivityModule
import com.example.saba.smsTsu.mvi.scope.PerActivity
import com.example.saba.smsTsu.presentation.main.modules.FragmentBindingModule
import com.example.saba.smsTsu.presentation.main.modules.NavigatorBindingModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule{

    @PerActivity
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class,
        FragmentBindingModule::class,
        NavigatorBindingModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity

}
