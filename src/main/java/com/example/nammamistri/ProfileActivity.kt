package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)

        val etName = findViewById<EditText>(R.id.etName)
        val etRole = findViewById<EditText>(R.id.etRole)
        val etPhone = findViewById<EditText>(R.id.etPhone)

        // Save Profile Button
        findViewById<Button>(R.id.btnSaveProfile).setOnClickListener {

            val name = etName.text.toString()
            val role = etRole.text.toString()
            val phone = etPhone.text.toString()

            if (name.isEmpty() || role.isEmpty() || phone.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please fill all details",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Profile Updated Successfully",
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