package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class nequi_main : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nequi_main)

        val textview = findViewById<TextView>(R.id.textView)

        val total_money = 150000

        textview.text = total_money.toString()

        val intent = Intent(this, Enviar::class.java)
        intent.putExtra("total_money",total_money)

        Intent(this, Consultar::class.java)
        intent.putExtra("total_consulta",total_money)

        Intent(this, Pagar::class.java)
        intent.putExtra("total_envio",total_money)

        val intent_4 = Intent(this, Retirar::class.java)
        intent.putExtra("total_money",total_money)



        val boton3 = findViewById<Button>(R.id.button3)
        boton3.setOnClickListener{
            startActivity(Intent(this, Consultar::class.java))
        }

        val boton4 = findViewById<Button>(R.id.button4)
        boton4.setOnClickListener {
            startActivity(Intent(this, Pagar::class.java))
        }

        val boton5 = findViewById<Button>(R.id.button5)
        boton5.setOnClickListener {
            startActivity(Intent(this, Retirar::class.java))
        }

        val boton6 = findViewById<Button>(R.id.button6)
        boton6.setOnClickListener {
            startActivity(Intent(this, Enviar::class.java))
        }




    }
}