package com.example.convertimagetopdf.navigation

import android.os.Bundle
import com.example.convertimagetopdf.base.BaseNavigator

interface AppNavigation : BaseNavigator {
    fun openSplashToLoginScreen( bundle: Bundle?= null)
    fun openLoginToHomeScreen( bundle: Bundle ?= null)
}