/*package com.example.icds
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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class AWCInfrastructaralProfile3Activity : AppCompatActivity() {
    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView
    var form3Data = HashMap<String, String>()
    var toiletAvlWithinPremisesVal = "0"


    var isToiletFunctionalVal = "0"
    var isRunningWaterFacilityAvlVal = "0"
    var isTapInstalledInToiletVal = "0"
    var isToiletChildFriendlyVal = "0"
    var isToiletWithinBuildingVal = "0"
    var sourceOfFundForToiletConstVal = "0"
    var hasSeparateStoreRoomVal = "0"
    var structureOfStoreRoomVal = "0"
    var descOfKitchenVal = "0"
    var hasSeparateKitchenShedVal = "0"
    var conditionOfKitchenShed = "0"
    var awcHasAdequeteUtensils = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        datePicker = findViewById(R.id.awc_3_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_3_date_view)

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

        // Set the adapters and listeners for the spinners
        setupSpinners()

        // Set up the date picker
        datePicker.setOnClickListener {
            showDatePickerDialog()
        }

        saveAndNextAwc3Btn.setOnClickListener {
            updateFormData()



            val intent = Intent(this, AWCInfrastructaralPreviewActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupSpinners() {
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply adapter to spinners
            findViewById<Spinner>(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.hasSeparateKitchenShadeAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.hasAdequateUtensilsAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.toilet_build_separately_or_not_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.source_of_fund_for_const_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.sourceOfFundForConstructionAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.structure_of_store_room_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.structureOfStoreRoomAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.descriptionOfKitchenAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.toilet_condition_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.conditionOfKitchenShadeAwc3Spinner).adapter = adapter
        }

        // Set listeners for spinners
        setSpinnerListeners()
    }

    private fun setSpinnerListeners() {
        findViewById<Spinner>(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                toiletAvlWithinPremisesVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletFunctionalVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isRunningWaterFacilityAvlVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isTapInstalledInToiletVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletChildFriendlyVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletWithinBuildingVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.sourceOfFundForConstructionAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                sourceOfFundForToiletConstVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateStoreRoomVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.structureOfStoreRoomAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                structureOfStoreRoomVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.descriptionOfKitchenAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                descOfKitchenVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasSeparateKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateKitchenShedVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.conditionOfKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                conditionOfKitchenShed = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasAdequateUtensilsAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                awcHasAdequeteUtensils = parent.getItemAtPosition(position).toString()
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

    private fun updateFormData() {
        form3Data["toiletAvlWithinPremisesVal"] = toiletAvlWithinPremisesVal
        form3Data["isToiletFunctionalVal"] = isToiletFunctionalVal
        form3Data["isRunningWaterFacilityAvlVal"] = isRunningWaterFacilityAvlVal
        form3Data["isTapInstalledInToiletVal"] = isTapInstalledInToiletVal
        form3Data["isToiletChildFriendlyVal"] = isToiletChildFriendlyVal
        form3Data["isToiletWithinBuildingVal"] = isToiletWithinBuildingVal
        form3Data["dobOfConstOfToilet"] = tvSelectedDate.text.toString()
        form3Data["sourceOfFundForToiletConstVal"] = sourceOfFundForToiletConstVal
        form3Data["hasSeparateStoreRoomVal"] = hasSeparateStoreRoomVal
        form3Data["structureOfStoreRoomVal"] = structureOfStoreRoomVal
        form3Data["descOfKitchenVal"] = descOfKitchenVal
        form3Data["hasSeparateKitchenShedVal"] = hasSeparateKitchenShedVal
        form3Data["conditionOfKitchenShed"] = conditionOfKitchenShed
        form3Data["awcHasAdequeteUtensils"] = awcHasAdequeteUtensils
    }
}
*/

package com.example.icds

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.NetworkUtil
import java.util.*

class AWCInfrastructaralProfile3Activity : AppCompatActivity() {
    private lateinit var datePicker: Button
    private lateinit var tvSelectedDate: TextView
    var form3Data = HashMap<String, String>()
    var toiletAvlWithinPremisesVal = "0"
    var isToiletFunctionalVal = "0"
    var isRunningWaterFacilityAvlVal = "0"
    var isTapInstalledInToiletVal = "0"
    var isToiletChildFriendlyVal = "0"
    var isToiletWithinBuildingVal = "0"
    var sourceOfFundForToiletConstVal = "0"
    var hasSeparateStoreRoomVal = "0"
    var structureOfStoreRoomVal = "0"
    var descOfKitchenVal = "0"
    var hasSeparateKitchenShedVal = "0"
    var conditionOfKitchenShed = "0"
    var awcHasAdequeteUtensils = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.awcinfrastructaral_profile3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        datePicker = findViewById(R.id.awc_3_choose_date_btn)
        tvSelectedDate = findViewById(R.id.awc_3_date_view)

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

        // Set the adapters and listeners for the spinners
        setupSpinners()

        // Set up the date picker
        datePicker.setOnClickListener {
            showDatePickerDialog()
        }

