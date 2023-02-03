package com.example.metadata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.cardview.widget.CardView

import com.example.metadata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        numberFocusListener()

        val cardView = findViewById<CardView>(R.id.cardView)
        val animation = AnimationUtils.loadAnimation(this, R.anim.card_animation)
        cardView.startAnimation(animation)
    }


    private fun numberFocusListener() {
        binding.numberEditText.setOnFocusChangeListener { _, focused ->
            if (!focused) {
                binding.numberContainer.helperText = validNumber()
            }
        }
    }

    private fun validNumber(): String? {
        val cardNumbers = binding.numberEditText.text.toString()

        if (cardNumbers.isEmpty()) {
            return getString(R.string.EmptyField)
        }
        if (!cardNumbers.matches(".*[0-9].*".toRegex())) {
            return getString(R.string.OnlyDigitsInCard)
        }

        if (cardNumbers.length != 8) {
            return getString(R.string.CardNumberDigit)
        }
        if (cardNumbers.matches(".*[*#()/+.,;@!?<>%-].*".toRegex())) {
            return getString(R.string.CharachtersInNumber)
        }
        return null
    }

}