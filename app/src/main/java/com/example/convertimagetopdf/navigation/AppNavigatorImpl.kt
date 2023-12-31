package com.example.convertimagetopdf.navigation

import android.os.Bundle
import com.example.convertimagetopdf.R
import com.example.convertimagetopdf.base.BaseNavigatorImpl
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class AppNavigatorImpl @Inject constructor() : BaseNavigatorImpl(), AppNavigation {
    override fun openSplashToLoginScreen(bundle: Bundle? ) {
        openScreen(R.id.action_splash_to_loginFragment, bundle)
    }

    override fun openLoginToHomeScreen(bundle: Bundle?) {
        openScreen(R.id.action_login_to_homeFragment, bundle)
    }

}