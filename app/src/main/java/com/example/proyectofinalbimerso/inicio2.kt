package com.example.proyectofinalbimerso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_inicio2.*

class inicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio2)
        val database = Firebase.database
        val myRef = database.getReference("message")
        setup()

    }


    private fun setup() {
        title = "Registro"


        buttonregistrof.setOnClickListener {
            if (editTextNombre.text.isNotEmpty()&& editTextApellido.text.isNotEmpty()&& editTextEmail2.text.isNotEmpty() && editTextPassword2.text.isNotEmpty()) {
                val addOnCompleteListener = FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(
                        editTextEmail2.text.toString(),
                        editTextPassword2.text.toString()
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {



                            Toast.makeText(this, "se registro con exito", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, MainActivity::class.java))

                            finish()

                        } else {
                            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
                        }
                    }

            }
        }
    }
}
