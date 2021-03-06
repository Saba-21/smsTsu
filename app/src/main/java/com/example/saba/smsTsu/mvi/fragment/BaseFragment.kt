package com.example.saba.smsTsu.mvi.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.example.saba.smsTsu.mvi.presenter.BasePresenter
import com.example.saba.smsTsu.mvi.view.BaseView
import dagger.Lazy
import dagger.android.support.AndroidSupportInjection
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


abstract class BaseFragment<ViewState: Any,
            P: BasePresenter<ViewState, out BaseView<ViewState>>>:
            Fragment(){

    private var presenter: P? = null
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    protected abstract fun renderView(view: View?, savedInstanceState: Bundle?)

    protected abstract fun reflectState(state: ViewState)

    protected abstract fun onPresenterReady(presenter: P)

    fun subscribe(continuousViewStateObservable: Observable<ViewState>,
                  viewStateObservable: Observable<ViewState>) {
        compositeDisposable.add(viewStateObservable.subscribe(this::reflectState))
        compositeDisposable.add(continuousViewStateObservable.subscribe(this::reflectState))
    }

    @Inject fun setPresenter(lazy: Lazy<P>) {
        if (presenter == null) presenter = lazy.get()
        onPresenterReady(presenter!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        renderView(view, savedInstanceState)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onDestroyView() {
        presenter?.detach(false)
        compositeDisposable.dispose()
        compositeDisposable.clear()
        super.onDestroyView()
    }

    override fun onDestroy() {
        presenter?.detach(true)
        super.onDestroy()
    }
}
