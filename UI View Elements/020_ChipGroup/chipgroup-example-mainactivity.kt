package com.example.chipgroupexample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    private lateinit var multiSelectChipGroup: ChipGroup
    private lateinit var singleSelectChipGroup: ChipGroup
    private lateinit var customLayoutChipGroup: ChipGroup
    private lateinit var dynamicChipGroup: ChipGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeChipGroups()
        setupChipGroups()
        setupDynamicChipGroup()
    }

    private fun initializeChipGroups() {
        multiSelectChipGroup = findViewById(R.id.multiSelectChipGroup)
        singleSelectChipGroup = findViewById(R.id.singleSelectChipGroup)
        customLayoutChipGroup = findViewById(R.id.customLayoutChipGroup)
        dynamicChipGroup = findViewById(R.id.dynamicChipGroup)
    }

    private fun setupChipGroups() {
        multiSelectChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            val selectedChips = checkedIds.map { id -> group.findViewById<Chip>(id).text }
            showToast("Selected: ${selectedChips.joinToString(", ")}")
        }

        singleSelectChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            if (checkedIds.isNotEmpty()) {
                val selectedChip = group.findViewById<Chip>(checkedIds[0]).text
                showToast("Selected: $selectedChip")
            }
        }
    }

    private fun setupDynamicChipGroup() {
        findViewById<View>(R.id.addChipButton).setOnClickListener {
            val newChip = Chip(this).apply {
                text = "Chip ${dynamicChipGroup.childCount + 1}"
                isCheckable = true
                setOnCloseIconClickListener {
                    dynamicChipGroup.removeView(this)
                }
            }
            dynamicChipGroup.addView(newChip)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
