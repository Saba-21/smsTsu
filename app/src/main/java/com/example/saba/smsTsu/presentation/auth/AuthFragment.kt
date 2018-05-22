package com.example.saba.smsTsu.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R
import com.example.saba.smsTsu.mvi.fragment.BaseFragment
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_auth.*

class AuthFragment : BaseFragment<AuthViewState, AuthPresenter>(), AuthView {

    override fun renderView(view: View?, savedInstanceState: Bundle?) {}

    override fun reflectState(state: AuthViewState) {}

    override fun onPresenterReady(presenter: AuthPresenter) {
        presenter.attach(this)
    }

    override fun goToMainFormScreen(): Observable<Any> = RxView.clicks(tv_login_button)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    companion object { @JvmStatic fun newInstance() = AuthFragment() }
}
