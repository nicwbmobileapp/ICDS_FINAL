package com.example.icds

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SyncService : Service() {

    private lateinit var dbHelper: DatabaseHelper

    override fun onCreate() {
        super.onCreate()
        dbHelper = DatabaseHelper(this)
        syncData()
    }

    private fun syncData() {
       /* val cursor = dbHelper.getAllData()
        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndexOrThrow("id"))
                val userId = cursor.getString(cursor.getColumnIndexOrThrow("userId"))
                val dataMap = cursor.getString(cursor.getColumnIndexOrThrow("dataMap"))

                val requestModel = RequestModelSubmit(userId, dataMap)
                val response = ServiceBuilder.buildService(ApiInterfaceSubmit::class.java)
                response.sendReq(requestModel).enqueue(
                    object : Callback<ResponseModelSubmit> {
                        override fun onResponse(call: Call<ResponseModelSubmit>, response: Response<ResponseModelSubmit>) {
                            if (response.code() == 200) {
                                dbHelper.deleteData(id)
                                Toast.makeText(this@SyncService, "Data synced successfully", Toast.LENGTH_SHORT).show()
                            }
                        }

                        override fun onFailure(call: Call<ResponseModelSubmit>, t: Throwable) {
                            Toast.makeText(this@SyncService, "Sync failed: $t", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
            } while (cursor.moveToNext())
        }
        cursor.close()*/
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
