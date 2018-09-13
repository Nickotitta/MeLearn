package com.example.nick.melearn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()

        learn_math.setOnClickListener{
            val intent = Intent(this, LearnMath::class.java)
            startActivity(intent)
        }
        learn_language.setOnClickListener{
            val intent = Intent(this, LearnLanguage::class.java)
            startActivity(intent)
        }

    }
}
