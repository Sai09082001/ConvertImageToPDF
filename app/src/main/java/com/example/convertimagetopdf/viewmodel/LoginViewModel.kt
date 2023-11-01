package com.example.convertimagetopdf.viewmodel

import android.content.Context
import com.example.convertimagetopdf.base.BaseViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class LoginViewModel @Inject constructor(@ApplicationContext private val context: Context) : BaseViewModel(){
}