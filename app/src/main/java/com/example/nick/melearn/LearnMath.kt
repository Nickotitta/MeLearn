package com.example.nick.melearn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_learn_math.*
import kotlinx.android.synthetic.main.activity_main.*

class LearnMath : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_math)

        val actionBar = supportActionBar
        actionBar!!.hide()

        mathPlus.setOnClickListener {
            val intent = Intent(this, MathPlus::class.java)
            startActivity(intent)
        }

        mathMinus.setOnClickListener {
            val intent = Intent(this, MathMinus::class.java)
            startActivity(intent)
        }

        mathProblemSolve.setOnClickListener {
            val intent = Intent(this, ProblemSolve::class.java)
            startActivity(intent)
        }

    }
}
