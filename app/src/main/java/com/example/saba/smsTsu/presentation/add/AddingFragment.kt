package com.example.saba.smsTsu.presentation.add

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_adding.*

class AddingFragment : BaseFragment<AddingViewState, AddingPresenter>(), AddingView {

    companion object {
        @JvmStatic
        fun newInstance(): AddingFragment = AddingFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_adding, container, false)
    }

    override fun reflectState(state: AddingViewState) {
        when (state.state) {
            ADDING_VIEW_INITIAL_STATE -> initialStateActions()
        }
    }

    private fun initialStateActions() {
        Log.e("state", "init")
    }

    override fun renderView(view: View?, savedInstanceState: Bundle?) {}

    override fun onPresenterReady(presenter: AddingPresenter) {
        presenter.attach(this)
    }

    override fun onResultNavigatorClickIntent():
            Observable<Unit> = butDrawResult.clicks()

}
