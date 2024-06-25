package com.example.pr10

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Activity : AppCompatActivity() {
    var colors = arrayOf(0x006057, 0x136800, 0x7C1002)
    var sheetNumber = 0
    val text: EditText = findViewById(R.id.text)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_)
        sheetNumber = getIntent().getIntExtra("sheetNumber", 0)
        val nextBtn: Button = findViewById(R.id.next)
        nextBtn.setOnClickListener {
            if (sheetNumber < colors.size - 1) {
                val intent = Intent(this, this::class.java)
                intent.putExtra("sheetNumber", sheetNumber + 1)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, getString(R.string.last), Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }

    override fun onPause() {
        super.onPause()
        val prefs = getPreferences(Context.MODE_PRIVATE).edit()
        prefs.putString("yournote", text.editableText.toString())
        prefs.apply()
    }

    override fun onResume() {
        super.onResume()
        val saveState = getPreferences(Context.MODE_PRIVATE).getString("yournote", null)
        if (saveState != null)
        {
            text.setText(saveState)
        }
    }
}