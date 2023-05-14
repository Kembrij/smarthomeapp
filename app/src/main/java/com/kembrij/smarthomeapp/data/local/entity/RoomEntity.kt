package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "rooms",
    foreignKeys = [
        ForeignKey(
            entity = SmartHomeEntity::class,
            parentColumns = ["smarthomeId"],
            childColumns = ["home_Id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
//
data class RoomEntity(
    @PrimaryKey(autoGenerate = true) val room_Id: Long = 0,
    val room_name: String,
    val home_Id: Long
)
