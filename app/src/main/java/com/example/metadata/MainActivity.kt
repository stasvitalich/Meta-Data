package com.example.metadata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.metadata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}