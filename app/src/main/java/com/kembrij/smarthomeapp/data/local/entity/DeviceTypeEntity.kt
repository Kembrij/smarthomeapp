package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "device_types")
data class DeviceTypeEntity(
    @PrimaryKey(autoGenerate = true) val device_type_Id: Int = 0,
    val device_name: String,
    val description: String?
)
