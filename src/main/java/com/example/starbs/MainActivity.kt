package com.example.starbs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var coffeeTimeButton = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var generateButton = findViewById<Button>(R.id.coffeeTime)
        //To create an instance of button: var example = Button()
        generateButton.setOnClickListener(){
            if(coffeeTimeButton == 0)
            {
                findViewById<TextView>(R.id.testText).text = "Hello"
                coffeeTimeButton = 1
                //To Disable Button: generateButton.isEnabled = false
            }
            else if(coffeeTimeButton == 1)
            {
                findViewById<TextView>(R.id.testText).text = "Bye"
                coffeeTimeButton = 0
            }
        }
    }
}