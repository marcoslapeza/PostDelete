package com.example.postdelete

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InmuebleAdapter(private var inmuebles:MutableList<InmuebleResponse>): RecyclerView.Adapter<InmuebleViewHolder>() {
    private var fInmuebles = inmuebles
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InmuebleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return InmuebleViewHolder(layoutInflater.inflate(R.layout.item_inmueble,parent,false))
    }

    override fun getItemCount(): Int {
        return fInmuebles.size
    }

    override fun onBindViewHolder(holder: InmuebleViewHolder, position: Int) {
        val itemT = fInmuebles[position]
        holder.bind(itemT.titulo)
        val inmuebleApiService = APIService.retrofit.create(APIService::class.java)

    }

}