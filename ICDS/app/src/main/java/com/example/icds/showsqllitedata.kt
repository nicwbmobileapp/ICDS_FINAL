package com.example.icds

import com.example.icds.DatabaseHelper
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class showsqllitedata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.showsqllitedata)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dbHelper = DatabaseHelper(this)
        // Retrieve all inserted data
        val allHashMapArrays = dbHelper.getAllHashMapArrays()

        // Find the TextView where data will be displayed
        val textViewData = findViewById<TextView>(R.id.textViewData)

        // Create a StringBuilder to concatenate all the data
        val displayText = StringBuilder()

        // Iterate over each HashMap array and append it to the StringBuilder
        allHashMapArrays.forEachIndexed { index, hashMapArray ->
            displayText.append("HashMap Array $index:\n")
            hashMapArray.forEach { (key, value) ->
                displayText.append("$key: $value\n")
            }
            displayText.append("---------------------------\n")
        }

        // Set the concatenated text to the TextView
        textViewData.text = displayText.toString()
    }
}
