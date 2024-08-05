package com.example.icds

import com.example.icds.RequestModelOtp
import com.example.icds.ResponseModelOtp
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterfaceOtp {

    @Headers("Accept: application/json")
    //@Headers( "Content-Type: application/json" )
    @POST("/icds/index.php/otp")
    fun sendReq(@Body requestModelOtp: RequestModelOtp) : Call<ResponseModelOtp>
}