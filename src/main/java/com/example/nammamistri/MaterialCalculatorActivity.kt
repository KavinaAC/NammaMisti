package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MaterialCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_material_calculator)

        val length = findViewById<EditText>(R.id.etLength)
        val width = findViewById<EditText>(R.id.etWidth)
        val height = findViewById<EditText>(R.id.etHeight)

        val result = findViewById<TextView>(R.id.txtResult)

        val calculateButton = findViewById<Button>(R.id.btnCalculate)

        val backButton = findViewById<Button>(R.id.btnBackHome)

        // CALCULATE BUTTON

        calculateButton.setOnClickListener {

            val l = length.text.toString().toDoubleOrNull() ?: 0.0
            val w = width.text.toString().toDoubleOrNull() ?: 0.0
            val h = height.text.toString().toDoubleOrNull() ?: 0.0

            val volume = l * w * h

            val bricks = (volume * 13).toInt()
            val cement = (volume * 0.25).toInt()
            val sand = (volume * 0.5).toInt()

            result.text = """

Volume : $volume ft³

Bricks Required : $bricks

Cement Bags : $cement

Sand Loads : $sand

            """.trimIndent()
        }

        // BACK BUTTON

        backButton.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))

            finish()
        }
    }
}