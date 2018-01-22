package com.nutron.daggerandroidinjection.presentation.main.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nutron.daggerandroidinjection.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


class DetailFragment : Fragment(), FragmentDetailContract.View {


    @Inject
    lateinit var presenter: FragmentDetailContract.UserActionListener

    companion object {
        fun newInstance() : DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadData()
    }

    override fun showDetail() {
        // TODO change body of created functions use File | Settings | File Templates.
    }

}