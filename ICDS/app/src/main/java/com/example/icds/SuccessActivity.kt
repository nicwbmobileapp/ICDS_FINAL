package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var token=""
        var userId =""
        val bundle = intent.extras
        if (bundle != null){
            token = "${bundle.getString("token")}"
            userId = "${bundle.getString("userId")}"
        }
        setContentView(R.layout.activity_success)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       var btn = findViewById<Button>(R.id.button_finish)

       btn.setOnClickListener(){

           val bundle = Bundle()
           bundle.putString("token", token)
           bundle.putString("userId", userId)
           val intent = Intent(this, DashboardActivity::class.java)
           intent.putExtras(bundle)
           startActivity(intent)
       }
    }
}