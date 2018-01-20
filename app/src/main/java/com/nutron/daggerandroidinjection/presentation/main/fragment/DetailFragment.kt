package com.nutron.daggerandroidinjection.presentation.main.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nutron.daggerandroidinjection.R


class DetailFragment : Fragment(), FragmentDetailContract.View {


    companion object {
        fun newInstance() : DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun showDetail() {
        // TODO change body of created functions use File | Settings | File Templates.
    }

}