        saveAndNextAwc3Btn.setOnClickListener {
            updateFormData()

            // Display the HashMap contents in a toast
           // Toast.makeText(this, formatFormData(), Toast.LENGTH_LONG).show()


            if (NetworkUtil.isNetworkAvailable(this)) {// checking for network availability
                // Proceed with submission
               if (validateFields()) {
                    updateFormData()
                    //val intent = Intent(this, AWCInfrastructaralPreviewActivity::class.java)
                   val intent = Intent(this, SuccessActivity::class.java)
                   startActivity(intent)

                    // for showing success on insertion on database
                    /*val intent = Intent(this, SuccessActivity::class.java)
                    startActivity(intent)*/
                }
                // testing click
                /*val intent = Intent(this, SuccessActivity::class.java)
                startActivity(intent)*/
            } else {
                // Show error message
                Toast.makeText(this, "No internet connection available", Toast.LENGTH_SHORT).show()
            }



        }
    }

    // for taking the values and names of the array for spinners

   /* private fun setupSpinners() {
        setSpinnerAdapter(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner, R.array.toilet_build_separately_or_not_awc_3_spinner, R.array.toilet_build_separately_or_not_awc_3_spinner_values)
        setSpinnerAdapter(R.id.sourceOfFundForConstructionAwc3Spinner, R.array.source_of_fund_for_const_awc_3_spinner, R.array.source_of_fund_for_const_awc_3_spinner_values)
        setSpinnerAdapter(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.structureOfStoreRoomAwc3Spinner, R.array.structure_of_store_room_awc_3_spinner, R.array.structure_of_store_room_awc_3_spinner_values)
        setSpinnerAdapter(R.id.descriptionOfKitchenAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.hasSeparateKitchenShadeAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)
        setSpinnerAdapter(R.id.conditionOfKitchenShadeAwc3Spinner, R.array.toilet_condition_awc_2_spinner, R.array.toilet_condition_awc_2_spinner_values)
        setSpinnerAdapter(R.id.hasAdequateUtensilsAwc3Spinner, R.array.spinner_yes_no, R.array.spinner_yes_no_values)

        // Set listeners for spinners
        setSpinnerListeners()
    }

    private fun setSpinnerListeners() {
        findViewById<Spinner>(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                toiletAvlWithinPremisesVal = if (position == 0) "0" else "1"
                // You can also use the previously implemented adapter to get the integer values
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletFunctionalVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isRunningWaterFacilityAvlVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isTapInstalledInToiletVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletChildFriendlyVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletWithinBuildingVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.sourceOfFundForConstructionAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                sourceOfFundForToiletConstVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateStoreRoomVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.structureOfStoreRoomAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                structureOfStoreRoomVal = position.toString()  // Here you may want to set the appropriate values based on your definitions.
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.descriptionOfKitchenAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                descOfKitchenVal = position.toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasSeparateKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateKitchenShedVal = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.conditionOfKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                conditionOfKitchenShed = position.toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasAdequateUtensilsAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                awcHasAdequeteUtensils = if (position == 0) "0" else "1"
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }


    private fun setSpinnerAdapter(spinnerId: Int, stringArrayId: Int, intArrayId: Int) {
        val spinner: Spinner = findViewById(spinnerId)

        val stringArray = resources.getStringArray(stringArrayId)
        val intArray = resources.getIntArray(intArrayId)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, stringArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                when (spinnerId) {
                    R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner -> toiletAvlWithinPremisesVal = intArray[position].toString()
                    R.id.featuresOfToiletWhetherFunctionalAwc3Spinner -> isToiletFunctionalVal = intArray[position].toString()
                    R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner -> isRunningWaterFacilityAvlVal = intArray[position].toString()
                    R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner -> isTapInstalledInToiletVal = intArray[position].toString()
                    R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner -> isToiletChildFriendlyVal = intArray[position].toString()
                    R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner -> isToiletWithinBuildingVal = intArray[position].toString()
                    R.id.sourceOfFundForConstructionAwc3Spinner -> sourceOfFundForToiletConstVal = intArray[position].toString()
                    R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner -> hasSeparateStoreRoomVal = intArray[position].toString()
                    R.id.structureOfStoreRoomAwc3Spinner -> structureOfStoreRoomVal = intArray[position].toString()
                    R.id.descriptionOfKitchenAwc3Spinner -> descOfKitchenVal = intArray[position].toString()
                    R.id.hasSeparateKitchenShadeAwc3Spinner -> hasSeparateKitchenShedVal = intArray[position].toString()
                    R.id.conditionOfKitchenShadeAwc3Spinner -> conditionOfKitchenShed = intArray[position].toString()
                    R.id.hasAdequateUtensilsAwc3Spinner -> awcHasAdequeteUtensils = intArray[position].toString()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }*/

