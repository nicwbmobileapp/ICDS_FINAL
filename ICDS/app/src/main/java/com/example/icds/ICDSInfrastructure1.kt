/*package com.example.icds

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
        setContentView(R.layout.icds_inspection1)

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
}*/
package com.example.icds
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.graphics.Bitmap
import android.provider.MediaStore
import android.widget.*

// for camera picture taking

class ICDSInfrastructure1 : AppCompatActivity() {

    // Request code for camera intent
    private val CAMERA_REQUEST_CODE = 100

    // Declare all UI elements
    private lateinit var visitorNameEditText: EditText
    private lateinit var projectNameEditText: EditText
    private lateinit var awcImageView: ImageView
    private lateinit var awcNameEditText: EditText
    private lateinit var awcCodeEditText: EditText
    private lateinit var awcOpenRadioGroup: RadioGroup
    private lateinit var awwNameEditText: EditText
    private lateinit var awhNameEditText: EditText
    private lateinit var awwMobileNoEditText: EditText
    private lateinit var nextButton: Button
    private lateinit var takePictureButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection1)

        // Initialize UI elements
        visitorNameEditText = findViewById(R.id.visitor_name)
        projectNameEditText = findViewById(R.id.project_name)
        awcImageView = findViewById(R.id.awc_image)
        awcNameEditText = findViewById(R.id.awc_name)
        awcCodeEditText = findViewById(R.id.awc_code)
        awcOpenRadioGroup = findViewById(R.id.awc_open_group)
        awwNameEditText = findViewById(R.id.aww_name)
        awhNameEditText = findViewById(R.id.awh_code)
        awwMobileNoEditText = findViewById(R.id.aww_mobile_no)
        nextButton = findViewById(R.id.nextBtn)
        takePictureButton = findViewById(R.id.take_picture_button)

        // Set up camera button click listener
        takePictureButton.setOnClickListener {
            // Launch the camera
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(packageManager) != null) {
                startActivityForResult(cameraIntent, CAMERA_REQUEST_CODE)
            }
        }

        // Handle Next button click event
        nextButton.setOnClickListener {
            // Collect data and move to the next screen
            val token = intent.extras?.getString("token") ?: ""
            val userId = intent.extras?.getString("userId") ?: ""

            val bundle = Bundle().apply {
                putString("token", token)
                putString("userId", userId)
            }

            val intent = Intent(this, ICDSInfrastructure2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    // Handle the result from camera intent
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            // Get the captured image as a Bitmap
            val imageBitmap = data?.extras?.get("data") as Bitmap
            // Set the image to ImageView
            awcImageView.setImageBitmap(imageBitmap)
        }
    }
}


