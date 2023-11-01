package com.example.convertimagetopdf.share

interface UserPreference {
    fun getUserToken(): String
    fun setUserToken(token: String)

}