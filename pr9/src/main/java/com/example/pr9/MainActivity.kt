package com.example.pr9

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            val randomIntent = Intent(this, MainActivity2::class.java)
        val buttonRandom:Button = findViewById(R.id.buttonRandom)

        buttonRandom.setOnClickListener {
            startActivity(randomIntent)
        }



    }
}