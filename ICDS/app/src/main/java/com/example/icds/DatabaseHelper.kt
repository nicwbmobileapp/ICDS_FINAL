package com.example.icds

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
}
