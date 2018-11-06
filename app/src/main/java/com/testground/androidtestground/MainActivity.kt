package com.testground.androidtestground

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        findViewById<AppCompatButton>(R.id.btn_hello_world_activity).setOnClickListener {
            startActivity(Intent(this, HelloWorldActivity::class.java))
        }
        findViewById<AppCompatButton>(R.id.btn_image_activity).setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java))
        }
        findViewById<AppCompatButton>(R.id.btn_button_activity).setOnClickListener {
            startActivity(Intent(this, ButtonActivity::class.java))
        }
        findViewById<AppCompatButton>(R.id.btn_recyclerview_activity).setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
    }
}
