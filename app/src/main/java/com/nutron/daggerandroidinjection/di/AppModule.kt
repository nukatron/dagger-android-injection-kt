package com.nutron.daggerandroidinjection.di

import android.app.Application
import android.content.Context
import com.nutron.daggerandroidinjection.data.ApiService
import com.nutron.daggerandroidinjection.data.ApiServiceImpl
import com.nutron.daggerandroidinjection.presentation.main.MainActivityComponent
import dagger.Module
import dagger.Provides


@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService(): ApiService = ApiServiceImpl()
}