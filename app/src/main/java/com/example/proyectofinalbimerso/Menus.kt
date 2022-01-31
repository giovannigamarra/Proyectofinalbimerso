package com.example.proyectofinalbimerso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import com.example.proyectofinalbimerso.Tareas.Tareas
import com.example.proyectofinalbimerso.Trabajos.Trabajo

class Menus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.option_one)
            startActivity(Intent(this,Tareas::class.java))
        if (item.itemId == R.id.option_second)
            startActivity(Intent(this,Trabajo::class.java))
            return super.onOptionsItemSelected(item)
    }
}

