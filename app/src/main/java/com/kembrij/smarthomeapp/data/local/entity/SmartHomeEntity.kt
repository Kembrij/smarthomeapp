package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "smarthomes",
    foreignKeys = [
        ForeignKey(
            entity = UserAccountEntity::class,
            parentColumns = ["account_Id_Pk"],
            childColumns = ["user_account_Id_Fk"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class SmartHomeEntity(
    @PrimaryKey(autoGenerate = true) val smart_home_Id_Pk: Int = 0,

    @ColumnInfo(name = "userAccountId")
    val user_account_Id_Fk: Int? = 0,

    @ColumnInfo(name = "homeName")
    val home_name: String? = null
)
