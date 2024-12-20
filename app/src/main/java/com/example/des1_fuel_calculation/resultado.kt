package com.example.des1_fuel_calculation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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
        val precoSTR: String = when (preco) {
            in 0.00f..9.99f -> "0${"%.1f".format(preco)}"
            else -> "${"%.1f".format(preco)}"
        }
        val distSTR: String = when (dist) {
            in 0.00f..9.99f -> "0${"%.1f".format(dist)}"
            else -> "${"%.1f".format(dist)}"
        }
        val consSTR: String = when (cons) {
            in 0.00f..9.99f -> "0${"%.1f".format(cons)}"
            else -> "${"%.1f".format(cons)}"
        }
        val texto: String = "$precoSTR\n\n$consSTR\n\n$distSTR"
        val resultado: Float = (dist / cons) * preco
        val btn_novo = findViewById<Button>(R.id.butao)
        val btn_voltar_p = findViewById<ImageButton>(R.id.voltar_r)
        val textV = findViewById<TextView>(R.id.resumo2)
        val textR = findViewById<TextView>(R.id.texto_final)
        textV.text = texto
        textR.text = "Total cost\n$ ${"%.2f".format(resultado)}"
        btn_voltar_p.setOnClickListener {
            val intentV = Intent(this, com.example.des1_fuel_calculation.distancia::class.java)
            intentV.putExtra(KEY_CONS, cons)
            intentV.putExtra(KEY_PRECO, preco)
            startActivity(intentV)
        }
        btn_novo.setOnClickListener {
            val intent = Intent(this, com.example.des1_fuel_calculation.preco::class.java)
            startActivity(intent)
        }
    }
}