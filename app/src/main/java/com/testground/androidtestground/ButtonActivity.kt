package com.testground.androidtestground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton

class ButtonActivity : AppCompatActivity() {

    private lateinit var btnSample: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        initView()
    }

    private fun initView() {
        btnSample = findViewById<AppCompatButton>(R.id.btn_sample).apply {
            setOnClickListener { onButtonClicked() }
        }
    }

    private fun onButtonClicked() {
        btnSample.text = getString(R.string.button_txt_clicked)
    }
}