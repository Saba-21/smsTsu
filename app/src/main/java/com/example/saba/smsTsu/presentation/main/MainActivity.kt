package com.example.saba.smsTsu.presentation.main

import android.os.Bundle
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.activity.BaseActivity
import com.example.saba.smsTsu.presentation.add.AddingFragment
import com.example.saba.smsTsu.presentation.get.ResultFragment

class MainActivity : BaseActivity<MainViewState, MainPresenter>(), MainView {

    override fun reflectState(state: MainViewState) {
        when(state.state){
            MAIN_VIEW_DRAW_ADDING_SCREEN_STATE ->  onAddingScreenNavigationState()

            MAIN_VIEW_DRAW_RESULT_SCREEN_STATE -> onResultScreenNavigationState()
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

    private fun onResultScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, ResultFragment.newInstance())
                .commit()
    }

    private fun onAddingScreenNavigationState() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, AddingFragment.newInstance())
                .commit()
    }

}
