package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LabourCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_labour_calculator)

        val etWorkers = findViewById<EditText>(R.id.etWorkers)
        val etDailyWage = findViewById<EditText>(R.id.etDailyWage)
        val etDays = findViewById<EditText>(R.id.etDays)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        findViewById<Button>(R.id.btnCalculate).setOnClickListener {

            val workersText = etWorkers.text.toString()
            val wageText = etDailyWage.text.toString()
            val daysText = etDays.text.toString()

            if (workersText.isEmpty() || wageText.isEmpty() || daysText.isEmpty()) {

                Toast.makeText(this, "Enter all fields", Toast.LENGTH_SHORT).show()

            } else {

                val workers = workersText.toInt()
                val wage = wageText.toDouble()
                val days = daysText.toInt()

                val total = workers * wage * days

                tvResult.text = "Total Labour Cost: ₹$total"
            }
        }

        findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}