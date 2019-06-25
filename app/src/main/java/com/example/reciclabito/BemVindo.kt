package com.example.reciclabito

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BemVindo : AppCompatActivity() {

    private val NEXT_ACTIVITY_REQUEST_CODE = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        Thread.sleep(1000)
        val nextIntent = Intent(this, Menu1::class.java)
        startActivityForResult(nextIntent, NEXT_ACTIVITY_REQUEST_CODE)

    }
}


