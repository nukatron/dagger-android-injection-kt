package com.nutron.daggerandroidinjection.di

import android.app.Application
import android.content.Context
import com.nutron.daggerandroidinjection.data.ApiService
import com.nutron.daggerandroidinjection.data.ApiServiceImpl
import dagger.Module
import dagger.Provides


//@Module(subcomponents = [MainActivityComponent::class])
@Module
class AppModule {

    /**
     * We create our AppComponent with our <MainApplication> class.
     * At that time we use @BindsInstance to inject Application instance to AppComponent.
     * So, that is a reason why Dagger know Application without passing it via constructor.
     */
    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService(): ApiService = ApiServiceImpl()
}