package com.example.postdelete

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.postdelete.databinding.ItemInmuebleBinding

class InmuebleViewHolder(view: View):RecyclerView.ViewHolder(view) {
    private val binding = ItemInmuebleBinding.bind(view)
    fun bind(titulo:String){
        binding.titulo.text=titulo
    }
}