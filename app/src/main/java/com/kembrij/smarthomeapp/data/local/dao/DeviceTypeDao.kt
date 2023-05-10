package com.kembrij.smarthomeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kembrij.smarthomeapp.data.local.entity.DeviceEntity
import com.kembrij.smarthomeapp.data.local.entity.DeviceTypeEntity

@Dao
interface DeviceTypeDao {

    @Insert
    suspend fun insert(deviceType: DeviceTypeEntity)

    @Query("SELECT * FROM device_types WHERE device_name = :name")
    suspend fun getByName(name: String): DeviceTypeEntity?
}