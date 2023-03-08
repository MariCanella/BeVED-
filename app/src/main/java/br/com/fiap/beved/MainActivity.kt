package br.com.fiap.beved

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.queroEstudarButton)

        login.setOnClickListener{
            val signIn = Intent(this, LoginEstudante::class.java)
            startActivity(signIn)
        }

        val loginCnpj = findViewById<Button>(R.id.queroContratarButton)

        loginCnpj.setOnClickListener{
            val signIn = Intent(this, LoginEmpresa::class.java)
            startActivity(signIn)
        }
    }
}