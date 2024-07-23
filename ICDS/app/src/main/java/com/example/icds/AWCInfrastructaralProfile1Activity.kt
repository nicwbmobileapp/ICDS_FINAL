package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AWCInfrastructaralProfile1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awcinfrastructaral_profile1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val isDistUnderSaSpinner: Spinner = findViewById(R.id.isDistUnderSaAwcSpinner)
        val distanceOfNearestHospitalAwcSpinner: Spinner = findViewById(R.id.distanceOfNearestHospitalAwcSpinner)
        val aww_position_spinner: Spinner = findViewById(R.id.aww_position_spinner)
        val awh_position_spinner: Spinner = findViewById(R.id.awh_position_spinner)
        val is_awcis_in_main_charge_of_awm_spinner: Spinner = findViewById(R.id.is_awcis_in_main_charge_of_awm_spinner)
        val ownership_of_building_awc_spinner: Spinner = findViewById(R.id.ownership_of_building_awc_spinner)
        val building_type_awc_spinner: Spinner = findViewById(R.id.building_type_awc_spinner)
        val isLandRegisteredInFavourOfGovtAwcSpinner: Spinner = findViewById(R.id.isLandRegisteredInFavourOfGovtAwcSpinner)

        val saveAndNextbtn  = findViewById<Button>(R.id.saveAndNextAwcBtn)




        saveAndNextbtn.setOnClickListener {
            val intent = Intent(this, AWCInfrastructaralProfile2Activity::class.java)
            startActivity(intent)
        }



        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            isDistUnderSaSpinner.adapter = adapter
        }
        isDistUnderSaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



        ArrayAdapter.createFromResource(
            this,
            R.array.awc_profile_distance_of_hospital,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            distanceOfNearestHospitalAwcSpinner.adapter = adapter
        }

        distanceOfNearestHospitalAwcSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }


        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            aww_position_spinner.adapter = adapter
        }
        aww_position_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

      ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
          awh_position_spinner.adapter = adapter
        }
        awh_position_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



      ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
          is_awcis_in_main_charge_of_awm_spinner.adapter = adapter
        }
        is_awcis_in_main_charge_of_awm_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

      ArrayAdapter.createFromResource(
            this,
            R.array.ownership_of_building_awc_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
          ownership_of_building_awc_spinner.adapter = adapter
        }
        ownership_of_building_awc_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }


      ArrayAdapter.createFromResource(
            this,
            R.array.type_of_building_awc_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
          building_type_awc_spinner.adapter = adapter
        }
        building_type_awc_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            isLandRegisteredInFavourOfGovtAwcSpinner.adapter = adapter
        }
        isLandRegisteredInFavourOfGovtAwcSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }







    }
}