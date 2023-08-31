package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /*
    AUTOR DO PROJETO
    MATRÍCULA: 72200839
    NOME: JAMIR SILVA JUNIOR
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCal: Button = findViewById<Button>(R.id.btnCalcular)

        btnCal.setOnClickListener {
            calcularPreco()
        }
    }

    fun calcularPreco(){
        val totalKm:EditText = findViewById<EditText>(R.id.tboxTotalKM)
        val precoL:EditText = findViewById<EditText>(R.id.tboxPrecoL)
        val kml:EditText = findViewById<EditText>(R.id.tboxKML)
        val lblvalor:TextView = findViewById<TextView>(R.id.txtValor)

        if (totalKm.text.toString() == "" || precoL.text.toString() == "" || kml.text.toString() == ""){
            Toast.makeText(this, "Preencha corretamente", Toast.LENGTH_SHORT).show()
            lblvalor.text = "0"

        }else{
            var valor: Float

            valor = (totalKm.text.toString().toFloat() * precoL.text.toString().toFloat())/ kml.text.toString().toFloat()
            lblvalor.text = valor.toString()
        }
    }
}