package com.ibrahim.recordkeeperapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ibrahim.recordkeeperapp.databinding.FragmentRunningBinding

class RunningFragment : Fragment(){
    private lateinit var binding: FragmentRunningBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRunningBinding.inflate(inflater, container, false)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.container5km.setOnClickListener {
          lanunchRunningRecordActivity("5")
        }
    }

    private fun lanunchRunningRecordActivity(value : String) {

        val intent = Intent(context, EditRunningRecordActivity::class.java)
        intent.putExtra("recordType", "$value km")
        startActivity(intent)
   }




}