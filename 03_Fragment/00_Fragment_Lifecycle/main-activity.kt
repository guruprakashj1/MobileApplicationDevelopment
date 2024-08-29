package com.example.fragmentlifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addFragmentButton: Button = findViewById(R.id.addFragmentButton)
        val removeFragmentButton: Button = findViewById(R.id.removeFragmentButton)

        addFragmentButton.setOnClickListener {
            addLifecycleFragment()
        }

        removeFragmentButton.setOnClickListener {
            removeLifecycleFragment()
        }
    }

    private fun addLifecycleFragment() {
        val fragment = LifecycleFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, fragment, "lifecycleFragment")
            .addToBackStack(null)
            .commit()
    }

    private fun removeLifecycleFragment() {
        val fragment = supportFragmentManager.findFragmentByTag("lifecycleFragment")
        fragment?.let {
            supportFragmentManager.beginTransaction()
                .remove(it)
                .commit()
        }
    }
}
