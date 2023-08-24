package com.test.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogar: Button = FindViewById<Button>(R.id.button)

        button.setOnClickListener {
            validarUsuarioSenha()
        }
    }

    fun validarUsuarioSenha() {
        val etUsername = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val etPassword = findViewById<EditText>(R.id.editTextTextPassword)

        if (editTextTextEmailAddress2.text.toString() != "") {
            if (editTextTextPassword.text.toString() != "") {

                if (etUsername.text.toString() == "admin" && etPassword.text.toString() == "admin123") {
                    Toast.makeText(this, "Seja bem vindo!", Toast.LENGTH_SHORT).show()
                    finish()

                } else {
                    Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this, "Senha não informada", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Usuário não informado", Toast.LENGTH_SHORT).show()
        }


    }
}