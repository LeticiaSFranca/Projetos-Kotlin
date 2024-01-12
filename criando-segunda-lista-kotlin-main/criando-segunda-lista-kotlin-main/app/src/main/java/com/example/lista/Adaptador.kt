package com.example.lista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adaptador (var arrayLivros: ArrayList<Livros>) : RecyclerView.Adapter<Adaptador.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cartao,parent, false)
        return Adaptador.MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrayLivros.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemCorrente = arrayLivros[position]
        holder.fotoLivro.setImageResource(itemCorrente.idFoto)
        holder.texto.text = itemCorrente.nome
    }

    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view)
    {
        val fotoLivro : ImageView = view.findViewById(R.id.imageView)
        val texto : TextView = view.findViewById(R.id.textView3)
    }
}