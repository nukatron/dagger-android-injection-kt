package com.nutron.daggerandroidinjection.presentation.main

import com.nutron.daggerandroidinjection.data.ApiService
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    /**
     * We create our MainActivityComponent with our <MainActivity> class.
     * So dagger will attach our activity to it’s graph that why we can use it.
     */
    @Provides
    fun provideMainView(mainActivity: MainActivity): MainContract.View = mainActivity

    @Provides
    fun privatePresenter(view: MainContract.View, api: ApiService): MainContract.UserActionListener {
        return MainPresenter(view, api)
    }

}