package com.example.fabexample

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var basicFab: FloatingActionButton
    private lateinit var customIconFab: FloatingActionButton
    private lateinit var customSizeFab: FloatingActionButton
    private lateinit var customColorFab: FloatingActionButton
    private lateinit var customBackgroundFab: FloatingActionButton
    private lateinit var extendedFab: ExtendedFloatingActionButton
    private lateinit var animatedFab: FloatingActionButton

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFabs()
        setupFabListeners()
    }

    private fun initFabs() {
        basicFab = findViewById(R.id.basicFab)
        customIconFab = findViewById(R.id.customIconFab)
        customSizeFab = findViewById(R.id.customSizeFab)
        customColorFab = findViewById(R.id.customColorFab)
        customBackgroundFab = findViewById(R.id.customBackgroundFab)
        extendedFab = findViewById(R.id.extendedFab)
        animatedFab = findViewById(R.id.animatedFab)
    }

    private fun setupFabListeners() {
        basicFab.setOnClickListener {
            showToast("Basic FAB clicked")
        }

        customIconFab.setOnClickListener {
            showToast("Custom Icon FAB clicked")
        }

        customSizeFab.setOnClickListener {
            showToast("Custom Size FAB clicked")
        }

        customColorFab.setOnClickListener {
            showToast("Custom Color FAB clicked")
        }

        customBackgroundFab.setOnClickListener {
            showToast("Custom Background FAB clicked")
        }

        extendedFab.setOnClickListener {
            if (extendedFab.isExtended) {
                extendedFab.shrink()
            } else {
                extendedFab.extend()
            }
        }

        animatedFab.setOnClickListener {
            toggleFabAnimation()
        }
    }

    private fun toggleFabAnimation() {
        if (isFabOpen) {
            animatedFab.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fab_close))
            customIconFab.hide()
            customSizeFab.hide()
            isFabOpen = false
        } else {
            animatedFab.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fab_open))
            customIconFab.show()
            customSizeFab.show()
            isFabOpen = true
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
