package com.example.icds

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterfaceSubmit {

    @Headers("Accept: application/json")
    //@Headers( "Content-Type: application/json" )
    @POST("/icds/index.php/submit")
    fun sendReq(@Body requestModel: RequestModelSubmit) : Call<ResponseModelSubmit>
}