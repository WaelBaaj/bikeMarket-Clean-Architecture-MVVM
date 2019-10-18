package com.wa82bj.bikbike.core.di

import androidx.lifecycle.ViewModel
import com.wa82bj.bikbike.core.di.viewmodel.ViewModelKey
import com.wa82bj.bikbike.features.favorite.FavoriteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
@Suppress("unused")
abstract class FavoriteFragmentModule {


    @Binds
    @IntoMap
    @ViewModelKey(FavoriteViewModel::class)
    abstract fun bindFavoriteViewModel(favoriteViewModel: FavoriteViewModel): ViewModel
}