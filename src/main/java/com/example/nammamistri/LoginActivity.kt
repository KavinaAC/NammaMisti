package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val etMobileNumber =
            findViewById<EditText>(R.id.etMobileNumber)

        val etPassword =
            findViewById<EditText>(R.id.etPassword)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            val mobile =
                etMobileNumber.text.toString()

            val password =
                etPassword.text.toString()

            if (mobile.isEmpty() || password.isEmpty()) {

                Toast.makeText(
                    this,
                    "ಎಲ್ಲಾ ವಿವರಗಳನ್ನು ನಮೂದಿಸಿ",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "ಲಾಗಿನ್ ಯಶಸ್ವಿಯಾಗಿದೆ",
                    Toast.LENGTH_SHORT
                ).show()

                startActivity(
                    Intent(this, MainActivity::class.java)
                )

                finish()
            }
        }
    }
}