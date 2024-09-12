package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        var userId=""
        var otp=""
        val bundle = intent.extras
        if (bundle != null){
            userId = "${bundle.getString("userId")}"
            otp = "${bundle.getString("otp")}"
        }

        val otpText: TextView = findViewById <TextView>(R.id.otp)
        val et_otpText: TextView = findViewById <TextView>(R.id.et_otp)

       // otpText.setText(otp)
        et_otpText.setText(otp)

       val button: Button = findViewById <Button>(R.id.dialogButtonOK)
        button.setOnClickListener() {
            // Add your click listener logic here

            val otp:String = (findViewById<EditText>(R.id.et_otp)).getText().toString()
            val requestModelOtp = RequestModelOtp(userId, otp)

            val response = ServiceBuilder.buildService(ApiInterfaceOtp::class.java)



            response.sendReq(requestModelOtp).enqueue(
                object : Callback<ResponseModelOtp> {
                    override fun onResponse(
                        call: Call<ResponseModelOtp>,
                        response: Response<ResponseModelOtp>
                    ) {

//                        if(response.code() == 200)
                        if (response.isSuccessful){
                            //val intent = Intent(this@OtpActivity, OtpActivity::class.java)
                            //startActivity(intent)

                            val res = response.body();
                            if (res != null) {



                                val bundle = Bundle()
                                bundle.putString("token", res.token)
                                bundle.putString("userId", userId)
                                val intent = Intent(this@OtpActivity, DashboardActivity::class.java)
                                intent.putExtras(bundle)
                                startActivity(intent)

                            }




                        }else {
                           /* Toast.makeText(
                                this@OtpActivity,/*response.message()*/
                                "Response Code:" + response.code().toString(),
                                Toast.LENGTH_LONG
                            ).show()*/
                        }
                    }

                    override fun onFailure(call: Call<ResponseModelOtp>, t: Throwable) {
                        Toast.makeText(this@OtpActivity,"OTP NOT RECEIVED:"+t.toString(), Toast.LENGTH_LONG).show()
                    }

                }
            )

//            val user = JsonObject()
//            user.addProperty("UserId", "ICDS001")
//            user.addProperty("name", otp)
//
//            Toast.makeText(this@OtpActivity, "1OKKKKKKK", Toast.LENGTH_LONG).show()
//            RetrofitClient
//                .getInstance()
//                .getApi()
//                .otp("ICDS001", otp)?.enqueue(object : Callback<OtpResponse> {
//                    override fun onResponse(
//                        call: Call<OtpResponse>,
//                        response: Response<OtpResponse>
//                    ) {
//                        val otpResponse = response.body()
//                        if (response.isSuccessful) {
//                            // Handle successful response
//                            Toast.makeText(this@OtpActivity, "2OKKKKKKK", Toast.LENGTH_LONG).show()
//                        }
//                        else{
//                            Toast.makeText(this@OtpActivity, "3OKKKKKKK", Toast.LENGTH_LONG).show()
//                        }
//                    }
//
//                    override fun onFailure(call: Call<OtpResponse>, t: Throwable) {
//                        // Handle failure
//                        Toast.makeText(this@OtpActivity, "Error", Toast.LENGTH_LONG).show()
//                    }
//                })


            //val intent = Intent(this@OtpActivity, LoginActivity::class.java)
            //startActivity(intent)
        }
    }



}

/*private fun <T> Call<T>?.enqueue(callback: Callback<OtpResponse>) {


}*/
