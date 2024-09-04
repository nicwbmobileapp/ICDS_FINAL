package com.example.icds
/*
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "myDatabase.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "awc_infrastructure"
        private const val COLUMN_KEY = "key"
        private const val COLUMN_VALUE = "value"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = ("CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_KEY TEXT PRIMARY KEY," +
                "$COLUMN_VALUE TEXT)")
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertHashMap(hashMap: HashMap<String, String>) {
        val db = this.writableDatabase
        db.beginTransaction()
        try {
            for ((key, value) in hashMap) {
                val contentValues = ContentValues().apply {
                    put(COLUMN_KEY, key)
                    put(COLUMN_VALUE, value)
                }
                db.insertWithOnConflict(TABLE_NAME, null, contentValues, SQLiteDatabase.CONFLICT_REPLACE)
            }
            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
            db.close()
        }
    }

    fun getHashMap(): HashMap<String, String> {
        val hashMap = HashMap<String, String>()
        val db = this.readableDatabase
        val cursor = db.query(TABLE_NAME, arrayOf(COLUMN_KEY, COLUMN_VALUE),
            null, null, null, null, null)

        with(cursor) {
            while (moveToNext()) {
                val key = getString(getColumnIndexOrThrow(COLUMN_KEY))
                val value = getString(getColumnIndexOrThrow(COLUMN_VALUE))
                hashMap[key] = value
            }
        }
        cursor.close()
        db.close()
        return hashMap
    }
}*/


import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

// Constants for database
const val DATABASE_NAME = "myDatabase.db"
const val DATABASE_VERSION = 1
const val TABLE_NAME = "awc_infrastructure"
const val COLUMN_ID = "id"
const val COLUMN_HASHMAP_JSON_ARRAY = "hashmap_json_array"
private const val TABLE_LOCATION = "Location"


private const val COLUMN_KEY = "key"
private const val COLUMN_VALUE = "value"


class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_HASHMAP_JSON_ARRAY TEXT
            )
        """.trimIndent()
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // Method to insert HashMap as a JSON array
    fun insertHashMapAsArray(hashMap: HashMap<String, String>) {
        val gson = Gson()
        val jsonArray = gson.toJson(hashMap.toList()) // Convert HashMap to JSON array of key-value pairs

        val db = this.writableDatabase
        db.beginTransaction()
        try {
            val contentValues = ContentValues().apply {
                put(COLUMN_HASHMAP_JSON_ARRAY, jsonArray)
            }

            val rowId = db.insertWithOnConflict(TABLE_NAME, null, contentValues, SQLiteDatabase.CONFLICT_REPLACE)

            if (rowId == -1L) {
                Log.e("SQLite", "Error inserting HashMap as array")
            } else {
                Log.d("SQLite", "Successfully inserted HashMap as array with rowId: $rowId")
            }

            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
            db.close()
        }
    }

    // Method to retrieve all HashMap arrays from the database
    fun getAllHashMapArrays(): List<List<Pair<String, String>>> {
        val db = this.readableDatabase
        val cursor = db.query(
            TABLE_NAME,
            arrayOf(COLUMN_HASHMAP_JSON_ARRAY),
            null,
            null,
            null,
            null,
            null
        )

        val allHashMapArrays = mutableListOf<List<Pair<String, String>>>()

        cursor?.use {
            if (cursor.moveToFirst()) {
                do {
                    val jsonArray = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_HASHMAP_JSON_ARRAY))
                    val gson = Gson()
                    val type = object : TypeToken<List<Pair<String, String>>>() {}.type
                    val hashMapArray: List<Pair<String, String>> = gson.fromJson(jsonArray, type)
                    allHashMapArrays.add(hashMapArray)
                } while (cursor.moveToNext())
            }
        }
        return allHashMapArrays
    }

    fun insertHashMap(hashMap: HashMap<String, String>) {
        val db = this.writableDatabase
        db.beginTransaction()
        try {
            for ((key, value) in hashMap) {
                val contentValues = ContentValues().apply {
                    put(COLUMN_KEY, key)
                    put(COLUMN_VALUE, value)
                }
                db.insertWithOnConflict(TABLE_NAME, null, contentValues, SQLiteDatabase.CONFLICT_REPLACE)
            }
            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
            db.close()
        }
    }

    // Function to get all locations
    fun getAllLocations(): Cursor {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_LOCATION", null)
    }

}
