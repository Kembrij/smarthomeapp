package com.kembrij.smarthomeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import com.kembrij.smarthomeapp.data.local.entity.RoomEntity
import com.kembrij.smarthomeapp.data.local.entity.SmartHomeEntity

@Dao
interface SmartHomeDao {

    @Insert
    suspend fun insert(room: SmartHomeEntity)
}