package br.com.fiap.beved

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.fiap.beved.R.*

class LoginEmpresa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_login_empresa)

        val chamaCadastro = findViewById<TextView>(R.id.txtChamaCadastroEmpresa)

        chamaCadastro.setOnClickListener{
            val signUp = Intent(this, CadastroEmpresa::class.java)
            startActivity(signUp)
        }

        val chamaPagInicial = findViewById<Button>(R.id.buttonLogin)

        chamaPagInicial.setOnClickListener{
            val signIn = Intent(this, PaginaInicialEmpresa::class.java)
            startActivity(signIn)
        }
    }
}