// end of taking the values

    private fun setupSpinners() {
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner_yes_no,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply adapter to spinners
            findViewById<Spinner>(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.hasSeparateKitchenShadeAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.hasAdequateUtensilsAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.toilet_build_separately_or_not_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.source_of_fund_for_const_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.sourceOfFundForConstructionAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.structure_of_store_room_awc_3_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.structureOfStoreRoomAwc3Spinner).adapter = adapter
            findViewById<Spinner>(R.id.descriptionOfKitchenAwc3Spinner).adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.toilet_condition_awc_2_spinner,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.conditionOfKitchenShadeAwc3Spinner).adapter = adapter
        }

        // Set listeners for spinners
        setSpinnerListeners()
    }


    private fun setSpinnerListeners() {
        findViewById<Spinner>(R.id.featuresOfToiletAvlWithinPremisesAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                toiletAvlWithinPremisesVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherFunctionalAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletFunctionalVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherWaterIsAvailableAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isRunningWaterFacilityAvlVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherTapIsInstalledAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isTapInstalledInToiletVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.featuresOfToiletWhetherToiletIsChildFriendlyAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletChildFriendlyVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.whetherToiletBuiltSeparatelyOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                isToiletWithinBuildingVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.sourceOfFundForConstructionAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                sourceOfFundForToiletConstVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.awcHasSeparateStoreRoomOrNotAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateStoreRoomVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.structureOfStoreRoomAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                structureOfStoreRoomVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.descriptionOfKitchenAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                descOfKitchenVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasSeparateKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                hasSeparateKitchenShedVal = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.conditionOfKitchenShadeAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                conditionOfKitchenShed = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        findViewById<Spinner>(R.id.hasAdequateUtensilsAwc3Spinner).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                awcHasAdequeteUtensils = parent.getItemAtPosition(position).toString()
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

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun updateFormData() {
        form3Data["toiletAvlWithinPremisesVal"] = toiletAvlWithinPremisesVal
        form3Data["isToiletFunctionalVal"] = isToiletFunctionalVal
        form3Data["isRunningWaterFacilityAvlVal"] = isRunningWaterFacilityAvlVal
        form3Data["isTapInstalledInToiletVal"] = isTapInstalledInToiletVal
        form3Data["isToiletChildFriendlyVal"] = isToiletChildFriendlyVal
        form3Data["isToiletWithinBuildingVal"] = isToiletWithinBuildingVal
        form3Data["dobOfConstOfToilet"] = tvSelectedDate.text.toString()
        form3Data["sourceOfFundForToiletConstVal"] = sourceOfFundForToiletConstVal
        form3Data["hasSeparateStoreRoomVal"] = hasSeparateStoreRoomVal
        form3Data["structureOfStoreRoomVal"] = structureOfStoreRoomVal
        form3Data["descOfKitchenVal"] = descOfKitchenVal
        form3Data["hasSeparateKitchenShedVal"] = hasSeparateKitchenShedVal
        form3Data["conditionOfKitchenShed"] = conditionOfKitchenShed
        form3Data["awcHasAdequeteUtensils"] = awcHasAdequeteUtensils
    }

    private fun validateFields(): Boolean {
        // showToast("nameOfSchemeVal::" + nameOfSchemeVal + "::" + tvSelectedDate.text.toString() + "::" + typeOfBuildingVal)

        if (toiletAvlWithinPremisesVal == "Select an option") {
            showToast("Please select a scheme.")
            return false
        }
        if (tvSelectedDate.text.toString() == "--/--/--") {
            showToast("Please select a date.")
            return false
        }
        if (isToiletFunctionalVal == "Select an option") {
            showToast("Please select a type of building.")
            return false
        }
        if (isRunningWaterFacilityAvlVal == "Select an option") {
            showToast("Please select a type of drinking water.")
            return false
        }
        if (isTapInstalledInToiletVal == "Select an option") {
            showToast("Please select whether drinking water is available within premises.")
            return false
        }
        if (isToiletChildFriendlyVal == "Select an option") {
            showToast("Please select whether a water filter RO is available.")
            return false
        }
        if (isToiletWithinBuildingVal == "Select an option") {
            showToast("Please select the source of funds for water.")
            return false
        }
        if (structureOfStoreRoomVal == "Select an option") {
            showToast("Please select if water is availed from an outside source.")
            return false
        }
        if (sourceOfFundForToiletConstVal == "Select an option") {
            showToast("Please select the distance of water facility from AWC premises.")
            return false
        }
        if (hasSeparateStoreRoomVal == "Select an option") {
            showToast("Please select the toilet structure.")
            return false
        }
        if (descOfKitchenVal == "Select an option") {
            showToast("Please select the toilet condition.")
            return false
        }
        if (hasSeparateKitchenShedVal == "Select an option") {
            showToast("Please select the type of toilet.")
            return false
        }
        if (conditionOfKitchenShed == "Select an option") {
            showToast("Please select the type of toilet.")
            return false
        }
        if (awcHasAdequeteUtensils == "Select an option") {
            showToast("Please select the type of toilet.")
            return false
        }

        return true
    }

    private fun formatFormData(): String {
        val sb = StringBuilder()
        for ((key, value) in form3Data) {
            sb.append("$key: $value\n")
        }
        return sb.toString()
    }
}
