// File: MainActivity.kt
package com.example.sqliteexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sqliteexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var binding: ActivityMainBinding
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this)

        binding.buttonAdd.setOnClickListener {
            addUser()
        }

        binding.buttonView.setOnClickListener {
            viewUsers()
        }

        // Initialize RecyclerView
        binding.recyclerViewUsers.layoutManager = LinearLayoutManager(this)
    }

    private fun addUser() {
        val name = binding.editTextName.text.toString()
        val ageText = binding.editTextAge.text.toString()
        if (name.isNotEmpty() && ageText.isNotEmpty()) {
            val age = ageText.toInt()
            val user = User(name = name, age = age)
            val success = databaseHelper.addUser(user)
            if (success > 0) {
                Toast.makeText(this, "User added", Toast.LENGTH_SHORT).show()
                binding.editTextName.text.clear()
                binding.editTextAge.text.clear()
            } else {
                Toast.makeText(this, "Error adding user", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please enter name and age", Toast.LENGTH_SHORT).show()
        }
    }

    private fun viewUsers() {
        val users = databaseHelper.getAllUsers()
        if (users.isNotEmpty()) {
            userAdapter = UserAdapter(users)
            binding.recyclerViewUsers.adapter = userAdapter
        } else {
            Toast.makeText(this, "No users found", Toast.LENGTH_SHORT).show()
        }
    }
}
