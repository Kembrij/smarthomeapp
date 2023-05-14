package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import java.time.LocalDateTime


@Entity(
    tableName = "devices",
    foreignKeys = [
        ForeignKey(
            entity = SmartHomeEntity::class,
            parentColumns = ["smarthomeId"],
            childColumns = ["home_Id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = DeviceTypeEntity::class,
            parentColumns = ["device_type_id"],
            childColumns = ["device_type"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class DeviceEntity(
    @PrimaryKey(autoGenerate = true) val deviceId: Long = 0,
    val home_Id: Long,
    val room_Id: Long,
    val device_parameters: String,
    val device_type: Int,
    val current_status: String,
    val time_activated: LocalDateTime,
    val time_deactivated: LocalDateTime,
    val is_active: Boolean
)
