package com.example.menu_alerta

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
        //código que vai fazer o menu aparecer
    }

    fun chamaAlertaAdicionar() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Caixa de Opções")
        builder.setMessage("Deseja mesmo adicionar?")
        builder.setPositiveButton("SIM", DialogInterface.OnClickListener{ dialogInterface, i ->
            Toast.makeText(this, "Clicou em SIM", Toast.LENGTH_LONG).show()
            var telaAdd = Intent(this@MainActivity,TelaAdicionar::class.java)
            startActivity(telaAdd)
        })
        builder.setNegativeButton("NÃO", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Clicou em NÃO", Toast.LENGTH_LONG).show()
        })
        var caixa : AlertDialog? = null
        caixa = builder.create()
        caixa?.show()
    }

    fun chamaAlertaAlterar() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Caixa de Opções")
        builder.setMessage("Deseja mesmo alterar?")
        builder.setPositiveButton("SIM", DialogInterface.OnClickListener{ dialogInterface, i ->
            Toast.makeText(this, "Clicou em SIM", Toast.LENGTH_LONG).show()
            var telaAlt = Intent(this@MainActivity,TelaAlterar::class.java)
            startActivity(telaAlt)
        })
        builder.setNegativeButton("NÃO", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Clicou em NÃO", Toast.LENGTH_LONG).show()
        })
        var caixa : AlertDialog? = null
        caixa = builder.create()
        caixa?.show()
    }

    fun chamaAlertaDeletar() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Caixa de Opções")
        builder.setMessage("Deseja mesmo deletar?")
        builder.setPositiveButton("SIM", DialogInterface.OnClickListener{ dialogInterface, i ->
            Toast.makeText(this, "Clicou em SIM", Toast.LENGTH_LONG).show()
            var telaDel = Intent(this@MainActivity,TelaDeletar::class.java)
            startActivity(telaDel)
        })
        builder.setNegativeButton("NÃO", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Clicou em NÃO", Toast.LENGTH_LONG).show()
        })
        var caixa : AlertDialog? = null
        caixa = builder.create()
        caixa?.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //return super.onOptionsItemSelected(item)

        return when (item.itemId) {
            R.id.itemAdd -> {
                println("ADICIONAR CLICADO")
                chamaAlertaAdicionar()
                true
            }
            R.id.itemUp -> {
                println("ALTERAR CLICADO")
                chamaAlertaAlterar()
                true
            }
            R.id.itemDel -> {
                println("DELETAR CLICADO")
                chamaAlertaDeletar()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}