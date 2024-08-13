package com.example.chipexample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBasicChip()
        setupCheckableChip()
        setupCustomStyledChip()
        setupChipWithIcon()
        setupChipWithCloseIcon()
        setupCustomBackgroundChip()
        createProgrammaticChip()
    }

    private fun setupBasicChip() {
        val basicChip: Chip = findViewById(R.id.basicChip)
        basicChip.setOnClickListener {
            showToast("Basic Chip clicked")
        }
    }

    private fun setupCheckableChip() {
        val checkableChip: Chip = findViewById(R.id.checkableChip)
        checkableChip.setOnCheckedChangeListener { _, isChecked ->
            showToast("Checkable Chip is ${if (isChecked) "checked" else "unchecked"}")
        }
    }

    private fun setupCustomStyledChip() {
        val customStyledChip: Chip = findViewById(R.id.customStyledChip)
        customStyledChip.setOnClickListener {
            showToast("Custom Styled Chip clicked")
        }
    }

    private fun setupChipWithIcon() {
        val chipWithIcon: Chip = findViewById(R.id.chipWithIcon)
        chipWithIcon.setOnClickListener {
            showToast("Chip with Icon clicked")
        }
    }

    private fun setupChipWithCloseIcon() {
        val chipWithCloseIcon: Chip = findViewById(R.id.chipWithCloseIcon)
        chipWithCloseIcon.setOnCloseIconClickListener {
            showToast("Close Icon clicked")
            chipWithCloseIcon.visibility = View.GONE
        }
    }

    private fun setupCustomBackgroundChip() {
        val customBackgroundChip: Chip = findViewById(R.id.customBackgroundChip)
        customBackgroundChip.setOnClickListener {
            showToast("Custom Background Chip clicked")
        }
    }

    private fun createProgrammaticChip() {
        val chipGroup: ViewGroup = findViewById(R.id.chipGroup)
        
        val chip = Chip(this)
        chip.text = "Programmatic Chip"
        chip.isCheckable = true
        chip.isClickable = true
        chip.isCloseIconVisible = true
        chip.setChipIconResource(android.R.drawable.ic_dialog_info)
        
        chip.setOnClickListener {
            showToast("Programmatic Chip clicked")
        }
        chip.setOnCloseIconClickListener {
            chipGroup.removeView(chip)
            showToast("Programmatic Chip removed")
        }

        chipGroup.addView(chip)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
