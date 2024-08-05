package com.example.icds
/*
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class AWCInfrastructaralProfile2Activity : AppCompatActivity() {

    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView

    var form2Data = HashMap<String, String>()

    var nameOfSchemeVal = "0"
    var typeOfBuildingVal = "0"
    var typeOfDrinkingWaterVal = "0"
    var whetherDrinkingWaterAvlWithinPremisesVal = "0"
    var whetherWaterFilterRoAvlVal = "0"
    var sourceOfFundsVal = "0"
    var waterAvailedFromOutsideVal = "0"
    var distanceOfWaterFacilityFromAwcPremisesVal = "0"
    var toiletStructureVal = "0"
    var toiletConditionVal = "0"
    var typeOfToiletVal = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeSpinner(R.id.nameOfTheSchemeAwc2Spinner, R.array.name_of_the_scheme_awc_2_spinner) { nameOfSchemeVal = it }
        initializeSpinner(R.id.typeOfBuildingAwc2Spinner, R.array.type_of_building_awc_2_spinner) { typeOfBuildingVal = it }
        initializeSpinner(R.id.typeOfDrinkingWaterAwc2Spinner, R.array.type_of_drinking_water_awc_2_spinner) { typeOfDrinkingWaterVal = it }
        initializeSpinner(R.id.drinkingWaterFacilityAvailableOrNotAwc2Spinner, R.array.spinner_yes_no) { whetherDrinkingWaterAvlWithinPremisesVal = it }
        initializeSpinner(R.id.waterFilterRoAvailableOrNotAwc2Spinner, R.array.water_filter_ro_awc_2_spinner) { whetherWaterFilterRoAvlVal = it }
        initializeSpinner(R.id.sourceOfFundForWaterAwc2Spinner, R.array.source_of_fund_for_water_awc_2_spinner) { sourceOfFundsVal = it }
        initializeSpinner(R.id.waterAvailedFromOutsideSourceAwc2Spinner, R.array.water_availed_from_outside_source_awc_2_spinner) { waterAvailedFromOutsideVal = it }
        initializeSpinner(R.id.distanceOfWaterFacilityFromAwcPremisesAwc2Spinner, R.array.distance_of_water_facility_from_awc_premises_awc_2_spinner) { distanceOfWaterFacilityFromAwcPremisesVal = it }
        initializeSpinner(R.id.toiletStructureAwc2Spinner, R.array.toilet_structure_awc_2_spinner) { toiletStructureVal = it }
        initializeSpinner(R.id.toiletConditionAwc2Spinner, R.array.toilet_condition_awc_2_spinner) { toiletConditionVal = it }
        initializeSpinner(R.id.typeOfToiletAwc2Spinner, R.array.type_of_toilet_awc_2_spinner) { typeOfToiletVal = it }

        datePicker = findViewById(R.id.awc_2_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_2_date_view)
        datePicker.setOnClickListener { showDatePickerDialog() }

        val saveAndNextAwc2Btn: Button = findViewById(R.id.saveAndNextAwc2Btn)
        saveAndNextAwc2Btn.setOnClickListener {
            updateForm2Data()
           // Log.d("AWCInfrastructaralProfile2", "Navigating to AWCInfrastructaralProfile3Activity")
            val intent = Intent(this, AWCInfrastructaralProfile3Activity::class.java)
            startActivity(intent)
        }
    }

    private fun initializeSpinner(spinnerId: Int, arrayId: Int, onItemSelected: (String) -> Unit) {
        val spinner: Spinner = findViewById(spinnerId)
        ArrayAdapter.createFromResource(
            this,
            arrayId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                onItemSelected(parent.getItemAtPosition(position).toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
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

    private fun updateForm2Data() {
        form2Data["nameOfSchemeVal"] = nameOfSchemeVal
        form2Data["dateOfConstructionBuildingVal"] = tvSelectedDate.text.toString()
        form2Data["typeOfBuildingVal"] = typeOfBuildingVal
        form2Data["typeOfDrinkingWaterVal"] = typeOfDrinkingWaterVal
        form2Data["whetherDrinkingWaterAvlWithinPremisesVal"] = whetherDrinkingWaterAvlWithinPremisesVal
        form2Data["whetherWaterFilterRoAvlVal"] = whetherWaterFilterRoAvlVal
        form2Data["sourceOfFundsVal"] = sourceOfFundsVal
        form2Data["waterAvailedFromOutsideVal"] = waterAvailedFromOutsideVal
        form2Data["distanceOfWaterFacilityFromAwcPremisesVal"] = distanceOfWaterFacilityFromAwcPremisesVal
        form2Data["toiletStructureVal"] = toiletStructureVal
        form2Data["toiletConditionVal"] = toiletConditionVal
        form2Data["typeOfToiletVal"] = typeOfToiletVal
    }
}
*/


