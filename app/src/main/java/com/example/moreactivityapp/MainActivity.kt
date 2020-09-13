package com.example.moreactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // fetch all the views
        var userName: EditText = findViewById(R.id.user_name)
        var userDesc: EditText = findViewById(R.id.user_description)
        var btn: Button = findViewById(R.id.go_btn)

        btn.setOnClickListener() {
            var name = userName.text.toString()
            var description = userDesc.text.toString()

            var intent = Intent(this@MainActivity, HomeActivity::class.java)
            intent.putExtra("user", name)
            intent.putExtra("desc", description)
            startActivity(intent)
        }


    }
}
