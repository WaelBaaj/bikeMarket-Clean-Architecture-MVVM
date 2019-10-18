package com.wa82bj.bikbike.features.favorite

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wa82bj.bikbike.R
import dagger.android.support.DaggerFragment

class FavoriteFragment :  DaggerFragment() {

    companion object {
        fun newInstance() = FavoriteFragment()
    }

    private lateinit var viewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favorite_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FavoriteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
