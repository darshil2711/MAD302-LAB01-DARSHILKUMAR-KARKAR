/**
 * Course: MAD302
 * Lab: Lab 01
 * Name: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: 12 February 2026
 *
 * Description:
 * This application allows the user to enter a name and age,
 * create profile objects, store them in a list, and display
 * them on screen. It also logs Android lifecycle methods.
 */
package com.example.profileapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity handles UI interaction and lifecycle logging.
 */
class MainActivity : AppCompatActivity() {

    // Mutable list to store Profile objects
    private val profiles = mutableListOf<Profile>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle", "onCreate called")

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btnAdd = findViewById<Button>(R.id.btnAddProfile)
        val tvProfiles = findViewById<TextView>(R.id.tvProfiles)

        /**
         * Button click listener
         * Reads input, creates Profile object,
         * adds it to list, and updates display.
         */
        btnAdd.setOnClickListener {

            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()

            val profile = Profile(name, age)

            profiles.add(profile)

            var displayText = ""

            for (p in profiles) {
                displayText += "${p.name} - ${p.age}\n"
            }

            tvProfiles.text = displayText
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy called")
    }
}