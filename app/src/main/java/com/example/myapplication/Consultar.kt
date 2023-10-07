package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat


class Consultar : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultar)








        val boton8 = findViewById<Button>(R.id.button8)
        boton8.setOnClickListener{
            startActivity(Intent(this,nequi_main::class.java))
        }
        val intent = intent
        val total_consulta = intent.getStringExtra("total_consulta") ?:"no se"


        val textview = findViewById<TextView>(R.id.textView9)
        textview.text = total_consulta.toString()

    }
}