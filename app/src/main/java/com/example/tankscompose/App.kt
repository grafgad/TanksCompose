package com.example.tankscompose

import android.app.Application
import com.example.tankscompose.di.ApplicationComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        appComponent = DaggerApplicationComponent.builder().build
    }

    companion object {
        var appComponent: ApplicationComponent? = null
        internal lateinit var INSTANCE: App
            private set
    }
}