package com.wa82bj.bikbike.core.di

import com.wa82bj.bikbike.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
interface ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity
}