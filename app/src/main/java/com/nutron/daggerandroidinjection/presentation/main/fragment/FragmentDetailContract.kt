package com.nutron.daggerandroidinjection.presentation.main.fragment


interface FragmentDetailContract {

    interface View {
        fun showDetail()
    }

    interface UserActionListener {
        fun onLoadData()
    }
}