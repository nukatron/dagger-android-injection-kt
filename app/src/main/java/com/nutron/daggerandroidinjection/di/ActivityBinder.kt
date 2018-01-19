package com.nutron.daggerandroidinjection.di

import android.app.Activity
import com.nutron.daggerandroidinjection.presentation.main.MainActivity
import com.nutron.daggerandroidinjection.presentation.main.MainActivityComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ActivityBinder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}