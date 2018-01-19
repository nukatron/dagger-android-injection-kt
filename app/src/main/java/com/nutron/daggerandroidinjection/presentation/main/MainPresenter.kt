package com.nutron.daggerandroidinjection.presentation.main

import com.nutron.daggerandroidinjection.data.ApiService


class MainPresenter(val view: MainContract.View,
                    val api: ApiService) : MainContract.UserActionListener {


    override fun refresh() {
        view.showLoading()
        api.loadData()
        //TODO: do some stuffs
    }
}