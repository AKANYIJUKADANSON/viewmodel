package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // define object reference for the viewmodel class
    private lateinit var viewModel:MainActivityViewModel
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initializing binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Initializing the view model
        /**
         * The view model provider utility will help to construct the view model
         * because we cant do it on our own
         */
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.apply {

            // Setting the current value to the textview
            countValue.setText(viewModel.getCurrentCountValue().toString())
            countBtn.setOnClickListener {
                countValue.setText(viewModel.updateValueByOne().toString())
            }

        }
    }
}