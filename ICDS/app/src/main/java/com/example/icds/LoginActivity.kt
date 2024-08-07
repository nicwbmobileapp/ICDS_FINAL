package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        val button: Button = findViewById<Button>(R.id.loginButton)
        button.setOnClickListener() {
            // Add your click listener logic here

            val userId = (findViewById<EditText>(R.id.usernameEditText)).getText().toString()
            val Password = (findViewById<EditText>(R.id.passwordEditText)).getText().toString()
            //DummyModel
            val requestModel = RequestModel(userId, Password)

            val response = ServiceBuilder.buildService(ApiInterface::class.java)
            response.sendReq(requestModel).enqueue(
                object : Callback<ResponseModel> {
                    override fun onResponse(
                        call: Call<ResponseModel>,
                        response: Response<ResponseModel>
                    ) {

                        if (response.code() == 200) {

                            val res = response.body();
                            if (res != null) {

                                val bundle = Bundle()
                                bundle.putString("userId", userId)
                                bundle.putString("otp", res.otp)
                                val intent = Intent(this@LoginActivity, OtpActivity::class.java)
                                intent.putExtras(bundle)
                                startActivity(intent)

                            }
                        }
                        Toast.makeText(
                            this@LoginActivity,/*response.message()*/
                            "Response Code:" + response.code().toString(),
                            Toast.LENGTH_LONG
                        ).show()
                    }

                    override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                        Toast.makeText(this@LoginActivity, "Somu" + t.toString(), Toast.LENGTH_LONG)
                            .show()
                    }


                }
            )
        }
        /*val loginButton = findViewById<Button>(R.id.loginButton)
loginButton.setOnClickListener {
val intent = Intent(this, DashboardActivity::class.java)
startActivity(intent)
finish()
}*/

    }
}