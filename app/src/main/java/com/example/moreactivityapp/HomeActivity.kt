package com.example.moreactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //fetch our views
        var tvUserName: TextView = findViewById(R.id.username_text_view)
        var tvUsernameDesc: TextView = findViewById(R.id.user_desc_text_view)
        var goThird: Button = findViewById(R.id.go_third)

        var name = intent.getStringExtra("user")
        var desc = intent.getStringExtra("desc")

        tvUserName.text = name
        tvUsernameDesc.text = desc

        goThird.setOnClickListener() {
            var intent = Intent(this@HomeActivity, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}