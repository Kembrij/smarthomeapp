package com.kembrij.smarthomeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kembrij.smarthomeapp.data.local.entity.DeviceTypeEntity

@Dao
interface ScriptDao {

    @Insert
    suspend fun insert(script: ScriptDao)

}