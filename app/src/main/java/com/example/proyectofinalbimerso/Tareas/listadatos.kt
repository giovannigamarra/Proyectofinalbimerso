package com.example.proyectofinalbimerso.Tareas


import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinalbimerso.R
import com.example.proyectofinalbimerso.databinding.ActivityListadatosBinding
import com.example.proyectofinalbimerso.inicio2
import com.firebase.ui.database.FirebaseRecyclerAdapter

import com.google.firebase.database.FirebaseDatabase
import com.squareup.picasso.Picasso

import java.lang.ref.WeakReference
import com.example.proyectofinalbimerso.Tareas.User1 as User1




class listadatos : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, compilacion::class.java))
    }


    }















