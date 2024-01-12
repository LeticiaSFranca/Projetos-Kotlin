package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val data = arrayOf("one","two","three", "four","five","six","seven", "eight","nine","ten","eleven", "twelve","thirteen","fourteen","fiveteen", "sixteen","seventeen","eighteen","nineteen", "twenty")
    private  lateinit var recyclerView: RecyclerView
    private lateinit var meuArray : ArrayList<Livros>
    lateinit var imageId : Array<Int>
    lateinit var texto : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId = arrayOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t)
        texto = arrayOf("1","Livro 2","Livro 3","Livro 4","Livro 5","Livro 6","Livro 7","Livro 8","Livro 9","Livro 10","Livro 11","Livro 12","Livro 13","Livro 14","Livro 15","Livro 16","Livro 17","Livro 18","Livro 19","Livro 20")
        recyclerView = findViewById(R.id.reciclador)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        meuArray = arrayListOf<Games>()
        getDataFilmes()
    }
    private fun getDataFilmes(){
        for (i in imageId.indices){
            val news = Games(imageId[i],texto[i])
            meuArray.add(news)
        }
        recyclerView.adapter = Adaptador(meuArray)
    }
}