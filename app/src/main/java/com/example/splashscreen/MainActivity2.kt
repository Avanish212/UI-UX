package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        val btnIntent=findViewById<Button>(R.id.button3)
        btnIntent.setOnClickListener {
            intent= Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}