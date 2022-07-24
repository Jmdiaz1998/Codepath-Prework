package com.example.myfirstapp_helloworld

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        val editText = findViewById<EditText>(R.id.custom_text_entry)
        val changeColorTextButton = findViewById<Button>(R.id.change_text_color_button)
        val changeBackgroundButton = findViewById<Button>(R.id.change_background_color_button)
        val messageTextView = findViewById<TextView>(R.id.messageTextView)

        // Get a reference to button
        //2.Set up logic to know when user has tapped on the button
        changeColorTextButton.setOnClickListener {
            // Handles button tap
            // 3.Change the color of the text
            Log.i("Jorge", "Tapped on Change Text Button")
            // Get a reference to the text view
            // Set the color of the text view
            messageTextView.setTextColor(resources.getColor(R.color.pearl_white))
        }

        // Changes background color to white
        changeBackgroundButton.setOnClickListener {
            Log.i("Jorge", "Tapped on Change Background Color button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                resources.getColor(
                    R.color.white
                )
            )
        }

        // Change Text Message to "Android is Awesome!"
        findViewById<Button>(R.id.change_text_button).setOnClickListener {
            Log.i("Jorge", "Tapped on Change Text Button")
            messageTextView.text = "Android is Awesome!"
        }


        // Resets the view to default:
        /// Returns background color to royal purple
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Jorge", "Tapped background to reset view")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                resources.getColor(
                    R.color.royal_purple
                )
            )
            /// Returns message to default
            messageTextView.setTextColor(resources.getColor(R.color.black))
            messageTextView.text = "Hello from Jorge!"

            /// Hides custom text field
            findViewById<EditText>(R.id.custom_text_entry).visibility = View.GONE
            inputMethodManager.hideSoftInputFromWindow(editText.windowToken, 0)
        }

        // Reveals custom text bar and asks user to enter custom text.
        findViewById<Button>(R.id.enter_custom_text_button).setOnClickListener {
            Log.i("Jorge", "Tapped Custom Text Entry")

            // Returns visibility to custom text
            findViewById<EditText>(R.id.custom_text_entry).visibility = View.VISIBLE

            // Assigns edit text to value and requests focus
            editText.requestFocus()
            inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
        }
    }
}

