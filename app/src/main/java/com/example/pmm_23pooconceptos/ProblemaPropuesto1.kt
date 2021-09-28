package com.example.pmm_23pooconceptos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val alumno = Alumno("Tom",7.8)
        val tvResult = findViewById<TextView>(R.id.tvResult30)
        tvResult.text = alumno.toString()
    }
}