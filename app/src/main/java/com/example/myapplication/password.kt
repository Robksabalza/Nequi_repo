package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        setContentView(R.layout.activity_password)

        val boton2 = findViewById<Button>(R.id.button2)
        boton2.setOnClickListener{
            startActivity(Intent(this, nequi_main::class.java))
        }


   }

}