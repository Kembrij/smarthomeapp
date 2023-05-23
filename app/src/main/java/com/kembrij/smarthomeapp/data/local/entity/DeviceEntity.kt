package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import java.time.LocalDateTime


@Entity(
    tableName = "devices",
    foreignKeys = [
        ForeignKey(
            entity = RoomEntity::class,
            parentColumns = ["room_Id_Pk"],
            childColumns = ["room_Id_Fk"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class DeviceEntity(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,

    @ColumnInfo(name = "roomId")
    val room_Id_Fk: Int,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "type")
    var type: String? = null,

    @ColumnInfo(name = "topic")
    var topic: String? = null,

    @ColumnInfo(name = "payloadActive")
    var payloadActive: String? = null,

    @ColumnInfo(name = "payloadInactive")
    var payloadInactive: String? = null,

    @ColumnInfo(name = "payload")
    var payload: String? = null,

    @ColumnInfo(name = "notify")
    var notify: Boolean = false,

    @ColumnInfo(name = "alarmMode")
    var alarmMode: Boolean = false

)
