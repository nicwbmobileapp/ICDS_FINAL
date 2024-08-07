package com.example.icds

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/*class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "awc_profile.db"
        private const val DATABASE_VERSION = 1

        const val TABLE_NAME = "intermediate_data"//""awc_infrastructure3"
        const val COLUMN_ID = "id"

        private const val COLUMN_USER_ID = "userId"
        private const val COLUMN_DATA_MAP = "dataMap"


        const val COLUMN_KEY = "key"
        const val COLUMN_VALUE = "value"
        const val COLUMN_TOILET_AVL_WITHIN_PREMISES = "toiletAvlWithinPremisesVal"
        const val COLUMN_IS_TOILET_FUNCTIONAL = "isToiletFunctionalVal"
        const val COLUMN_IS_RUNNING_WATER_FACILITY = "isRunningWaterFacilityAvlVal"
        const val COLUMN_IS_TAP_INSTALLED = "isTapInstalledInToiletVal"
        const val COLUMN_IS_TOILET_CHILD_FRIENDLY = "isToiletChildFriendlyVal"
        const val COLUMN_IS_TOILET_WITHIN_BUILDING = "isToiletWithinBuildingVal"
        const val COLUMN_SOURCE_OF_FUND_FOR_TOILET_CONST = "sourceOfFundForToiletConstVal"
        const val COLUMN_HAS_SEPARATE_STORE_ROOM = "hasSeparateStoreRoomVal"
        const val COLUMN_STRUCTURE_OF_STORE_ROOM = "structureOfStoreRoomVal"
        const val COLUMN_DESC_OF_KITCHEN = "descOfKitchenVal"
        const val COLUMN_HAS_SEPARATE_KITCHEN_SHED = "hasSeparateKitchenShedVal"
        const val COLUMN_CONDITION_OF_KITCHEN_SHED = "conditionOfKitchenShed"
        const val COLUMN_AWC_HAS_ADEQUATE_UTENSILS = "awcHasAdequeteUtensils"
        const val COLUMN_DATE_OF_CONST_OF_TOILET = "dobOfConstOfToilet"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableStatement_awcinfrastructure3 = ("CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_TOILET_AVL_WITHIN_PREMISES TEXT, " +
                "$COLUMN_IS_TOILET_FUNCTIONAL TEXT, " +
                "$COLUMN_IS_RUNNING_WATER_FACILITY TEXT, " +
                "$COLUMN_IS_TAP_INSTALLED TEXT, " +
                "$COLUMN_IS_TOILET_CHILD_FRIENDLY TEXT, " +
                "$COLUMN_IS_TOILET_WITHIN_BUILDING TEXT, " +
                "$COLUMN_SOURCE_OF_FUND_FOR_TOILET_CONST TEXT, " +
                "$COLUMN_HAS_SEPARATE_STORE_ROOM TEXT, " +
                "$COLUMN_STRUCTURE_OF_STORE_ROOM TEXT, " +
                "$COLUMN_DESC_OF_KITCHEN TEXT, " +
                "$COLUMN_HAS_SEPARATE_KITCHEN_SHED TEXT, " +
                "$COLUMN_CONDITION_OF_KITCHEN_SHED TEXT, " +
                "$COLUMN_AWC_HAS_ADEQUATE_UTENSILS TEXT, " +
                "$COLUMN_DATE_OF_CONST_OF_TOILET TEXT)")
        db.execSQL(createTableStatement_awcinfrastructure3)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertData(data: Map<String, String>): Boolean {
        val db = this.writableDatabase
        /*val contentValues = ContentValues()
        contentValues.put(COLUMN_TOILET_AVL_WITHIN_PREMISES, data[COLUMN_TOILET_AVL_WITHIN_PREMISES])
        contentValues.put(COLUMN_IS_TOILET_FUNCTIONAL, data[COLUMN_IS_TOILET_FUNCTIONAL])
        contentValues.put(COLUMN_IS_RUNNING_WATER_FACILITY, data[COLUMN_IS_RUNNING_WATER_FACILITY])
        contentValues.put(COLUMN_IS_TAP_INSTALLED, data[COLUMN_IS_TAP_INSTALLED])
        contentValues.put(COLUMN_IS_TOILET_CHILD_FRIENDLY, data[COLUMN_IS_TOILET_CHILD_FRIENDLY])
        contentValues.put(COLUMN_IS_TOILET_WITHIN_BUILDING, data[COLUMN_IS_TOILET_WITHIN_BUILDING])
        contentValues.put(COLUMN_SOURCE_OF_FUND_FOR_TOILET_CONST, data[COLUMN_SOURCE_OF_FUND_FOR_TOILET_CONST])
        contentValues.put(COLUMN_HAS_SEPARATE_STORE_ROOM, data[COLUMN_HAS_SEPARATE_STORE_ROOM])
        contentValues.put(COLUMN_STRUCTURE_OF_STORE_ROOM, data[COLUMN_STRUCTURE_OF_STORE_ROOM])
        contentValues.put(COLUMN_DESC_OF_KITCHEN, data[COLUMN_DESC_OF_KITCHEN])
        contentValues.put(COLUMN_HAS_SEPARATE_KITCHEN_SHED, data[COLUMN_HAS_SEPARATE_KITCHEN_SHED])
        contentValues.put(COLUMN_CONDITION_OF_KITCHEN_SHED, data[COLUMN_CONDITION_OF_KITCHEN_SHED])
        contentValues.put(COLUMN_AWC_HAS_ADEQUATE_UTENSILS, data[COLUMN_AWC_HAS_ADEQUATE_UTENSILS])
        contentValues.put(COLUMN_DATE_OF_CONST_OF_TOILET, data[COLUMN_DATE_OF_CONST_OF_TOILET])*/

        val result = db.insert(TABLE_NAME, null, contentValues)
        db.close()
        return result != -1L // returns true if insert was successful
    }

    // for synching data from local sqllite database to main database in intermediate_data table

    fun insertData(userId: String, dataMap: String): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_USER_ID, userId)
        contentValues.put(COLUMN_DATA_MAP, dataMap)
        return db.insert(TABLE_NAME, null, contentValues)
    }

    fun getAllData(): Cursor {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }

    fun deleteData(id: Int): Int {
        val db = this.writableDatabase
        return db.delete(TABLE_NAME, "$COLUMN_ID=?", arrayOf(id.toString()))
    }
}*/



