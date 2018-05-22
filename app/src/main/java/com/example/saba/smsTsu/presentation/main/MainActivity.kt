package com.example.saba.smsTsu.presentation.main

import android.os.Bundle
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.activity.BaseActivity
import com.example.saba.smsTsu.presentation.auth.AuthFragment
import com.example.saba.smsTsu.presentation.splash.SplashFragment

class MainActivity : BaseActivity<MainViewState, MainPresenter>(), MainView {

    override fun reflectState(state: MainViewState) {
        when(state.state){
            MAIN_VIEW_DRAW_SPLASH_SCREEN_STATE -> onSplashScreenNavigationState()

            MAIN_VIEW_DRAW_AUTH_SCREEN_STATE -> onAuthScreenNavigationState()
        }
    }

    override fun onPresenterReady(presenter: MainPresenter) {
        presenter.attach(this)
    }

    override fun renderView(savedInstanceState: Bundle?) { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun onSplashScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, SplashFragment.newInstance())
                .commit()
    }

    private fun onAuthScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, AuthFragment.newInstance())
                .commit()
    }

}
