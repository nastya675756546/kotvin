package com.example.pr11
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("ResourceAsColor")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val text: TextView = findViewById(R.id.Text)
        val layout: ConstraintLayout = findViewById(R.id.main)
        when (item.itemId) {
            R.id.action1 ->{
                layout.setBackgroundColor(R.color.yellow)
                Toast.makeText(this ,"Вы выбрали жёлтый цвет", Toast.LENGTH_SHORT).show();
                return true
            }
            R.id.action2 ->{
                layout.setBackgroundColor(R.color.red)
                Toast.makeText(this ,"Вы выбрали красный цвет", Toast.LENGTH_SHORT).show();
                return true
            }
            R.id.action3 ->{
                 layout.setBackgroundColor(R.color.blue)
                Toast.makeText(this ,"Вы выбрали синий цвет", Toast.LENGTH_SHORT).show();
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}