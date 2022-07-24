package com.example.myfirstapp_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Included in this app:
        // Display customized to show 'Hello from {name}'
        // Display customized background color
        // Display button to change text color
        // 1. Add a button

        // Get a reference to button
        //2.Set up logic to know when user has tapped on the button
        findViewById<Button>(R.id.change_text_color_button).setOnClickListener {
            // Handles button tap
            // 3.Change the color of the text
            Log.i("Jorge", "Tapped on Change Text Button")
            // Get a reference to the text view
            // Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.pearl_white))
        }

        // Changes background color to white
        findViewById<Button>(R.id.change_background_color_button).setOnClickListener {
            Log.i("Jorge", "Tapped on Change Background Color button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                resources.getColor(
                    R.color.white
                )
            )
        }

        // Change Text Messege to "Android is Awesome!"
        findViewById<Button>(R.id.Change_Text_Button).setOnClickListener {
            Log.i("Jorge", "Tapped on Change Text Button")
            findViewById<TextView>(R.id.textView).text = "Android is Awesome!"
        }

        // Resets the view for both background and text color
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Jorge", "Tapped background to reset view")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                getResources().getColor(
                    R.color.royal_purple
                )
            )
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
        }
    }
}

