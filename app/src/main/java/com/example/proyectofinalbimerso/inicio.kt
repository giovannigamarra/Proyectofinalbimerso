package com.example.proyectofinalbimerso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_inicio.*

class inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        login()
    }


    private fun login() {
        title = "logeo"


        iniciobutton.setOnClickListener {
            if (editTextEmail3.text.isNotEmpty() && editTextPassword3.text.isNotEmpty()) {
                val addOnCompleteListener = FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(
                        editTextEmail3.text.toString(),
                        editTextPassword3.text.toString()
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {

                            Toast.makeText(this, "inicio sesion correcto", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, Menus::class.java))

                            finish()

                        } else {
                            Toast.makeText(this, "datos incorrectos ", Toast.LENGTH_SHORT).show()
                        }
                    }

            }
        }
    }
}