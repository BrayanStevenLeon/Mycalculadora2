package com.example.mycalculadora2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtNro1: EditText = findViewById(R.id.txtNro1)
        val txtNro2: EditText = findViewById(R.id.txtNro2)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        val btSumar: Button = findViewById(R.id.btSumar)
        btSumar.setOnClickListener {
            val nro1 = txtNro1.text.toString().toDouble()
            val nro2 = txtNro2.text.toString().toDouble()
            val resultado = nro1 + nro2
            tvResultado.text = resultado.toString()
        }

        val btRestar: Button = findViewById(R.id.btRestar)
        btRestar.setOnClickListener {
            val nro1 = txtNro1.text.toString().toDouble()
            val nro2 = txtNro2.text.toString().toDouble()
            val resultado = nro1 - nro2
            tvResultado.text = resultado.toString()
        }

        val btMultiplicar: Button = findViewById(R.id.btMultiplicar)
        btMultiplicar.setOnClickListener {
            val nro1 = txtNro1.text.toString().toDouble()
            val nro2 = txtNro2.text.toString().toDouble()
            val resultado = nro1 * nro2
            tvResultado.text = resultado.toString()
        }

        val btDividir: Button = findViewById(R.id.btDividir)
        btDividir.setOnClickListener {
            val nro1 = txtNro1.text.toString().toDouble()
            val nro2 = txtNro2.text.toString().toDouble()
            if (nro2 != 0.0) {
                val resultado = nro1 / nro2
                tvResultado.text = resultado.toString()
            } else {
                tvResultado.text = "Error: División por cero"
            }
        }

        val btfactorial: Button = findViewById(R.id.btfactorial)
        btfactorial.setOnClickListener {
            val nro1 = txtNro1.text.toString().toInt()
            var resultado = 1
            for (i in 1..nro1) {
                resultado *= i
            }
            tvResultado.text = resultado.toString()
        }

        val btfibonacci: Button = findViewById(R.id.btfibonacci)
        btfibonacci.setOnClickListener {
            val nro1 = txtNro1.text.toString().toInt()
            var a = 0
            var b = 1
            var c: Int
            for (i in 1..nro1) {
                c = a + b
                a = b
                b = c
            }
            tvResultado.text = a.toString()
        }

        val button: Button = findViewById(R.id.btn_Atras)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


