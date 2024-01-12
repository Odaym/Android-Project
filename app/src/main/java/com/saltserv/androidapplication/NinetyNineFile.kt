package com.saltserv.androidapplication

import android.app.Application
import android.util.Log

class NinetyNineFile: Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d("TAG", "onCreate: this is a log")
    }
}