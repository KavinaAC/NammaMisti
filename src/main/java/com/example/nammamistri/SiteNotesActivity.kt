package com.example.nammamistri

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SiteNotesActivity : AppCompatActivity() {

    private lateinit var etNotes: EditText
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_site_notes)

        etNotes = findViewById(R.id.etNotes)

        sharedPreferences = getSharedPreferences("SiteNotes", MODE_PRIVATE)

        // Load saved notes
        etNotes.setText(sharedPreferences.getString("notes", ""))

        // Save button
        findViewById<Button>(R.id.btnSaveNotes).setOnClickListener {

            val notes = etNotes.text.toString()

            sharedPreferences.edit().putString("notes", notes).apply()

            Toast.makeText(this, "Notes Saved", Toast.LENGTH_SHORT).show()
        }

        // Clear button
        findViewById<Button>(R.id.btnClearNotes).setOnClickListener {

            etNotes.setText("")

            sharedPreferences.edit().clear().apply()

            Toast.makeText(this, "Notes Cleared", Toast.LENGTH_SHORT).show()
        }

        // Back button
        findViewById<Button>(R.id.btnBackHome).setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}