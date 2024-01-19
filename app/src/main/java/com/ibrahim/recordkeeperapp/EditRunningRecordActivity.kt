package com.ibrahim.recordkeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ibrahim.recordkeeperapp.databinding.ActivityEditRunningRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityEditRunningRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditRunningRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val distance = intent.getStringExtra("recordType")

        binding.recordsText.text = "Record Type: $distance"

        title = "Running Records Toolbar"

    }
}