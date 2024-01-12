package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val data = arrayOf("One","Two","Three", "Four", "Five")
    private  lateinit var recyclerView: RecyclerView
    private  lateinit var manager: RecyclerView.LayoutManager
    private  lateinit var myAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.Reciclador)
        manager = LinearLayoutManager(this)

        myAdapter = ItemAdapter(data)

        recyclerView = findViewById<RecyclerView>(R.id.Reciclador).apply {
            layoutManager = manager
            adapter = myAdapter
        }
    }
}