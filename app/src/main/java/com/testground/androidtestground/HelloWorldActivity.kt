package com.testground.androidtestground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class HelloWorldActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
    }
}