package br.com.fiap.beved

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginEstudante : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_estudante)

        val chamaCadastro = findViewById<TextView>(R.id.txtChamaCadastroEstudante)

        chamaCadastro.setOnClickListener{
            val signUp = Intent(this, CadastroEstudante::class.java)
            startActivity(signUp)
        }

        val chamaPagInicial = findViewById<Button>(R.id.buttonLogin)

        chamaPagInicial.setOnClickListener{
            val signIn = Intent(this, PaginaInicialEstudante::class.java)
            startActivity(signIn)
        }
    }
}