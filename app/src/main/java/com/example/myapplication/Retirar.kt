package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Retirar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar)

        val intent = intent
        val total_envio = intent.getStringExtra("total_money")

        if (total_envio != null){
            print("excelente")
        }
    }
}