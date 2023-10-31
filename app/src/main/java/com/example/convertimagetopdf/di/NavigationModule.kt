package com.example.convertimagetopdf.di

import com.example.convertimagetopdf.base.BaseNavigator
import com.example.convertimagetopdf.navigation.AppNavigation
import com.example.convertimagetopdf.navigation.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
abstract class NavigationModule {

    @Binds
    @ActivityScoped
    abstract fun provideBaseNavigation(navigation: AppNavigatorImpl): BaseNavigator

    @Binds
    @ActivityScoped
    abstract fun provideAppNavigation(navigation: AppNavigatorImpl): AppNavigation

}