package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AwcHistoryListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awc_history_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button from the included layout
        val includedCard = findViewById<View>(R.id.includedCard);
        val seeMoreButton = includedCard.findViewById<Button>(R.id.seeMoreButton);

        // Set a click listener for the button
        seeMoreButton.setOnClickListener(){
            val intent = Intent(this, AwcHistoryDetailsActivity::class.java)
            startActivity(intent)
        }


    }
}