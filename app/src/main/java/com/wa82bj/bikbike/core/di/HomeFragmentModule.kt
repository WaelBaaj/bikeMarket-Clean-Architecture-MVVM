package com.wa82bj.bikbike.core.di

import androidx.lifecycle.ViewModel
import com.wa82bj.bikbike.core.di.viewmodel.ViewModelKey
import com.wa82bj.bikbike.features.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
@Suppress("unused")
abstract class HomeFragmentModule {


    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}