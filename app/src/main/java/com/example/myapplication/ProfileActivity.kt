package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val ageEditText: EditText = findViewById(R.id.ageEditText)
        val addressEditText: EditText = findViewById(R.id.addressEditText)
        val continueButton: Button = findViewById(R.id.continueButton)


        continueButton.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("age", ageEditText.text.toString())
            intent.putExtra("address", addressEditText.text.toString())

            startActivity(intent)
        }
    }
}