/*
class ICDSInfrastructure1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var token=""
        var userId =""
        val bundle = intent.extras
        if (bundle != null){
            token = "${bundle.getString("token")}"
            userId = "${bundle.getString("userId")}"
        }


        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection1) // Replace with your actual layout file name

        // Initialize Views
        val visitorNameEditText: EditText = findViewById(R.id.visitor_name)
       // val designationSpinner: Spinner = findViewById(R.id.designation_spinner)
        val projectNameEditText: EditText = findViewById(R.id.project_name)
        val awcImageView: ImageView = findViewById(R.id.awc_image)
        val awcNameEditText: EditText = findViewById(R.id.awc_name)
        val awcCodeEditText: EditText = findViewById(R.id.awc_code)
        val awcOpenGroup: RadioGroup = findViewById(R.id.awc_open_group)
        val awwNameEditText: EditText = findViewById(R.id.aww_name)
        val awhCodeEditText: EditText = findViewById(R.id.awh_code)
        val awwAhwPresentGroup: RadioGroup = findViewById(R.id.aww_ahw_present_group)


        val awwMobileNoEditText: EditText = findViewById(R.id.aww_mobile_no)
        val aadharVerifiedGroup: RadioGroup = findViewById(R.id.aadhar_verified_group)
        val nextButton: Button = findViewById(R.id.nextBtn)

        // Set up Spinner (if required)
      /*  val designationAdapter = ArrayAdapter.createFromResource(
            this, R.array.designation_array, android.R.layout.simple_spinner_item
        )
        designationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        designationSpinner.adapter = designationAdapter*/

        // Handle Button Click
        nextButton.setOnClickListener {


            val bundle = Bundle()
            bundle.putString("token", token)
            bundle.putString("userId", userId)
            val intent = Intent(this, ICDSInfrastructure2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)



         /*   // Collect Data
            val visitorName = visitorNameEditText.text.toString()
          //  val designation = designationSpinner.selectedItem.toString()
            val projectName = projectNameEditText.text.toString()
            val awcName = awcNameEditText.text.toString()
            val awcCode = awcCodeEditText.text.toString()
            val awcOpen = when (awcOpenGroup.checkedRadioButtonId) {
                R.id.awc_open_yes -> "Yes"
                R.id.awc_open_no -> "No"
                else -> ""
            }
            val awwName = awwNameEditText.text.toString()
            val awhCode = awhCodeEditText.text.toString()
            val awwMobileNo = awwMobileNoEditText.text.toString()
            val awwAhwPresent = when (awwAhwPresentGroup.checkedRadioButtonId) {
                R.id.verified_both -> "Both are Present"
                R.id.verified_aww -> "Only AWW Present"
                R.id.verified_awh -> "Only AWH Present"
                else -> ""
            }
            val aadharVerified = when (aadharVerifiedGroup.checkedRadioButtonId) {
                R.id.verified_both -> "Verified for both AWW and AWH"
                R.id.verified_aww -> "Verified Only AWW"
                R.id.verified_awh -> "Verified Only AWH"
                else -> ""
            }*/

            // Handle the data (e.g., send to server, save to SQLite, etc.)
            // For now, just show a Toast as an example
           /* Toast.makeText(
                this,
                "Visitor Name: $visitorName\nDesignation: $designation\nProject Name: $projectName\nAWC Name: $awcName\nAWC Code: $awcCode\nAWC Open: $awcOpen\nAWW Name: $awwName\nAWH Code: $awhCode\nAWW Mobile No: $awwMobileNo\nAWW AWH Present: $awwAhwPresent\nAadhar Verified: $aadharVerified",
                Toast.LENGTH_LONG
            ).show()*/
        }
    }
}*/
/*

package com.example.icds // Replace with your actual package name

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ICDSInfrastructure1 : AppCompatActivity() {

    // Declare UI elements
    private lateinit var visitorNameInput: TextInputEditText
    private lateinit var designationSpinner: Spinner // Assuming you will set up spinner options
    private lateinit var projectNameInput: TextInputEditText
    private lateinit var awcNameInput: TextInputEditText
    private lateinit var awcCodeInput: TextInputEditText
    private lateinit var awcOpenGroup: RadioGroup
    private lateinit var awwNameInput: TextInputEditText
    private lateinit var awhCodeInput: TextInputEditText
    private lateinit var awwAwhPresentGroup: RadioGroup
    private lateinit var awwMobileNoInput: TextInputEditText
    private lateinit var aadharVerifiedGroup: RadioGroup
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.icds_inspection1) // Replace with your actual layout name

        // Initialize UI elements
        visitorNameInput = findViewById(R.id.visitor_name)
        designationSpinner = findViewById(R.id.designation) // Set up spinner with adapter in a real case
        projectNameInput = findViewById(R.id.project_name)
        awcNameInput = findViewById(R.id.awc_name)
        awcCodeInput = findViewById(R.id.awc_code)
        awcOpenGroup = findViewById(R.id.awc_open_group)
        awwNameInput = findViewById(R.id.aww_name)
        awhCodeInput = findViewById(R.id.awh_code)
        awwAwhPresentGroup = findViewById(R.id.aww_ahw_present_group)
        awwMobileNoInput = findViewById(R.id.aww_mobile_no)
        aadharVerifiedGroup = findViewById(R.id.aadhar_verified_group)
        submitButton = findViewById(R.id.submit_button)

        // Set onClickListener for the Submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun handleSubmit() {
        val visitorName = visitorNameInput.text.toString()
        val designation = designationSpinner.selectedItem.toString() // Extract selected designation
        val projectName = projectNameInput.text.toString()
        val awcName = awcNameInput.text.toString()
        val awcCode = awcCodeInput.text.toString()
        val selectedAwcOpenId = awcOpenGroup.checkedRadioButtonId
        val awcOpen = if (selectedAwcOpenId != -1) {
            findViewById<RadioButton>(selectedAwcOpenId).text.toString()
        } else {
            "Not Selected"
        }
        val awwName = awwNameInput.text.toString()
        val awhCode = awhCodeInput.text.toString()
        val selectedAwwAwhPresentId = awwAwhPresentGroup.checkedRadioButtonId
        val awwAwhPresent = if (selectedAwwAwhPresentId != -1) {
            findViewById<RadioButton>(selectedAwwAwhPresentId).text.toString()
        } else {
            "Not Selected"
        }
        val awwMobileNo = awwMobileNoInput.text.toString()
        val selectedAadharVerifiedId = aadharVerifiedGroup.checkedRadioButtonId
        val aadharVerified = if (selectedAadharVerifiedId != -1) {
            findViewById<RadioButton>(selectedAadharVerifiedId).text.toString()
        } else {
            "Not Selected"
        }

        // Checking mandatory fields
        if (visitorName.isEmpty() || projectName.isEmpty() || awwMobileNo.isEmpty()) {
            Toast.makeText(this, "Please fill in all mandatory fields.", Toast.LENGTH_SHORT).show()
            return
        }

        // Handle your logic here (e.g., save data, perform network operation)
        // For now, let's show a Toast with the collected data
        Toast.makeText(this, "Visitor Name: $visitorName\nDesignation: $designation\nProject Name: $projectName\nAWC Open: $awcOpen", Toast.LENGTH_LONG).show()

        // Reset the form if needed
        resetForm()
    }

    private fun resetForm() {
        // Clear input fields
        visitorNameInput.text?.clear()
        // Set other input fields to their default state or empty
        projectNameInput.text?.clear()
        awcNameInput.text?.clear()
        awcCodeInput.text?.clear()
        awwNameInput.text?.clear()
        awhCodeInput.text?.clear()
        awwMobileNoInput.text?.clear()
        designationSpinner.setSelection(0) // Reset spinner to the first position
        awcOpenGroup.clearCheck() // Clear selected radio buttons
        awwAwhPresentGroup.clearCheck()
        aadharVerifiedGroup.clearCheck()
    }
}

*/
