package com.example.androidkotlinapiexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.androidkotlinapiexample.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFetchPost.setOnClickListener {
            fetchPost()
        }
    }

    private fun fetchPost() {
        lifecycleScope.launch {
            try {
                val post = ApiClient.apiService.getPost(1)
                binding.textViewResult.text = "Title: ${post.title}\nBody: ${post.body}"
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}