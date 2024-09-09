package com.example.icds
/*
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class ICDSInfrastructure2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection2)

        // Find all EditTexts
        val numChildren6m6yrs = findViewById<EditText>(R.id.num_children_6m_6yrs)
        val numPregnantWomen = findViewById<EditText>(R.id.num_pregnant_women)
        val numLactatingMothers = findViewById<EditText>(R.id.num_lactating_mothers)
        val numAdolescentGirls = findViewById<EditText>(R.id.num_adolescent_girls)
        val growthChartAvailable = findViewById<EditText>(R.id.growth_chart_available)
        val suwChildren = findViewById<EditText>(R.id.suw_children)
        val foodStockAvailable = findViewById<EditText>(R.id.food_stock_available)

        // Find RadioGroups and their RadioButtons
        val awcOwnBuildingGroup = findViewById<RadioGroup>(R.id.awc_own_building)
        val electricityConnectionGroup = findViewById<RadioGroup>(R.id.electricity_connection)
        val toiletWithinAdjacentGroup = findViewById<RadioGroup>(R.id.toilet_within_adjacent)
        val toiletFitGroup = findViewById<RadioGroup>(R.id.toilet_fit)
        val drinkingWaterGroup = findViewById<RadioGroup>(R.id.drinking_water)
        val dietChartDisplayedGroup = findViewById<RadioGroup>(R.id.diet_chart_displayed)
        val foodCookedAsperChartGroup = findViewById<RadioGroup>(R.id.food_cooked_asper_chart)
        val musurDalSmallGroup = findViewById<RadioGroup>(R.id.musur_dal_small)
        val foodGrainsStoredGroup = findViewById<RadioGroup>(R.id.food_grains_stored)
        val kitchenShedGroup = findViewById<RadioGroup>(R.id.kitchen_shed)
        val lpgConnectionGroup = findViewById<RadioGroup>(R.id.lpg_connection)
        val kitchenCleanGroup = findViewById<RadioGroup>(R.id.kitchen_clean)

        // Find Spinners
        val waterInstallationTypeSpinner = findViewById<Spinner>(R.id.water_installation_type)
        val waterSourceTypeSpinner = findViewById<Spinner>(R.id.water_source_type)
        val mustardOilBrandSpinner = findViewById<Spinner>(R.id.mustard_oil_brand)
        val iodizedSaltBrandSpinner = findViewById<Spinner>(R.id.iodized_salt_brand)
        val storeRoomConditionSpinner = findViewById<Spinner>(R.id.store_room_condition)
        val riceStockDurationSpinner = findViewById<Spinner>(R.id.rice_stock_duration)

        // Set up Spinners with ArrayAdapter if needed
        setupSpinner(waterInstallationTypeSpinner, R.array.water_installation_type)
        setupSpinner(waterSourceTypeSpinner, R.array.water_source_type)
        setupSpinner(mustardOilBrandSpinner, R.array.mustard_oil_brand)
        setupSpinner(iodizedSaltBrandSpinner, R.array.iodized_salt_brand)
        setupSpinner(storeRoomConditionSpinner, R.array.store_room_condition)
        setupSpinner(riceStockDurationSpinner, R.array.rice_stock_duration)

        // Handle the rest of your logic here, such as saving the input or validating fields
    }

    private fun setupSpinner(spinner: Spinner, arrayResId: Int) {
        ArrayAdapter.createFromResource(
            this,
            arrayResId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    // Add methods to handle form submission, validation, etc.

}*/

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class ICDSInfrastructure2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var token=""
        var userId =""
        val bundle = intent.extras
        if (bundle != null){
            token = "${bundle.getString("token")}"
            userId = "${bundle.getString("userId")}"
        }

       /* val nextButton: Button = findViewById(R.id.saveAndNextICDSBtn)
        val bckButton: Button = findViewById(R.id.BackBtnForICDSInsp)*/

        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection2) // Replace with your actual layout name






        // EditTexts
        val numChildren6m6yrs = findViewById<EditText>(R.id.num_children_6m_6yrs)
        val numPregnantWomen = findViewById<EditText>(R.id.num_pregnant_women)
        val numLactatingMothers = findViewById<EditText>(R.id.num_lactating_mothers)
        val numAdolescentGirls = findViewById<EditText>(R.id.num_adolescent_girls)
        val growthChartAvailable = findViewById<EditText>(R.id.growth_chart_available)
        val suwChildren = findViewById<EditText>(R.id.suw_children)
        val foodStockAvailable = findViewById<EditText>(R.id.food_stock_available)

        // RadioGroups and RadioButtons
        val awcOwnBuildingGroup = findViewById<RadioGroup>(R.id.awc_own_building)
        val electricityConnectionGroup = findViewById<RadioGroup>(R.id.electricity_connection)
        val toiletWithinAdjacentGroup = findViewById<RadioGroup>(R.id.toilet_within_adjacent)
        val toiletFitGroup = findViewById<RadioGroup>(R.id.toilet_fit)
        val drinkingWaterGroup = findViewById<RadioGroup>(R.id.drinking_water)
        val dietChartDisplayedGroup = findViewById<RadioGroup>(R.id.diet_chart_displayed)
        val foodCookedAsperChartGroup = findViewById<RadioGroup>(R.id.food_cooked_asper_chart)
        val musurDalSmallGroup = findViewById<RadioGroup>(R.id.musur_dal_small)
        val foodGrainsStoredGroup = findViewById<RadioGroup>(R.id.food_grains_stored)
        val kitchenShedGroup = findViewById<RadioGroup>(R.id.kitchen_shed)
        val lpgConnectionGroup = findViewById<RadioGroup>(R.id.lpg_connection)
        val kitchenCleanGroup = findViewById<RadioGroup>(R.id.kitchen_clean)

        // Spinners
        val waterInstallationType = findViewById<Spinner>(R.id.water_installation_type)
        val waterSourceType = findViewById<Spinner>(R.id.water_source_type)
        val mustardOilBrand = findViewById<Spinner>(R.id.mustard_oil_brand)
        val iodizedSaltBrand = findViewById<Spinner>(R.id.iodized_salt_brand)
        val storeRoomCondition = findViewById<Spinner>(R.id.store_room_condition)
        val riceStockDuration = findViewById<Spinner>(R.id.rice_stock_duration)
        val saveAndNextICDS2Btn = findViewById<Button>(R.id.saveAndNextICDSBtn)
        val BackBtnForICDSInsp = findViewById<Button>(R.id.BackBtnForICDSInsp)

        // Example: Retrieve values from RadioGroup
        val selectedAwcBuildingOptionId = awcOwnBuildingGroup.checkedRadioButtonId
        val selectedAwcBuildingOption = findViewById<RadioButton>(selectedAwcBuildingOptionId)

        // Example: Retrieve text from EditText
        val numberOfChildren = numChildren6m6yrs.text.toString()

        // Example: Retrieve selected item from Spinner
        val selectedWaterInstallationType = waterInstallationType.selectedItem.toString()

        // You can now use these values in your logic or save them to a database, etc.

        saveAndNextICDS2Btn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)
            val intent = Intent(this, ICDSInfrastructure3::class.java)
            //intent.putExtras(bundle)
            startActivity(intent)
        }

        BackBtnForICDSInsp.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)
            val intent = Intent(this, ICDSInfrastructure1::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}

