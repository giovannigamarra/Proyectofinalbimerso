package com.example.proyectofinalbimerso.Tareas

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinalbimerso.R
import com.example.proyectofinalbimerso.databinding.ActivityListadatosBinding

import java.lang.ref.WeakReference

class compilacion : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private val nuevos = mutableListOf<User1>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NewsFeedItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NewsFeedItemViewHolder).onBind(nuevos[position])

    }

    override fun getItemCount(): Int {
        return nuevos.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(nuevos: List<User1>) {
        this.nuevos.clear()
        this.nuevos.addAll(nuevos)
        notifyDataSetChanged()
    }

    inner class NewsFeedItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_listadatos, parent, false)

    ) {
        private val binding = ActivityListadatosBinding.bind(itemView)
        fun onBind(nuevo: User1){

        }
    }

}
