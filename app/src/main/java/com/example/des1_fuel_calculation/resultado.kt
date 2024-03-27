package com.example.des1_fuel_calculation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val preco = intent.getFloatExtra(KEY_PRECO, 0f)
        val dist = intent.getFloatExtra(KEY_DIST, 0f)
        val cons = intent.getFloatExtra(KEY_CONS, 0f)
        val texto: String = "$preco\n\n$dist\n\n$cons"
        val resultado: Float = (dist / cons) * preco
        val btn_novo = findViewById<Button>(R.id.butao)
        val textV = findViewById<TextView>(R.id.resumo2)
        val textR = findViewById<TextView>(R.id.texto_final)
        textV.text = texto
        textR.text = "Custo Total\nR$ $resultado"



        btn_novo.setOnClickListener {


        }
    }
}