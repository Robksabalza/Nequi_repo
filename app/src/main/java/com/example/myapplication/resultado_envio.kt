package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resultado_envio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_envio)

        val boton13 = findViewById<Button>(R.id.button13)
        boton13.setOnClickListener {
            startActivity(Intent(this,nequi_main::class.java))
        }
    }
}