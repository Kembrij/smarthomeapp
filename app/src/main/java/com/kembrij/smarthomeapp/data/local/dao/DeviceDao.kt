package com.kembrij.smarthomeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kembrij.smarthomeapp.data.local.entity.DeviceEntity

@Dao
interface DeviceDao {

    @Insert
    suspend fun insert(device: DeviceEntity)

    @Query("SELECT * FROM devices WHERE deviceId = :id")
    suspend fun getById(id: Long): DeviceEntity?

    @Query("SELECT * FROM devices WHERE room_Id = :room_id")
    suspend fun getByRoomId(room_id: Long): DeviceEntity?

    @Query("SELECT * FROM devices WHERE current_status = :current_status")
    suspend fun getByCurrentStatusId(current_status: String): DeviceEntity?

}