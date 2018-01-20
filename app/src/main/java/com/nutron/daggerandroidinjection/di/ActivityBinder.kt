package com.nutron.daggerandroidinjection.di

import com.nutron.daggerandroidinjection.presentation.main.MainActivity
import com.nutron.daggerandroidinjection.presentation.main.di.MainFragmentBinder
import com.nutron.daggerandroidinjection.presentation.main.di.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBinder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainFragmentBinder::class])
    abstract fun bindMainActivity(): MainActivity

//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity::class)
//    abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}
