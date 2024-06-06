package com.example.calculadoraimc

/*
En codigo de comentario está mi ORIGINAL MÍO =====

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
FIN ==== */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow // Esto es para añadir una fórmula, en este caso el de calculo de peso respecto a estatura.

class MainActivity : AppCompatActivity() { //AppCompatActivity es la HERENCIA

    lateinit var wellcomeTextView: TextView
    lateinit var Botondelclick: Button
    //lateinit var heightEditText: EditText  <=== ELIMINO esto x q ya no editaré contenido de Height, lo añadiré con botones + y -
    lateinit var heightTextView: TextView
    lateinit var weightTextView: TextView
    lateinit var minusHeightButton: Button
    lateinit var addHeightButton: Button
    lateinit var minusWeightButton: Button
    lateinit var addWeightButton: Button
    lateinit var descriptionTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var calculateButton: Button


    var height: Int = 150
    var weight: Int = 70

    /* ANTIGUO CÓDIGO cerrado en "No ver"

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Vista de ventana App

        wellcomeTextView = findViewById(R.id.wellcomeTextView)
        Botondelclick = findViewById(R.id.Botondelclick)

        wellcomeTextView.text = "Bienvenidos a mi primera App"

        Botondelclick.setOnClickListener {
            wellcomeTextView.text = "Realicé mi primer botón"
        }
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //heightEditText = findViewById(R.id.heightEditText)
        heightTextView = findViewById(R.id.heightTextView)
        minusHeightButton = findViewById(R.id.minusHeightButton)
        addHeightButton = findViewById(R.id.addHeightButton)
        weightTextView = findViewById(R.id.weightTextView) // Aquí comienza el Weight
        minusWeightButton = findViewById(R.id.minusWeightButton)
        addWeightButton = findViewById(R.id.addWeightButton)
        descriptionTextView = findViewById(R.id.descriptionTextView)
        resultTextView = findViewById(R.id.resultTextView)
        calculateButton = findViewById(R.id.calculateButton)

        setHeight()
        setWeight()

        minusWeightButton.setOnClickListener {
            weight --
            setWeight()
        }

        addWeightButton.setOnClickListener {
            weight ++
            setWeight()
        }

    /* =======  Copia de weigth para HEIGHT ======= */

        minusHeightButton.setOnClickListener {
            height --
            setHeight()
        }

        addHeightButton.setOnClickListener {
            height ++
            setHeight()
        }

        calculateButton.setOnClickListener {
            //height = heightEditText.text.toString().toInt()

            val result = weight / (height / 100f).pow(2)

            resultTextView.text = result.toString()
        }
    }

    fun setHeight() {
        heightTextView.text = "$height cm"
        //heightEditText.setText(height.toString())
    }

    fun setWeight() {
        weightTextView.text = "$weight Kg" // Esta es la FÓRMULA para convertir el peso
    }
}