package com.example.pmm_23pooconceptos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persona = Persona("Ruben",19)


        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val result = "Detalles: ${persona.getDetails()}, mayor de edad: ${persona.isOverAge()}"
        tvResult.text = result
    }
}