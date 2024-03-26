package com.example.des1_fuel_calculation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIniciar = findViewById<Button>(R.id.btn_iniciar)
        btnIniciar.setOnClickListener {
            val intent = Intent(this, preco::class.java)
            startActivity(intent)
        }

    }
}
/*
1 - Pequenos ajustes (icones) nas telas
2 - Conexões entre as telas
3 - Mostrar resultado final
4 - Compilar programa
5 - Ver como colocar um vídeo no github
*/

//            if (preco == "") {
//                Snackbar.make(edtPreco, "Preencha o preço do combustível", Snackbar.LENGTH_LONG)
//                    .show()
//            }
//mudar de tela
//intent -

//Recuperar os componentes editText
//    Criar 01 variável e associar o componente de UI (edittext-input)
//    val edtConsumo = findViewById<TextInputEditText>(R.id.consumo)
//    val edtDistancia = findViewById<TextInputEditText>(R.id.distancia)