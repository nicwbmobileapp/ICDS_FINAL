package com.example.icds

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //val anganwadiKendraCard: CardView = findViewById(R.id.awc_card)
       // val icdsInspectionCard: CardView = findViewById(R.id.)



        var token=""
        var userId =""
        val bundle = intent.extras
        if (bundle != null){
            token = "${bundle.getString("token")}"
            userId = "${bundle.getString("userId")}"
        }

        val awcInfCard = findViewById<CardView>(R.id.awc_card)
        awcInfCard.setOnClickListener {
           /*//val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
            val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
            //val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)*/

            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)

            val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }
        /*val icdsinfra = findViewById<CardView>(R.id.awc_card)
        icdsinfra.setOnClickListener {
            /*//val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
             val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
             //val intent = Intent(this, SuccessActivity::class.java)
             startActivity(intent)*/

            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)

            val intent = Intent(this, ICDSInfrastructure1Activity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }*/
    }
}