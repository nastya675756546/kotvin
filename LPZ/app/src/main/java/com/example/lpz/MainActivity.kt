package com.example.lpz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var count: Int = 0

    @SuppressLint("MissingInflatedId", "WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener {

            imageButton.setOnClickListener {
                imageButton.setImageResource(R.drawable.paint)
                if (editText.text.isEmpty() && count == 0) {
                    textView.text = "Hello, friend"
                    textView.visibility = View.VISIBLE
                    editText.visibility = View.INVISIBLE
                } else {
                    textView.text = "Hello, ${editText.text}"
                    textView.visibility = View.VISIBLE
                    editText.visibility = View.INVISIBLE
                }
                if (count == 1) {
                    textView.visibility = View.INVISIBLE
                    editText.visibility = View.VISIBLE
                    editText.hint = "Как настроение?(хорошо/плохо)"
                }
                    if (editText.text.equals("хорошо") && count == 2) {
                        imageButton.setImageResource(R.drawable.good_24)
                    }
                    if (editText.text.equals("плохо") && count == 2) {
                        imageButton.setImageResource(R.drawable.bad_24)
                    }

                    count = if (count >= 2) 0 else count + 1



            }
        }
    }
}
