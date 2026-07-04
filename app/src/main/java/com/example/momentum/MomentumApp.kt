package com.example.momentum

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MomentumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize things like Firebase here if needed
    }
}
