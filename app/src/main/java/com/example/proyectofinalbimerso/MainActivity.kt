package com.example.proyectofinalbimerso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRegistrar.setOnClickListener {
            startActivity(Intent(this, inicio2::class.java))
        }
        buttonLogin.setOnClickListener {
            startActivity(Intent(this, inicio::class.java))
        }
    }
}