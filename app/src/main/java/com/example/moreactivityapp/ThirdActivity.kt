package com.example.moreactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        // fetch our button
        val goBack: Button = findViewById(R.id.go_back)

        goBack.setOnClickListener() {
            val intent = Intent(this@ThirdActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}