package com.nutron.daggerandroidinjection.presentation.main.di

import com.nutron.daggerandroidinjection.data.ApiService
import com.nutron.daggerandroidinjection.presentation.main.fragment.DetailPresenter
import com.nutron.daggerandroidinjection.presentation.main.fragment.DetailFragment
import com.nutron.daggerandroidinjection.presentation.main.fragment.FragmentDetailContract
import dagger.Module
import dagger.Provides

@Module
class DetailFragmentModule {

    /**
     * We create our FragmentComponent with our <DetailFragment> class.
     * So dagger will attach our fragment to it’s graph that why we can use it.
     */
    @Provides
    fun provideView(fragment: DetailFragment) : FragmentDetailContract.View = fragment

    @Provides
    fun providePresenter(view: FragmentDetailContract.View,
                         api: ApiService) : FragmentDetailContract.UserActionListener {
        return DetailPresenter(view, api)
    }
}