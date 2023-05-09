package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey


data class DeviceTypeEntity(
    @PrimaryKey(autoGenerate = true) val device_type_Id: Long = 0,
    val device_name: String,
    val description: String?
)
