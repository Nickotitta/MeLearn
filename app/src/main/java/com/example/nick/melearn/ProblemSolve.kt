package com.example.nick.melearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ProblemSolve : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem_solve)

        val actionBar = supportActionBar
        actionBar!!.hide()

    }
}
