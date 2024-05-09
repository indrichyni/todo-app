package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val continueButton: Button = findViewById(R.id.continueButton)

        continueButton.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

//        val nameEditText: EditText = findViewById(R.id.nameEditText)
//        val submitButton: Button = findViewById(R.id.submitButton)
//        val resultTextView: TextView = findViewById(R.id.resultTextView)
//
//        submitButton.setOnClickListener {
//            val output = nameEditText.text.toString()
//            resultTextView.text = output
//        }
    }
}