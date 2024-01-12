package com.example.menu_alerta

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaAdicionar : AppCompatActivity() {

    lateinit var enviar : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_adicionar)

        enviar = findViewById(R.id.btnEnvia1)
        enviar.setOnClickListener { chamaVoltar() }
    }

    private fun chamaVoltar(){
        var enviar = Intent(this@TelaAdicionar,MainActivity::class.java)
        startActivity(enviar)
    }
}