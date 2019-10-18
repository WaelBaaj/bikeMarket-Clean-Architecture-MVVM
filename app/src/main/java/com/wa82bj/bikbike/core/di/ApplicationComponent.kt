package com.wa82bj.bikbike.core.di

import com.wa82bj.bikbike.BikeApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class])
interface ApplicationComponent : AndroidInjector<BikeApplication> {
    override fun inject(instance: BikeApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: BikeApplication): Builder

        fun build(): ApplicationComponent
    }
}