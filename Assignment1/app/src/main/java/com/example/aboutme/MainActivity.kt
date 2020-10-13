package com.example.aboutme

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orientation = getResources().getConfiguration().orientation;  // get orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {         // check orientation, if it is Landscape mode
            val rollButton1: Button = findViewById(R.id.roll_button)    //define the button
            rollButton1.setOnClickListener {    //setOnClickListener make button respond to the click
                Toast.makeText(this, "Hi, What's up!", Toast.LENGTH_LONG).show()
            }
        } else {    //The orientation is portrait mode
            val rollButton: Button = findViewById(R.id.roll_button) //define the button
            rollButton.setOnClickListener { //setOnClickListener make button respond to the click
                Toast.makeText(this, "Hi, What's up!", Toast.LENGTH_LONG).show()
            }

        }
    }
}