import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class AWCInfrastructaralProfile2Activity : AppCompatActivity() {

    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView

    var form2Data = HashMap<String, String>()

    var nameOfSchemeVal = "0"
    var typeOfBuildingVal = "0"
    var typeOfDrinkingWaterVal = "0"
    var whetherDrinkingWaterAvlWithinPremisesVal = "0"
    var whetherWaterFilterRoAvlVal = "0"
    var sourceOfFundsVal = "0"
    var waterAvailedFromOutsideVal = "0"
    var distanceOfWaterFacilityFromAwcPremisesVal = "0"
    var toiletStructureVal = "0"
    var toiletConditionVal = "0"
    var typeOfToiletVal = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeSpinner(R.id.nameOfTheSchemeAwc2Spinner, R.array.name_of_the_scheme_awc_2_spinner) { nameOfSchemeVal = it }
        initializeSpinner(R.id.typeOfBuildingAwc2Spinner, R.array.type_of_building_awc_2_spinner) { typeOfBuildingVal = it }
        initializeSpinner(R.id.typeOfDrinkingWaterAwc2Spinner, R.array.type_of_drinking_water_awc_2_spinner) { typeOfDrinkingWaterVal = it }
        initializeSpinner(R.id.drinkingWaterFacilityAvailableOrNotAwc2Spinner, R.array.spinner_yes_no) { whetherDrinkingWaterAvlWithinPremisesVal = it }
        initializeSpinner(R.id.waterFilterRoAvailableOrNotAwc2Spinner, R.array.water_filter_ro_awc_2_spinner) { whetherWaterFilterRoAvlVal = it }
        initializeSpinner(R.id.sourceOfFundForWaterAwc2Spinner, R.array.source_of_fund_for_water_awc_2_spinner) { sourceOfFundsVal = it }
        initializeSpinner(R.id.waterAvailedFromOutsideSourceAwc2Spinner, R.array.water_availed_from_outside_source_awc_2_spinner) { waterAvailedFromOutsideVal = it }
        initializeSpinner(R.id.distanceOfWaterFacilityFromAwcPremisesAwc2Spinner, R.array.distance_of_water_facility_from_awc_premises_awc_2_spinner) { distanceOfWaterFacilityFromAwcPremisesVal = it }
        initializeSpinner(R.id.toiletStructureAwc2Spinner, R.array.toilet_structure_awc_2_spinner) { toiletStructureVal = it }
        initializeSpinner(R.id.toiletConditionAwc2Spinner, R.array.toilet_condition_awc_2_spinner) { toiletConditionVal = it }
        initializeSpinner(R.id.typeOfToiletAwc2Spinner, R.array.type_of_toilet_awc_2_spinner) { typeOfToiletVal = it }

        datePicker = findViewById(R.id.awc_2_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_2_date_view)
        datePicker.setOnClickListener { showDatePickerDialog() }

        val saveAndNextAwc2Btn: Button = findViewById(R.id.saveAndNextAwc2Btn)
        saveAndNextAwc2Btn.setOnClickListener {
            if (validateFields()) {
                updateForm2Data()
                addAwc2DataToAwcStorage()
                val intent = Intent(this, AWCInfrastructaralProfile3Activity::class.java)
                startActivity(intent)
            }
            /*val intent = Intent(this, AWCInfrastructaralProfile3Activity::class.java)
            startActivity(intent)*/
        }
        val BackBtnForawcinfra2: Button = findViewById(R.id.BackBtnForawcinfra2)
        BackBtnForawcinfra2.setOnClickListener {
            super.onBackPressed()

//                val intent = Intent(this, AWCInfrastructaralProfile1Activity::class.java)
//                startActivity(intent)

        }

    }

    private fun initializeSpinner(spinnerId: Int, arrayId: Int, onItemSelected: (String) -> Unit) {
        val spinner: Spinner = findViewById(spinnerId)
        ArrayAdapter.createFromResource(
            this,
            arrayId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                onItemSelected(parent.getItemAtPosition(position).toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
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

    /*private fun validateFields(): Boolean {
        showToast("nameOfSchemeVal::"+nameOfSchemeVal+"::"+tvSelectedDate.text.toString()+"::"+typeOfBuildingVal)

       /* if (isDistUnderSaSpinner.selectedItem.toString() == "Select an option") {
            showToast("Please select if the district is under Saksham Anganwadi")
            return@setOnClickListener
        }*/

        if (nameOfSchemeVal.toString() == "Select an option") {
            showToast("Please select a scheme.")
            return false
        }
        /*if (nameOfSchemeVal.isBlank() || nameOfSchemeVal == "0") {
            showToast("Please select a scheme.")
            return false
        }*/
        if (tvSelectedDate.text.toString() == "--/--/--") {
            showToast("Please select a date.")
            return false
        }
        if (typeOfBuildingVal.isBlank() || typeOfBuildingVal == "0") {
            showToast("Please select a type of building.")
            return false
        }
        if (typeOfDrinkingWaterVal.isBlank() || typeOfDrinkingWaterVal == "0") {
            showToast("Please select a type of drinking water.")
            return false
        }
        if (whetherDrinkingWaterAvlWithinPremisesVal.isBlank() || whetherDrinkingWaterAvlWithinPremisesVal == "0") {
            showToast("Please select whether drinking water is available within premises.")
            return false
        }
        if (whetherWaterFilterRoAvlVal.isBlank() || whetherWaterFilterRoAvlVal == "0") {
            showToast("Please select whether a water filter RO is available.")
            return false
        }
        if (sourceOfFundsVal.isBlank() || sourceOfFundsVal == "0") {
            showToast("Please select the source of funds for water.")
            return false
        }
        if (waterAvailedFromOutsideVal.isBlank() || waterAvailedFromOutsideVal == "0") {
            showToast("Please select if water is availed from an outside source.")
            return false
        }
        if (distanceOfWaterFacilityFromAwcPremisesVal.isBlank() || distanceOfWaterFacilityFromAwcPremisesVal == "0") {
            showToast("Please select the distance of water facility from AWC premises.")
            return false
        }
        if (toiletStructureVal.isBlank() || toiletStructureVal == "0") {
            showToast("Please select the toilet structure.")
            return false
        }
        if (toiletConditionVal.isBlank() || toiletConditionVal == "0") {
            showToast("Please select the toilet condition.")
            return false
        }
        if (typeOfToiletVal.isBlank() || typeOfToiletVal == "0") {
            showToast("Please select the type of toilet.")
            return false
        }
        return true


    }*/

    private fun validateFields(): Boolean {
       // showToast("nameOfSchemeVal::" + nameOfSchemeVal + "::" + tvSelectedDate.text.toString() + "::" + typeOfBuildingVal)

        if (nameOfSchemeVal == "Select an option") {
            showToast("Please select a scheme.")
            return false
        }
        if (tvSelectedDate.text.toString() == "--/--/--") {
            showToast("Please select a date.")
            return false
        }
        if (typeOfBuildingVal == "Select an option") {
            showToast("Please select a type of building.")
            return false
        }
        if (typeOfDrinkingWaterVal == "Select an option") {
            showToast("Please select a type of drinking water.")
            return false
        }
        if (whetherDrinkingWaterAvlWithinPremisesVal == "Select an option") {
            showToast("Please select whether drinking water is available within premises.")
            return false
        }
        if (whetherWaterFilterRoAvlVal == "Select an option") {
            showToast("Please select whether a water filter RO is available.")
            return false
        }
        if (sourceOfFundsVal == "Select an option") {
            showToast("Please select the source of funds for water.")
            return false
        }
        if (waterAvailedFromOutsideVal == "Select an option") {
            showToast("Please select if water is availed from an outside source.")
            return false
        }
        if (distanceOfWaterFacilityFromAwcPremisesVal == "Select an option") {
            showToast("Please select the distance of water facility from AWC premises.")
            return false
        }
        if (toiletStructureVal == "Select an option") {
            showToast("Please select the toilet structure.")
            return false
        }
        if (toiletConditionVal == "Select an option") {
            showToast("Please select the toilet condition.")
            return false
        }
        if (typeOfToiletVal == "Select an option") {
            showToast("Please select the type of toilet.")
            return false
        }
        return true
    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }



    fun updateForm2Data() {
        form2Data["nameOfSchemeVal"] = nameOfSchemeVal
        form2Data["dateOfConstructionBuildingVal"] = tvSelectedDate.text.toString()
        form2Data["typeOfBuildingVal"] = typeOfBuildingVal
        form2Data["typeOfDrinkingWaterVal"] = typeOfDrinkingWaterVal
        form2Data["whetherDrinkingWaterAvlWithinPremisesVal"] = whetherDrinkingWaterAvlWithinPremisesVal
        form2Data["whetherWaterFilterRoAvlVal"] = whetherWaterFilterRoAvlVal
        form2Data["sourceOfFundsVal"] = sourceOfFundsVal
        form2Data["waterAvailedFromOutsideVal"] = waterAvailedFromOutsideVal
        form2Data["distanceOfWaterFacilityFromAwcPremisesVal"] = distanceOfWaterFacilityFromAwcPremisesVal
        form2Data["toiletStructureVal"] = toiletStructureVal
        form2Data["toiletConditionVal"] = toiletConditionVal
        form2Data["typeOfToiletVal"] = typeOfToiletVal


    }


    fun addAwc2DataToAwcStorage() {
        AwcInfraDataStorage.dataMap["nameOfSchemeVal"] = nameOfSchemeVal
        AwcInfraDataStorage.dataMap["dateOfConstructionBuildingVal"] = tvSelectedDate.text.toString()
        AwcInfraDataStorage.dataMap["typeOfBuildingVal"] = typeOfBuildingVal
        AwcInfraDataStorage.dataMap["typeOfDrinkingWaterVal"] = typeOfDrinkingWaterVal
        AwcInfraDataStorage.dataMap["whetherDrinkingWaterAvlWithinPremisesVal"] = whetherDrinkingWaterAvlWithinPremisesVal
        AwcInfraDataStorage.dataMap["whetherWaterFilterRoAvlVal"] = whetherWaterFilterRoAvlVal
        AwcInfraDataStorage.dataMap["sourceOfFundsVal"] = sourceOfFundsVal
        AwcInfraDataStorage.dataMap["waterAvailedFromOutsideVal"] = waterAvailedFromOutsideVal
        AwcInfraDataStorage.dataMap["distanceOfWaterFacilityFromAwcPremisesVal"] = distanceOfWaterFacilityFromAwcPremisesVal
        AwcInfraDataStorage.dataMap["toiletStructureVal"] = toiletStructureVal
        AwcInfraDataStorage.dataMap["toiletConditionVal"] = toiletConditionVal
        AwcInfraDataStorage.dataMap["typeOfToiletVal"] = typeOfToiletVal
    }
}



