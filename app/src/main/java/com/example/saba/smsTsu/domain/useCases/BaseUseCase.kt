package com.example.saba.smsTsu.domain.useCases

import com.example.saba.smsTsu.domain.repository.Repository
import io.reactivex.Observable

abstract class BaseUseCase<in A, B>(protected val repository: Repository) {

    abstract fun createObservable(arg: A): Observable<B>

}