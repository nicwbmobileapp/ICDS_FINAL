package com.example.icds

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ICDSInfrastructure1Activity : AppCompatActivity() {

    // Declare all UI elements
    private lateinit var visitorNameEditText: EditText
    private lateinit var designationSpinner: Spinner
    private lateinit var projectNameEditText: EditText
    private lateinit var awcImageView: ImageView
    private lateinit var awcNameEditText: EditText
    private lateinit var awcCodeEditText: EditText
    private lateinit var awcOpenRadioGroup: RadioGroup
    private lateinit var awwNameEditText: EditText
    private lateinit var awhNameEditText: EditText
    private lateinit var awwAwhPresentSpinner: Spinner
    private lateinit var awwMobileNoEditText: EditText
    private lateinit var aadharVerifiedSpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection_1)

        // Initialize UI elements
        visitorNameEditText = findViewById(R.id.visitor_name)
        designationSpinner = findViewById(R.id.designation_spinner)
        projectNameEditText = findViewById(R.id.project_name)
        awcImageView = findViewById(R.id.awc_image)
        awcNameEditText = findViewById(R.id.awc_name)
        awcCodeEditText = findViewById(R.id.awc_code)
        awcOpenRadioGroup = findViewById(R.id.awc_open_radio_group)
        awwNameEditText = findViewById(R.id.aww_name)
        awhNameEditText = findViewById(R.id.awh_name)
        awwAwhPresentSpinner = findViewById(R.id.aww_awh_present_spinner)
        awwMobileNoEditText = findViewById(R.id.aww_mobile_no)
        aadharVerifiedSpinner = findViewById(R.id.aadhar_verified_spinner)

        // Example: Setting up a Spinner with a string array
        setupSpinner(designationSpinner, R.array.designation_array)
        setupSpinner(awwAwhPresentSpinner, R.array.aww_awh_present_array)
        setupSpinner(aadharVerifiedSpinner, R.array.aadhar_verified_array)

        // Example: Handling RadioGroup selection
        awcOpenRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val isChecked = when (checkedId) {
                R.id.radio_yes -> true
                R.id.radio_no -> false
                else -> null
            }
            // Handle the selection
            Toast.makeText(this, "AWC Open: $isChecked", Toast.LENGTH_SHORT).show()
        }

        // Additional setup can be added here...
    }

    // Helper method to set up a spinner with a string array resource
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
}
