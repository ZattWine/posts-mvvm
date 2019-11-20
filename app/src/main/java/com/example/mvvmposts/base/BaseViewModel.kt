package com.example.mvvmposts.base

import androidx.lifecycle.ViewModel
import com.example.mvvmposts.di.component.DaggerViewModelInjector
import com.example.mvvmposts.di.component.ViewModelInjector
import com.example.mvvmposts.di.module.NetworkModule
import com.example.mvvmposts.ui.post.PostListViewModel
import com.example.mvvmposts.ui.post.PostViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when(this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}