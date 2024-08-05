package com.example.icds
import com.example.icds.RequestModel
import com.example.icds.ResponseModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @Headers("Accept: application/json")
    //@Headers( "Content-Type: application/json" )
    @POST("/icds/index.php/user")
    fun sendReq(@Body requestModel: RequestModel) : Call<ResponseModel>
}