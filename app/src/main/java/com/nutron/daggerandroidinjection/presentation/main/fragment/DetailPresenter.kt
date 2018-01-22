package com.nutron.daggerandroidinjection.presentation.main.fragment

import com.nutron.daggerandroidinjection.data.ApiService


class DetailPresenter(val view: FragmentDetailContract.View,
                      val api: ApiService) : FragmentDetailContract.UserActionListener {

    override fun loadData() {
        api.loadData()
        view.showDetail()
        //TODO: add some stuffs
    }

}