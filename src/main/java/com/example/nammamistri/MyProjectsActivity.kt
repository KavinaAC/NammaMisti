package com.example.nammamistri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MyProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_projects)

        // Back Button
        findViewById<Button>(R.id.btnBackHome).setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}