package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        /*serve pra ser integrado em alguma tela. No caso, no menu*/
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.itemAdicionar -> {
                println("ADICIONAR CLICADO")
                Toast.makeText(this, "Menu ADICIONAR clicado", Toast.LENGTH_SHORT).show()
                var chamaT = Intent(this, MainActivity2::class.java)
                startActivity(chamaT)
                true
            }
            R.id.itemAlterar -> {
                println("ALTERAR CLICADO")
                Toast.makeText(this, "Menu ALTERAR clicado", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.itemDeletar -> {
                println("DELETAR CLICADO")
                Toast.makeText(this, "Menu EXCLUIR clicado", Toast.LENGTH_SHORT).show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}