package com.example.aula_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var fun1 : Button
    lateinit var fun2 : Button
    lateinit var fun3 : Button
    lateinit var fun4 : Button

    lateinit var textF1 : TextView
    lateinit var textF2 : TextView
    lateinit var textF3 : TextView
    lateinit var textF4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun1 = findViewById(R.id.f1)
        fun2 = findViewById(R.id.f2)
        fun3 = findViewById(R.id.f3)
        fun4 = findViewById(R.id.f4)
        textF1 = findViewById(R.id.tF1)
        textF2 = findViewById(R.id.tF2)
        textF3 = findViewById(R.id.tF3)
        textF4 = findViewById(R.id.tF4)

        fun1.setOnClickListener{f1()}
        fun2.setOnClickListener{f2()}
        fun3.setOnClickListener{f3()}
        fun4.setOnClickListener{f4()}
        dataTypes()
    }

    fun dataTypes(){}

    fun f1(){
        val x = 10
        val y = 20
        val r = x+y
            textF1.setText(r.toString())
    }

    fun f2(){
        val x = 100
        val y = 200
        if(x<=100)
            textF2.setText("x")
        else
            textF2.setText("y")
    }

    fun f3(){
        val x = 600
        var y = 100
        if (x <= 100)
            textF3.setText("x")
        else if (y>=200)
            textF3.setText("y")
        else
            textF3.setText("Nenhum")
    }

    fun f4(){
        var x = 0
        var y = 0
        while (x<10){
            y+=1
            x+=1
        }
        textF4.setText("y: " +y)
    }

    //Falta o 4 e o datatype
}