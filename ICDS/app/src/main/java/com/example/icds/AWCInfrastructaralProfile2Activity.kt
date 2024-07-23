package com.example.icds

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class AWCInfrastructaralProfile2Activity : AppCompatActivity() {

    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awcinfrastructaral_profile2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nameOfTheSchemeAwc2Spinner: Spinner = findViewById(R.id.nameOfTheSchemeAwc2Spinner)
        val typeOfBuildingAwcSpinner: Spinner = findViewById(R.id.typeOfBuildingAwc2Spinner)
        val typeOfDrinkingWaterAwc2Spinner: Spinner = findViewById(R.id.typeOfDrinkingWaterAwc2Spinner)
        val drinkingWaterFacilityAvailableOrNotAwc2Spinner: Spinner = findViewById(R.id.drinkingWaterFacilityAvailableOrNotAwc2Spinner)
        val waterFilterRoAvailableOrNotAwc2Spinner: Spinner = findViewById(R.id.waterFilterRoAvailableOrNotAwc2Spinner)
        val sourceOfFundForWaterAwc2Spinner: Spinner = findViewById(R.id.sourceOfFundForWaterAwc2Spinner)
        val waterAvailedFromOutsideSourceAwc2Spinner: Spinner = findViewById(R.id.waterAvailedFromOutsideSourceAwc2Spinner)
        val distanceOfWaterFacilityFromAwcPremisesAwc2Spinner: Spinner = findViewById(R.id.distanceOfWaterFacilityFromAwcPremisesAwc2Spinner)
        val toiletStructureAwc2Spinner: Spinner = findViewById(R.id.toiletStructureAwc2Spinner)
        val toiletConditionAwc2Spinner: Spinner = findViewById(R.id.toiletConditionAwc2Spinner)
        val typeOfToiletAwc2Spinner: Spinner = findViewById(R.id.typeOfToiletAwc2Spinner)
        val saveAndNextAwc2Btn: Button = findViewById(R.id.saveAndNextAwc2Btn)

          // for back button on click
        val toolbar: Toolbar = findViewById(R.id.topAppBarAwcInfrastructure2)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            // Handle the back button click here
            val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
            startActivity(intent)
            //onBackPressed()
        }
        // end for back button on click


        datePicker = findViewById(R.id.awc_2_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_2_date_view)


        ArrayAdapter.createFromResource(
            this,
            R.array.name_of_the_scheme_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            nameOfTheSchemeAwc2Spinner.adapter = adapter
        }
        nameOfTheSchemeAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }


            ArrayAdapter.createFromResource(
            this,
            R.array.type_of_building_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                typeOfBuildingAwcSpinner.adapter = adapter
        }
        typeOfBuildingAwcSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

            ArrayAdapter.createFromResource(
            this,
            R.array.type_of_drinking_water_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                typeOfDrinkingWaterAwc2Spinner.adapter = adapter
        }
        typeOfDrinkingWaterAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
                drinkingWaterFacilityAvailableOrNotAwc2Spinner.adapter = adapter
        }
        drinkingWaterFacilityAvailableOrNotAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



            ArrayAdapter.createFromResource(
            this,
            R.array.water_filter_ro_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                waterFilterRoAvailableOrNotAwc2Spinner.adapter = adapter
        }
        waterFilterRoAvailableOrNotAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }






            ArrayAdapter.createFromResource(
            this,
            R.array.source_of_fund_for_water_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                sourceOfFundForWaterAwc2Spinner.adapter = adapter
        }
        sourceOfFundForWaterAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }




         ArrayAdapter.createFromResource(
            this,
            R.array.water_availed_from_outside_source_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
             waterAvailedFromOutsideSourceAwc2Spinner.adapter = adapter
        }
        waterAvailedFromOutsideSourceAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }





     ArrayAdapter.createFromResource(
            this,
            R.array.distance_of_water_facility_from_awc_premises_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
         distanceOfWaterFacilityFromAwcPremisesAwc2Spinner.adapter = adapter
        }
        distanceOfWaterFacilityFromAwcPremisesAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



     ArrayAdapter.createFromResource(
            this,
            R.array.toilet_structure_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
         toiletStructureAwc2Spinner.adapter = adapter
        }
        toiletStructureAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



     ArrayAdapter.createFromResource(
            this,
            R.array.toilet_condition_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
         toiletConditionAwc2Spinner.adapter = adapter
        }
        toiletConditionAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }




     ArrayAdapter.createFromResource(
            this,
            R.array.type_of_toilet_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
         typeOfToiletAwc2Spinner.adapter = adapter
        }
        typeOfToiletAwc2Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }



        saveAndNextAwc2Btn.setOnClickListener{
            val intent = Intent(this, AWCInfrastructaralProfile3Activity::class.java)
            startActivity(intent)
        }




        datePicker.setOnClickListener {
            showDatePickerDialog()
        }




    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                val date = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                tvSelectedDate.text = date
            },
            year,
            month,
            day
        )

        datePickerDialog.show()
    }
}