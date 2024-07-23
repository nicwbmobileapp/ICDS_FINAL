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

class AWCInfrastructaralProfile3Activity : AppCompatActivity() {
    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awcinfrastructaral_profile3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val featuresOfToiletAvlWithinPremisesAwc3Spinner: Spinner = findViewById(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner)
        val featuresOfToiletWhetherFunctionalAwc3Spinner: Spinner = findViewById(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner)
        val featuresOfToiletWhetherWaterIsAvailableAwc3Spinner: Spinner = findViewById(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner)
        val featuresOfToiletWhetherTapIsInstalledAwc3Spinner: Spinner = findViewById(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner)
        val featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner: Spinner = findViewById(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner)
        val whetherToiletBuiltSeparatelyOrNotAwc3Spinner: Spinner = findViewById(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner)
        val sourceOfFundForConstructionAwc3Spinner: Spinner = findViewById(R.id.sourceOfFundForConstructionAwc3Spinner)
        val awcHasSeparateStoreRoomOrNotAwc3Spinner: Spinner = findViewById(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner)
        val structureOfStoreRoomAwc3Spinner: Spinner = findViewById(R.id.structureOfStoreRoomAwc3Spinner)
        val descriptionOfKitchenAwc3Spinner: Spinner = findViewById(R.id.descriptionOfKitchenAwc3Spinner)
        val hasSeparateKitchenShadeAwc3Spinner: Spinner = findViewById(R.id.hasSeparateKitchenShadeAwc3Spinner)
        val conditionOfKitchenShadeAwc3Spinner: Spinner = findViewById(R.id.conditionOfKitchenShadeAwc3Spinner)
        val hasAdequateUtensilsAwc3Spinner: Spinner = findViewById(R.id.hasAdequateUtensilsAwc3Spinner)
        val saveAndNextAwc3Btn: Button = findViewById(R.id.saveAndNextAwc3Btn)

        // for back button on click
        val toolbar: Toolbar = findViewById(R.id.topAppBarAWCInfrastructure3)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            // Handle the back button click here
            // Handle the back button click here
            val intent = Intent(this, AWCInfrastructaralProfile2Activity::class.java)
            startActivity(intent)
            //onBackPressed()
        }
        // end for back button on click

        saveAndNextAwc3Btn.setOnClickListener{
            val intent = Intent(this, AWCInfrastructaralPreviewActivity::class.java)
            startActivity(intent)
        }




        datePicker = findViewById(R.id.awc_3_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_3_date_view)




        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            featuresOfToiletAvlWithinPremisesAwc3Spinner.adapter = adapter
        }
        featuresOfToiletAvlWithinPremisesAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
        featuresOfToiletWhetherFunctionalAwc3Spinner.adapter = adapter
        }
        featuresOfToiletWhetherFunctionalAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
     featuresOfToiletWhetherWaterIsAvailableAwc3Spinner.adapter = adapter
        }
        featuresOfToiletWhetherWaterIsAvailableAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    featuresOfToiletWhetherTapIsInstalledAwc3Spinner.adapter = adapter
        }
        featuresOfToiletWhetherTapIsInstalledAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner.adapter = adapter
        }
        featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }




ArrayAdapter.createFromResource(
            this,
            R.array.toilet_build_separately_or_not_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    whetherToiletBuiltSeparatelyOrNotAwc3Spinner.adapter = adapter
        }
        whetherToiletBuiltSeparatelyOrNotAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }


ArrayAdapter.createFromResource(
            this,
            R.array.source_of_fund_for_const_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    sourceOfFundForConstructionAwc3Spinner.adapter = adapter
        }
        sourceOfFundForConstructionAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    awcHasSeparateStoreRoomOrNotAwc3Spinner.adapter = adapter
        }
        awcHasSeparateStoreRoomOrNotAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }





ArrayAdapter.createFromResource(
            this,
            R.array.structure_of_store_room_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    structureOfStoreRoomAwc3Spinner.adapter = adapter
        }
        structureOfStoreRoomAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }




ArrayAdapter.createFromResource(
            this,
            R.array.structure_of_store_room_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    descriptionOfKitchenAwc3Spinner.adapter = adapter
        }
        descriptionOfKitchenAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    hasSeparateKitchenShadeAwc3Spinner.adapter = adapter
        }
        hasSeparateKitchenShadeAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    conditionOfKitchenShadeAwc3Spinner.adapter = adapter
        }
        conditionOfKitchenShadeAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
    hasAdequateUtensilsAwc3Spinner.adapter = adapter
        }
        hasAdequateUtensilsAwc3Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
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