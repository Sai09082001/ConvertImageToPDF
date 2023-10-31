package com.example.convertimagetopdf.viewmodel

import android.content.Context
import com.example.convertimagetopdf.base.BaseViewModel
import com.example.convertimagetopdf.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) : BaseViewModel() {
    val stateSplash =  SingleLiveEvent<Boolean>()
    init {
        stateSplash.value = true
    }
}