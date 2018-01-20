package com.nutron.daggerandroidinjection.presentation.main.di

import com.nutron.daggerandroidinjection.presentation.main.fragment.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainFragmentBinder {

    @ContributesAndroidInjector(modules = [DetailFragmentModule::class])
    abstract fun bindDetailFragment() : DetailFragment

}