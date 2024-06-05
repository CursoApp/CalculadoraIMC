package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() { //AppCompatActivity es la HERENCIA

    lateinit var wellcomeTextView: TextView
    lateinit var Botondelclick: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Vista de ventana App

        wellcomeTextView = findViewById(R.id.wellcomeTextView)
        Botondelclick = findViewById(R.id.Botondelclick)

        wellcomeTextView.text = "Bienvenidos a mi primera App"

        Botondelclick.setOnClickListener {
            wellcomeTextView.text = "Realicé mi primer botón"
        }
    }
}