package com.example.pr9

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        showRandomNumber()
    }
    fun showRandomNumber () {
        val random = (0..1000).random()
        var randomInt = (0..random).random()
        val textViewRandom: TextView = findViewById(R.id.textView_Random)
        val textViewLabel: TextView = findViewById(R.id.textView_label)
        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading, random)
    }
}