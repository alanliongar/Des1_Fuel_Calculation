package com.example.des1_fuel_calculation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_PRECO = "preco.Preco"

class preco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preco)
        val btn_prox = findViewById<Button>(R.id.butaoP)
        val edtPreco = findViewById<TextInputEditText>(R.id.precoP)

        btn_prox.setOnClickListener {
            if (edtPreco.text.toString().isBlank()) {
                Snackbar.make(edtPreco, "Preencha o preço do combustível", Snackbar.LENGTH_LONG)
                    .show()
            } else {
                val preco: Float = edtPreco.text.toString().toFloat()
                val intent = Intent(this, consumo::class.java)
                intent.putExtra(KEY_PRECO, preco)
                startActivity(intent)
            }
        }
    }
}