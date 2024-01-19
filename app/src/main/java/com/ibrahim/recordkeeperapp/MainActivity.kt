package com.ibrahim.recordkeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ibrahim.recordkeeperapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }

        binding.btnCycling.setOnClickListener {
           onCyclingClicked()
        }
        binding.btnRunning.setOnClickListener {
            onRunningClicked()
        }



    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }

    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
    }
}