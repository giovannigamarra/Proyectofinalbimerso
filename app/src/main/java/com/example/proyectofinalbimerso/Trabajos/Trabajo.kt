package com.example.proyectofinalbimerso.Trabajos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectofinalbimerso.R
import com.example.proyectofinalbimerso.Tareas.User1
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_tareas.*
import kotlinx.android.synthetic.main.activity_trabajo.*

class Trabajo : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trabajo)
        database = FirebaseDatabase.getInstance()
        reference = database.getReference("User1")
        floatingActionButton.setOnClickListener {
            sendData2()
    }
}


private fun sendData2() {
    var nombre1 = editTextnombretrabajo.text.toString().trim()
    var descripcion1 = editTextdescriptrabajo.text.toString().trim()
    if (nombre1.isNotEmpty() && descripcion1.isNotEmpty()) {
        var model1 = User2(nombre1,descripcion1)
        var id1 = reference.push().key
        reference.child(id1!!).setValue(model1)
        editTextnombretrabajo.setText("")
        editTextdescriptrabajo.setText("")

    } else {
        Toast.makeText(applicationContext, "All field Requerid", Toast.LENGTH_LONG).show()
    }
}
}