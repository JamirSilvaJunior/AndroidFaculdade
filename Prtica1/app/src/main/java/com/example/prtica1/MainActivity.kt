package com.example.prtica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nome = findViewById<EditText>(R.id.txtNome);
        var sobnome = findViewById<EditText>(R.id.txtSobrenome);
        var botao = findViewById<Button>(R.id.btnEnviar)

        botao.setOnClickListener{
            Toast.makeText(this, nome.text.toString() + sobnome.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}