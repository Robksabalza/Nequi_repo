package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Enviar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar)

        val intent = intent
        val total_envio = intent.getStringExtra("total_money")

        if (total_envio != null){
            print("excelente")
        }

        val text1 = findViewById<EditText>(R.id.editTextPhone)
        val boton7 = findViewById<Button>(R.id.button7)
        boton7.setOnClickListener {
            val mensaje: String = text1.text.toString()
            val envio = Intent(this, resultado_envio::class.java)
            startActivity(envio)
        }

    }
}