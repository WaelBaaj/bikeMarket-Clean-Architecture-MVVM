package com.wa82bj.bikbike.core.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.wa82bj.bikbike.BikeApplication
import com.wa82bj.bikbike.BuildConfig
import com.wa82bj.bikbike.core.di.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    @Singleton
    fun provideApplicationContext(app: BikeApplication): Context = app


    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://bikeindex.org:443/api/v3/")
            .client(createHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun createHttpClient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }
        return okHttpClientBuilder.build()
    }
}