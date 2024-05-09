package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_todo)

        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val ageTextView: TextView = findViewById(R.id.ageTextView)
        val addressTextView: TextView = findViewById(R.id.addressTextView)
        val todoListView: ListView = findViewById(R.id.todoListView)
        val newTodoEditText: EditText = findViewById(R.id.newTodoEditText)
        val newTodoButton: Button = findViewById(R.id.newTodoButton)

        nameTextView.text = intent.getStringExtra("name")
        ageTextView.text = intent.getStringExtra("age") + " Tahun"
        addressTextView.text = intent.getStringExtra("address")

        val todoList = mutableListOf("Makan", "Mandi", "Tidur")
        val todoAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, todoList)
        todoListView.adapter = todoAdapter

        todoListView.setOnItemClickListener { parent, view, position, id ->
            todoList.removeAt(position)
            todoAdapter.notifyDataSetChanged()
        }

        newTodoButton.setOnClickListener {
            todoList.add(newTodoEditText.text.toString())
            newTodoEditText.text.clear()
            todoAdapter.notifyDataSetChanged()
        }

    }
}