package com.example.saba.smsTsu.mvi.actions


abstract class NavigatorAction<out Navigator>(protected val navigator: Navigator): Action {

    abstract fun commitNavigatorAction()

}
