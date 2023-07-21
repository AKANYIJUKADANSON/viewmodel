package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var count = 0
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initializing binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            countBtn.setOnClickListener {
                ++count
                countValue.setText(count.toString())
            }

        }
    }
}