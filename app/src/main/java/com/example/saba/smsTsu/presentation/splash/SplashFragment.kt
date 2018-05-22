package com.example.saba.smsTsu.presentation.splash

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_splash.*
import java.util.concurrent.TimeUnit

class SplashFragment : BaseFragment<SplashViewState, SplashPresenter>(), SplashView {

    override fun reflectState(state: SplashViewState) { }

    override fun onPresenterReady(presenter: SplashPresenter) {
        presenter.attach(this)
    }

    override fun renderView(view: View?, savedInstanceState: Bundle?) { }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_splash_icon.startAnimation(AnimationUtils.loadAnimation(activity?.applicationContext, R.anim.anim_fade_in))
    }

    companion object {
        @JvmStatic
        fun newInstance() = SplashFragment()
    }

    override fun goToMainFormScreen():
            Observable<Boolean> = Observable.just(true).delay(2500, TimeUnit.MILLISECONDS)

    override fun goToAuthScreen():
            Observable<Boolean> = Observable.just(true).delay(2500, TimeUnit.MILLISECONDS)

}