class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "data_map.db"
        private const val DATABASE_VERSION = 1
        const val TABLE_NAME = "data_map"
        const val COLUMN_KEY = "key"
        const val COLUMN_VALUE = "value"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableSQL = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_KEY TEXT PRIMARY KEY,
                $COLUMN_VALUE TEXT
            )
        """
        db?.execSQL(createTableSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertDataMap(dataMap: Map<String, String>): Boolean {
        val db = this.writableDatabase
        db.beginTransaction()
        try {
            for ((key, value) in dataMap) {
                val contentValues = ContentValues().apply {
                    put(COLUMN_KEY, key)
                    put(COLUMN_VALUE, value)
                }
                db.insertWithOnConflict(TABLE_NAME, null, contentValues, SQLiteDatabase.CONFLICT_REPLACE)
            }
            db.setTransactionSuccessful()
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        } finally {
            db.endTransaction()
        }
    }

    fun getDataMap(): Map<String, String> {
        val db = this.readableDatabase
        val cursor = db.query(
            TABLE_NAME,
            arrayOf(COLUMN_KEY, COLUMN_VALUE),
            null, null, null, null, null
        )

        val dataMap = mutableMapOf<String, String>()
        with(cursor) {
            while (moveToNext()) {
                val key = getString(getColumnIndexOrThrow(COLUMN_KEY))
                val value = getString(getColumnIndexOrThrow(COLUMN_VALUE))
                dataMap[key] = value
            }
        }
        cursor.close()
        return dataMap
    }

   /*- fun getAllData(): Any {

    }*/
}

