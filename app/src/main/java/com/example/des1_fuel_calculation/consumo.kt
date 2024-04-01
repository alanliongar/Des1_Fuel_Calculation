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

const val KEY_CONS = "consumo.Consumo"

class consumo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo)
        val btn_prox_cons = findViewById<Button>(R.id.butao)
        val inputbox = findViewById<TextInputEditText>(R.id.consumo)
        val preco = intent.getFloatExtra(KEY_PRECO, 0f)
        val btn_voltar_p = findViewById<ImageButton>(R.id.voltar_c)
        btn_voltar_p.setOnClickListener {
            val intentV = Intent(this, com.example.des1_fuel_calculation.preco::class.java)
            startActivity(intentV)
        }
        btn_prox_cons.setOnClickListener {
            if (inputbox.text.toString().isBlank()) {
                Snackbar.make(
                    inputbox,
                    "Preencha a informação do consumo do veículo",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                //val consumoo: Float = inputbox.text.toString().toFloat()
                val intentC = Intent(this, distancia::class.java)
                intentC.putExtra(KEY_CONS, inputbox.text.toString().toFloat())
                intentC.putExtra(KEY_PRECO, preco)
                startActivity(intentC)
            }
        }
    }

}