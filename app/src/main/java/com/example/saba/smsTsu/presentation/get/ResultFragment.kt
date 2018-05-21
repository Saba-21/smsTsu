package com.example.saba.smsTsu.presentation.get

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.example.saba.smsTsu.presentation.add.ADDING_VIEW_INITIAL_STATE
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : BaseFragment<ResultViewState, ResultPresenter>(), ResultView {

    companion object {
        @JvmStatic
        fun newInstance(): ResultFragment = ResultFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun reflectState(state: ResultViewState) {
        when (state.state) {
            ADDING_VIEW_INITIAL_STATE -> initialStateActions()
        }
    }

    private fun initialStateActions() {
        Log.e("state", "init")
    }

    override fun renderView(view: View?, savedInstanceState: Bundle?) {}

    override fun onPresenterReady(presenter: ResultPresenter) {
        presenter.attach(this)
    }

    override fun onAddingNavigatorClickIntent():
            Observable<Unit> = butDrawAdding.clicks()

}
