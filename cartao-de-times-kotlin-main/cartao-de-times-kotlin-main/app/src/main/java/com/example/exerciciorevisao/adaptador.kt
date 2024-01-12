package com.example.exerciciorevisao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adaptador(var cliqueLista:(String)->Unit) : RecyclerView.Adapter<escudos>(){

    class escudoClube(
        var fEscudos : Int,
        var tEscudos : String,
        var dEscudos : String
    )

    var escudo : List<escudoClube> = listOf(
        escudoClube(R.drawable.barcelona, "Barcelona", "Espanha"),
        escudoClube(R.drawable.realmadrid, "RealMadrid", "Espanha"),
        escudoClube(R.drawable.psg, "Paris", "França"),
        escudoClube(R.drawable.chelsea, "Chelsea", "Inglaterra"),
        escudoClube(R.drawable.arsenal, "Arsenal", "Inglaterra"),
        escudoClube(R.drawable.manchester, "United", "Inglaterra"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): escudos {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.cartao, parent, false)
        return escudos(view)
    }

    override fun getItemCount(): Int {
        return escudo.size
    }

    override fun onBindViewHolder(holder: escudos, position: Int) {
        holder.imagemEscudo.setImageResource(escudo[position].fEscudos)
        holder.tituloEscudo.text = escudo[position].tEscudos
        holder.descricaoEscudo.text = escudo[position].dEscudos
        holder.itemView.setOnClickListener { cliqueLista.invoke(String.toString()) }
    }
}