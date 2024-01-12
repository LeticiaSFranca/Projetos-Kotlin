package com.example.exerciciorevisao

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class escudos(view: View) : RecyclerView.ViewHolder(view){
    var imagemEscudo : ImageView = view.findViewById(R.id.imgEscudo)
    var tituloEscudo : TextView = view.findViewById(R.id.txtTitulo)
    var descricaoEscudo : TextView = view.findViewById(R.id.txtDescricao)


}