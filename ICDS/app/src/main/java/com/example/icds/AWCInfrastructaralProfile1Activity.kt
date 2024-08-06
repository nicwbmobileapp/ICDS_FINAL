package com.example.icds
/*
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AWCInfrastructaralProfile1Activity : AppCompatActivity() {

    private val form1Data = HashMap<String, String>()
    private var isDistUnderSaSpinnerVal = "0"
    private var distOfNearestHospitalVal = "0"
    private var whetherAwwInPositionVal = "0"
    private var whetherAwhInPositionVal = "0"
    private var whetherAwcIsInMainChargeOfAwwVal = "0"
    private var ownershipOfBuildingVal = "0"
    private var buildingTypeVal = "0"
    private var premisesAvlLandVal = ""
    private var whetherLandIsRegisterdFavourOfGovtVal = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize all the views
        val isDistUnderSaSpinner: Spinner = findViewById(R.id.isDistUnderSaAwcSpinner)
        val distanceOfNearestHospitalAwcSpinner: Spinner = findViewById(R.id.distanceOfNearestHospitalAwcSpinner)
        val aww_position_spinner: Spinner = findViewById(R.id.aww_position_spinner)
        val awh_position_spinner: Spinner = findViewById(R.id.awh_position_spinner)
        val is_awcis_in_main_charge_of_awm_spinner: Spinner = findViewById(R.id.is_awcis_in_main_charge_of_awm_spinner)
        val ownership_of_building_awc_spinner: Spinner = findViewById(R.id.ownership_of_building_awc_spinner)
        val building_type_awc_spinner: Spinner = findViewById(R.id.building_type_awc_spinner)
        val isLandRegisteredInFavourOfGovtAwcSpinner: Spinner = findViewById(R.id.isLandRegisteredInFavourOfGovtAwcSpinner)

        val projectNameEt: EditText = findViewById(R.id.projectNameEt)
        val gpNameEt: EditText = findViewById(R.id.nameOfGpEt)
        val nameOfAwcEt: EditText = findViewById(R.id.nameOfAwcEt)
        val awcCodeEt: EditText = findViewById(R.id.awcCodeEt)
        val mobileNumEt: EditText = findViewById(R.id.mobileNumEt)
        val premisesLandEt: EditText = findViewById(R.id.premisesLandEt)
        val saveAndNextbtn: Button = findViewById(R.id.saveAndNextAwcBtn)

        // Initialize each variable with its corresponding view from the XML layout
        form1Data["isDistUnderSaSpinner"] = isDistUnderSaSpinnerVal
        form1Data["projectNameVal"] = projectNameEt.text.trim().toString()
        form1Data["gpNameTv"] = gpNameEt.text.trim().toString()
        form1Data["distOfNearestHospitalVal"] = distOfNearestHospitalVal
        form1Data["nameOfAWCVal"] = nameOfAwcEt.text.trim().toString()
        form1Data["awcCodeVal"] = awcCodeEt.text.trim().toString()
        form1Data["whetherAwwInPositionVal"] = whetherAwwInPositionVal
        form1Data["whetherAwhInPositionVal"] = whetherAwhInPositionVal
        form1Data["whetherAwcIsInMainChargeOfAwwVal"] = whetherAwcIsInMainChargeOfAwwVal
        form1Data["mobileNoVal"] = mobileNumEt.text.trim().toString()
        form1Data["ownershipOfBuilding"] = ownershipOfBuildingVal
        form1Data["buildingTypeVal"] = buildingTypeVal
        form1Data["premisesAvlLandVal"] = premisesLandEt.text.trim().toString()
        form1Data["whetherLandIsRegisterdFavourOfGovtVal"] = whetherLandIsRegisterdFavourOfGovtVal

        saveAndNextbtn.setOnClickListener {
            val intent = Intent(this, AWCInfrastructaralProfile2Activity::class.java)
            //intent.putExtra("form1Val", form1Data)
            startActivity(intent)
        }

        // Setting up the spinners
        setupSpinner(isDistUnderSaSpinner, R.array.spinner_yes_no)
        setupSpinner(distanceOfNearestHospitalAwcSpinner, R.array.awc_profile_distance_of_hospital)
        setupSpinner(aww_position_spinner, R.array.spinner_yes_no)
        setupSpinner(awh_position_spinner, R.array.spinner_yes_no)
        setupSpinner(is_awcis_in_main_charge_of_awm_spinner, R.array.spinner_yes_no)
        setupSpinner(ownership_of_building_awc_spinner, R.array.ownership_of_building_awc_spinner)
        setupSpinner(building_type_awc_spinner, R.array.type_of_building_awc_spinner)
        setupSpinner(isLandRegisteredInFavourOfGovtAwcSpinner, R.array.spinner_yes_no) {
            whetherLandIsRegisterdFavourOfGovtVal = it
        }
    }

    private fun setupSpinner(spinner: Spinner, arrayResId: Int, onItemSelected: ((String) -> Unit)? = null) {
        ArrayAdapter.createFromResource(
            this,
            arrayResId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                onItemSelected?.invoke(parent.getItemAtPosition(position).toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No action needed
            }
        }
    }
}*/


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AWCInfrastructaralProfile1Activity : AppCompatActivity() {

    //private val form1Data = HashMap<String, String>()
    private var isDistUnderSaSpinnerVal = "0"
    private var distOfNearestHospitalVal = "0"
    private var whetherAwwInPositionVal = "0"
    private var whetherAwhInPositionVal = "0"
    private var whetherAwcIsInMainChargeOfAwwVal = "0"
    private var ownershipOfBuildingVal = "0"
    private var buildingTypeVal = "0"
    private var premisesAvlLandVal = ""
    private var whetherLandIsRegisterdFavourOfGovtVal = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // for hashmap data
        var token=""
        var userId =""
        val bundle = intent.extras
        if (bundle != null){
            token = "${bundle.getString("token")}"
            userId = "${bundle.getString("userId")}"
        }

        // Initialize all the views
        val isDistUnderSaSpinner: Spinner = findViewById(R.id.isDistUnderSaAwcSpinner)
        val distanceOfNearestHospitalAwcSpinner: Spinner = findViewById(R.id.distanceOfNearestHospitalAwcSpinner)
        val aww_position_spinner: Spinner = findViewById(R.id.aww_position_spinner)
        val awh_position_spinner: Spinner = findViewById(R.id.awh_position_spinner)
        val is_awcis_in_main_charge_of_awm_spinner: Spinner = findViewById(R.id.is_awcis_in_main_charge_of_awm_spinner)
        val ownership_of_building_awc_spinner: Spinner = findViewById(R.id.ownership_of_building_awc_spinner)
        val building_type_awc_spinner: Spinner = findViewById(R.id.building_type_awc_spinner)
        val isLandRegisteredInFavourOfGovtAwcSpinner: Spinner = findViewById(R.id.isLandRegisteredInFavourOfGovtAwcSpinner)

        val projectNameEt: EditText = findViewById(R.id.projectNameEt)
        val gpNameEt: EditText = findViewById(R.id.nameOfGpEt)
        val nameOfAwcEt: EditText = findViewById(R.id.nameOfAwcEt)
        val awcCodeEt: EditText = findViewById(R.id.awcCodeEt)
        val mobileNumEt: EditText = findViewById(R.id.mobileNumEt)
        val premisesLandEt: EditText = findViewById(R.id.premisesLandEt)
        val saveAndNextbtn: Button = findViewById(R.id.saveAndNextAwcBtn)

        // Setting up the spinners
        setupSpinner(isDistUnderSaSpinner, R.array.spinner_yes_no) {
            isDistUnderSaSpinnerVal = it
        }
        setupSpinner(distanceOfNearestHospitalAwcSpinner, R.array.awc_profile_distance_of_hospital) {
            distOfNearestHospitalVal = it
        }
        setupSpinner(aww_position_spinner, R.array.spinner_yes_no) {
            whetherAwwInPositionVal = it
        }
        setupSpinner(awh_position_spinner, R.array.spinner_yes_no) {
            whetherAwhInPositionVal = it
        }
        setupSpinner(is_awcis_in_main_charge_of_awm_spinner, R.array.spinner_yes_no) {
            whetherAwcIsInMainChargeOfAwwVal = it
        }
        setupSpinner(ownership_of_building_awc_spinner, R.array.ownership_of_building_awc_spinner) {
            ownershipOfBuildingVal = it
        }
        setupSpinner(building_type_awc_spinner, R.array.type_of_building_awc_spinner) {
            buildingTypeVal = it
        }
        setupSpinner(isLandRegisteredInFavourOfGovtAwcSpinner, R.array.spinner_yes_no) {
            whetherLandIsRegisterdFavourOfGovtVal = it
        }

        saveAndNextbtn.setOnClickListener {
            // Validate EditText fields
            if (projectNameEt.text.trim().isEmpty()) {
                showToast("Please enter the project name")
                return@setOnClickListener
            }

            if (gpNameEt.text.trim().isEmpty()) {
                showToast("Please enter the Gram Panchayat name")
                return@setOnClickListener
            }

            if (nameOfAwcEt.text.trim().isEmpty()) {
                showToast("Please enter the name of AWC")
                return@setOnClickListener
            }

            if (awcCodeEt.text.trim().isEmpty()) {
                showToast("Please enter the AWC code")
                return@setOnClickListener
            }

            if (mobileNumEt.text.trim().isEmpty()) {
                showToast("Please enter the mobile number")
                return@setOnClickListener
            }

            if (premisesLandEt.text.trim().isEmpty()) {
                showToast("Please enter the total land available within premises")
                return@setOnClickListener
            }

            // Validate Spinner fields
            if (isDistUnderSaSpinner.selectedItem.toString() == "Select an option") {
                showToast("Please select if the district is under Saksham Anganwadi")
                return@setOnClickListener
            }

            if (distanceOfNearestHospitalAwcSpinner.selectedItem.toString() == "Select an option") {
                showToast("Please select the distance of the nearest hospital")
                return@setOnClickListener
            }

            if (aww_position_spinner.selectedItem.toString() == "Select an option") {
                showToast("Please select if AWW is in position")
                return@setOnClickListener
            }

            if (awh_position_spinner.selectedItem.toString() == "Select an option") {
                showToast("Please select if AWH is in position")
                return@setOnClickListener
            }

            if (is_awcis_in_main_charge_of_awm_spinner.selectedItem.toString() == "Select an option") {
                showToast("Please select if the AWC is in main charge of AWW")
                return@setOnClickListener
            }

            if (ownership_of_building_awc_spinner.selectedItem.toString() == "Select an option") {
                showToast("Please select the ownership of the building")
                return@setOnClickListener
            }

            if (building_type_awc_spinner.selectedItem.toString() == "Select an option") {
                showToast("Please select the building type")
                return@setOnClickListener
            }

            if (isLandRegisteredInFavourOfGovtAwcSpinner.selectedItem.toString() == "Select an option") {
                showToast("Please select if the land is registered in favour of the government")
                return@setOnClickListener
            }

            // from somnath

           /* DataHolder.DataMap["isDistUnderSaSpinner"] = isDistUnderSaSpinnerVal
            DataHolder.DataMap["projectNameVal"] = projectNameEt.text.trim().toString()
            DataHolder.DataMap["gpNameTv"] = gpNameEt.text.trim().toString()
            DataHolder.DataMap["distOfNearestHospitalVal"] = distOfNearestHospitalVal
            DataHolder.DataMap["nameOfAWCVal"] = nameOfAwcEt.text.trim().toString()
            DataHolder.DataMap["awcCodeVal"] = awcCodeEt.text.trim().toString()
            DataHolder.DataMap["whetherAwwInPositionVal"] = whetherAwwInPositionVal
            DataHolder.DataMap["whetherAwhInPositionVal"] = whetherAwhInPositionVal
            DataHolder.DataMap["whetherAwcIsInMainChargeOfAwwVal"] = whetherAwcIsInMainChargeOfAwwVal
            DataHolder.DataMap["mobileNoVal"] = mobileNumEt.text.trim().toString()
            DataHolder.DataMap["ownershipOfBuilding"] = ownershipOfBuildingVal
            DataHolder.DataMap["buildingTypeVal"] = buildingTypeVal
            DataHolder.DataMap["premisesAvlLandVal"] = premisesLandEt.text.trim().toString()
            DataHolder.DataMap["whetherLandIsRegisterdFavourOfGovtVal"] = whetherLandIsRegisterdFavourOfGovtVal


            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)
            val intent = Intent(this, AWCInfrastructaralProfile2Activity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)*/

            // If all fields are valid, proceed to the next activity
            DataHolder.DataMap["isDistUnderSaSpinner"] = isDistUnderSaSpinner.selectedItem.toString()
            DataHolder.DataMap["projectNameVal"] = projectNameEt.text.trim().toString()
            DataHolder.DataMap["gpNameTv"] = gpNameEt.text.trim().toString()
            DataHolder.DataMap["distOfNearestHospitalVal"] = distanceOfNearestHospitalAwcSpinner.selectedItem.toString()
            DataHolder.DataMap["nameOfAWCVal"] = nameOfAwcEt.text.trim().toString()
            DataHolder.DataMap["awcCodeVal"] = awcCodeEt.text.trim().toString()
            DataHolder.DataMap["whetherAwwInPositionVal"] = aww_position_spinner.selectedItem.toString()
            DataHolder.DataMap["whetherAwhInPositionVal"] = awh_position_spinner.selectedItem.toString()
            DataHolder.DataMap["whetherAwcIsInMainChargeOfAwwVal"] = is_awcis_in_main_charge_of_awm_spinner.selectedItem.toString()
            DataHolder.DataMap["mobileNoVal"] = mobileNumEt.text.trim().toString()
            DataHolder.DataMap["ownershipOfBuilding"] = ownership_of_building_awc_spinner.selectedItem.toString()
            DataHolder.DataMap["buildingTypeVal"] = building_type_awc_spinner.selectedItem.toString()
            DataHolder.DataMap["premisesAvlLandVal"] = premisesLandEt.text.trim().toString()
            DataHolder.DataMap["whetherLandIsRegisterdFavourOfGovtVal"] = isLandRegisteredInFavourOfGovtAwcSpinner.selectedItem.toString()


            // adding all fields data to hashmap
            AwcInfraDataStorage.dataMap["isDistUnderSaSpinner"] = isDistUnderSaSpinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["projectNameVal"] = projectNameEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["gpNameTv"] = gpNameEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["distOfNearestHospitalVal"] = distanceOfNearestHospitalAwcSpinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["nameOfAWCVal"] = nameOfAwcEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["awcCodeVal"] = awcCodeEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["whetherAwwInPositionVal"] = aww_position_spinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["whetherAwhInPositionVal"] = awh_position_spinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["whetherAwcIsInMainChargeOfAwwVal"] = is_awcis_in_main_charge_of_awm_spinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["mobileNoVal"] = mobileNumEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["ownershipOfBuilding"] = ownership_of_building_awc_spinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["buildingTypeVal"] = building_type_awc_spinner.selectedItem.toString()
            AwcInfraDataStorage.dataMap["premisesAvlLandVal"] = premisesLandEt.text.trim().toString()
            AwcInfraDataStorage.dataMap["whetherLandIsRegisterdFavourOfGovtVal"] = isLandRegisteredInFavourOfGovtAwcSpinner.selectedItem.toString()





            val intent = Intent(this, AWCInfrastructaralProfile2Activity::class.java)
            startActivity(intent)

//            println(AwcInfraDataStorage.dataMap["projectNameVal"])
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun setupSpinner(spinner: Spinner, arrayResId: Int, onItemSelected: ((String) -> Unit)? = null) {
        ArrayAdapter.createFromResource(
            this,
            arrayResId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                onItemSelected?.invoke(parent.getItemAtPosition(position).toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No action needed
            }
        }
    }

    private fun validateFields(vararg fields: EditText): Boolean {
        var isValid = true
        fields.forEach { field ->
            if (field.text.trim().isEmpty()) {
                field.error = "This field is required"
                isValid = false
            }
        }
        return isValid
    }
}

