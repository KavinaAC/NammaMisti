package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_booking)

        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val spinnerService = findViewById<Spinner>(R.id.spinnerService)
        val tvBookingStatus = findViewById<TextView>(R.id.tvBookingStatus)

        // Services list
        val services = arrayOf(
            "Select Service",
            "Cement Supply",
            "Sand Supply",
            "Bricks Supply",
            "Steel Supply",
            "Mason Labour",
            "Painter Labour",
            "Electrician Service"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            services
        )

        spinnerService.adapter = adapter

        // Booking Button
        findViewById<Button>(R.id.btnBookNow).setOnClickListener {

            val name = etName.text.toString()
            val phone = etPhone.text.toString()
            val service = spinnerService.selectedItem.toString()

            if (name.isEmpty() || phone.isEmpty() || service == "Select Service") {

                Toast.makeText(
                    this,
                    "Please fill all details",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                tvBookingStatus.text =
                    "Booking Confirmed for $service"

                Toast.makeText(
                    this,
                    "Booking Successful",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Back Button
        findViewById<Button>(R.id.btnBackHome).setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}