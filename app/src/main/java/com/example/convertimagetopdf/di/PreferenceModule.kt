package com.example.convertimagetopdf.di

import com.example.convertimagetopdf.share.UserPreference
import com.example.convertimagetopdf.share.UserPreferenceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
abstract class PreferenceModule {

    @Binds
    @ActivityScoped
    abstract fun provideBasePreference(preference: UserPreferenceImpl): UserPreference
}