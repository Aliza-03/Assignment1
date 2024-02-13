package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val textView: TextView = findViewById(R.id.loginClick)
        textView.setOnClickListener {
            val intent = Intent(this, forgotpassword::class.java)
            startActivity(intent)
        }
    }


}