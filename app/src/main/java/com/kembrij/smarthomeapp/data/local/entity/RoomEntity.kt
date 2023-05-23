package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "rooms",
    foreignKeys = [
        ForeignKey(
            entity = SmartHomeEntity::class,
            parentColumns = ["smart_home_Id_Pk"],
            childColumns = ["smart_home_id_Fk"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
//
data class RoomEntity(
    @PrimaryKey(autoGenerate = true) val room_Id_Pk: Int = 0,

    @ColumnInfo(name = "homeId")
    val smart_home_Id_Fk: Int? = 0,

    @ColumnInfo(name = "roomName")
    val room_name: String? = null,

    @ColumnInfo(name = "url")
    var url: String? = null
)
