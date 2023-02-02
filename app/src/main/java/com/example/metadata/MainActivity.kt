package com.example.metadata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.cardview.widget.CardView

import com.example.metadata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cardView = findViewById<CardView>(R.id.cardView)
        val animation = AnimationUtils.loadAnimation(this, R.anim.card_animation)
        cardView.startAnimation(animation)
    }



}