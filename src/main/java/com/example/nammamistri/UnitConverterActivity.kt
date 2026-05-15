package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class UnitConverterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_unit_converter)

        val etValue = findViewById<EditText>(R.id.etValue)

        val spinnerConversion = findViewById<Spinner>(R.id.spinnerConversion)

        val txtResult = findViewById<TextView>(R.id.txtResult)

        // Conversion Types
        val conversionList = arrayOf(
            "Feet to Meter",
            "Meter to Feet",
            "Sq.ft to Sq.m",
            "Sq.m to Sq.ft"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            conversionList
        )

        spinnerConversion.adapter = adapter

        findViewById<Button>(R.id.btnConvert).setOnClickListener {

            val input = etValue.text.toString().toDoubleOrNull()

            if (input == null) {

                Toast.makeText(this, "Enter valid value", Toast.LENGTH_SHORT).show()

            } else {

                val selected = spinnerConversion.selectedItem.toString()

                val result = when (selected) {

                    "Feet to Meter" -> "${input} ft = %.2f m".format(input * 0.3048)

                    "Meter to Feet" -> "${input} m = %.2f ft".format(input * 3.28084)

                    "Sq.ft to Sq.m" -> "${input} sq.ft = %.2f sq.m".format(input * 0.092903)

                    "Sq.m to Sq.ft" -> "${input} sq.m = %.2f sq.ft".format(input * 10.7639)

                    else -> "Invalid"
                }

                txtResult.text = result
            }
        }

        findViewById<Button>(R.id.btnBackHome).setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}