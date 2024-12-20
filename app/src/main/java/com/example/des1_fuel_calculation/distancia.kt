package com.example.des1_fuel_calculation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_DIST = "dist.Dist"

class distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distancia)
        val btn_calc = findViewById<Button>(R.id.butao)
        val inputbox_dist = findViewById<TextInputEditText>(R.id.distancia)
        val btn_voltar_p = findViewById<ImageButton>(R.id.voltar_d)
        val preco = intent.getFloatExtra(KEY_PRECO, 0f)
        val consumo = intent.getFloatExtra(KEY_CONS, 0f)
        btn_voltar_p.setOnClickListener {
            val intentV = Intent(this, com.example.des1_fuel_calculation.consumo::class.java)
            intentV.putExtra(KEY_PRECO, preco)
            startActivity(intentV)
        }
        btn_calc.setOnClickListener {
            if (inputbox_dist.text.toString().isBlank()) {
                Snackbar.make(
                    inputbox_dist,
                    "Preencha a distancia a ser percorrida",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val intentD = Intent(this, resultado::class.java)
                intentD.putExtra(KEY_DIST, inputbox_dist.text.toString().toFloat())
                intentD.putExtra(KEY_PRECO, preco)
                intentD.putExtra(KEY_CONS, consumo)
                startActivity(intentD)
            }
        }
    }
}