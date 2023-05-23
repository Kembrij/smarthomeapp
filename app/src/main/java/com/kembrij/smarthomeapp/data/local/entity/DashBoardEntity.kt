package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "dashboards",
    foreignKeys = [
        ForeignKey(
            entity = RoomEntity::class,
            parentColumns = ["room_Id_Pk"],
            childColumns = ["room_Id_Fk"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class DashBoardEntity(
    @PrimaryKey(autoGenerate = true) val dash_board_Id_Pk: Int = 0,

    @ColumnInfo(name = "roomId")
    val room_Id_Fk: Int? = 0,

    @ColumnInfo(name = "url")
    var url: String? = null
)