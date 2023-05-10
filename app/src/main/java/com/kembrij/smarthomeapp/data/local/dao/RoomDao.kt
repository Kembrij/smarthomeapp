package com.kembrij.smarthomeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kembrij.smarthomeapp.data.local.entity.DeviceEntity
import com.kembrij.smarthomeapp.data.local.entity.RoomEntity

@Dao
interface RoomDao {

    @Insert
    suspend fun insert(room: RoomEntity)
}