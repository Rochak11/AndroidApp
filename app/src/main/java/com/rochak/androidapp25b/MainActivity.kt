package com.rochak.androidapp25b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //reference / binding
        val etfirst: EditText = findViewById(R.id.etfirst)
        val etsecond: EditText = findViewById(R.id.etSecond)
        val btnLogin: Button = findViewById(R.id.btnCalculate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        //listener
        btnLogin.setOnClickListener {
            val first: Int = etfirst.text.toString().toInt()
            val second: Int = etsecond.text.toString().toInt()
            val result = first + second
            tvResult.text = result.toString()
            Toast.makeText(
                    this,
                    "Sum is $result",
                    Toast.LENGTH_LONG
            ).show()

        }

    }
}


