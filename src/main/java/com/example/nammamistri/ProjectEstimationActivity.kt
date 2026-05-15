package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProjectEstimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_estimation)

        val etArea = findViewById<EditText>(R.id.etArea)
        val etRate = findViewById<EditText>(R.id.etRate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        findViewById<Button>(R.id.btnCalculate).setOnClickListener {

            val areaText = etArea.text.toString()
            val rateText = etRate.text.toString()

            if (areaText.isEmpty() || rateText.isEmpty()) {
                Toast.makeText(this, "Enter all fields", Toast.LENGTH_SHORT).show()
            } else {

                val area = areaText.toDouble()
                val rate = rateText.toDouble()

                val total = area * rate

                tvResult.text = "Estimated Cost: ₹$total"
            }
        }

        findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}