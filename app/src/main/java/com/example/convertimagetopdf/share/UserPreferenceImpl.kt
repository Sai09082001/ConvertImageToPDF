package com.example.convertimagetopdf.share

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class UserPreferenceImpl @Inject constructor(@ApplicationContext private val context: Context)  : UserPreference {
    private val shareManager = PreferenceManager(context)
    override fun getUserToken(): String {
        return shareManager.getToken().toString()
    }

    override fun setUserToken(token: String) {
        shareManager.saveToken(token)
    }
}