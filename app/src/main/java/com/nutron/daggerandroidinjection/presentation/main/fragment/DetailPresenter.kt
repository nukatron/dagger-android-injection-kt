package com.nutron.daggerandroidinjection.presentation.main.fragment

import com.nutron.daggerandroidinjection.data.ApiService
import com.nutron.daggerandroidinjection.presentation.main.fragment.FragmentDetailContract


class DetailPresenter(val view: FragmentDetailContract.View,
                      val api: ApiService) : FragmentDetailContract.UserActionListener {

    override fun onLoadData() {
        api.loadData()
        view.showDetail()
        //TODO: add some stuffs
    }

}