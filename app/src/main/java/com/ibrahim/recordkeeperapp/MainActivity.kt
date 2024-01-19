package com.ibrahim.recordkeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ibrahim.recordkeeperapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.commit {
//            replace(R.id.frame_content, RunningFragment())
//        }

        binding.btnCycling.setOnClickListener {
            onCyclingClicked()
            Toast.makeText(this@MainActivity, "Cycling Anonymous 1", Toast.LENGTH_SHORT).show()
        }
        binding.btnRunning.setOnClickListener {
            onRunningClicked()
            Toast.makeText(this@MainActivity, "Running Anonymous 2", Toast.LENGTH_SHORT).show()
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