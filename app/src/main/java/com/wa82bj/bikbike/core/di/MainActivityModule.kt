package com.wa82bj.bikbike.core.di

import com.wa82bj.bikbike.features.favorite.FavoriteFragment
import com.wa82bj.bikbike.features.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
interface MainActivityModule {


    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [FavoriteFragmentModule::class])
    fun contributeFavoriteFragment(): FavoriteFragment

}