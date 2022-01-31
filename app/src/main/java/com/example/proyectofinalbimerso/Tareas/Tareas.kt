package com.example.proyectofinalbimerso.Tareas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinalbimerso.R
import com.example.proyectofinalbimerso.inicio2
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_tareas.*

class Tareas : AppCompatActivity() {

    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tareas)
        database = FirebaseDatabase.getInstance()
        reference = database.getReference("User")
floatingActionButton3.setOnClickListener {
    sendData1()
}
}



    private fun sendData1() {
    var nombre = editTextnombretareas.text.toString().trim()
    var descripcion = editTextdescripciontarea.text.toString().trim()
    if (nombre.isNotEmpty() && descripcion.isNotEmpty()) {
        var model = User1(nombre,descripcion)
        var id = reference.push().key
        reference.child(id!!).setValue(model)
        editTextnombretareas.setText("")
        editTextdescripciontarea.setText("")
        startActivity(Intent(this, listadatos::class.java))
    } else {
        Toast.makeText(applicationContext, "All field Requerid", Toast.LENGTH_LONG).show()
    }
}
}