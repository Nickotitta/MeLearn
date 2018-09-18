package com.example.nick.melearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MathMinus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_minus)

        val actionBar = supportActionBar
        actionBar!!.hide()
    }
}
