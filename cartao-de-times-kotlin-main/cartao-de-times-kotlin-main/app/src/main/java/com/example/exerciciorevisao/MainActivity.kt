package com.example.exerciciorevisao

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewEscudos: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewEscudos = findViewById(R.id.reciclador)
        recyclerViewEscudos.adapter = adaptador(::clikNaLista)
        recyclerViewEscudos.layoutManager = LinearLayoutManager(this)
    }

    fun clikNaLista(valor: String){
        Toast.makeText(this, "Clicou na Lista",Toast.LENGTH_SHORT).show()
        var tela = Intent(this,MainActivity2::class.java)
        startActivity(tela)
    }
}