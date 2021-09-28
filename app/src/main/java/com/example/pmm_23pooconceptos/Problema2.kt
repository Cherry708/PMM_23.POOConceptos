package com.example.pmm_23pooconceptos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val tvResult = findViewById<TextView>(R.id.tvResult20)

        val triangulo = Triangulo(2.2,3.6,2.2)
        val result = "Lado mayor: ${triangulo.ladoMayor()}, es equilatero: ${triangulo.esEquilatero()}"
        tvResult.text = result
    }
}