package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "smarthomes",
    foreignKeys = [
        ForeignKey(
            entity = UserAccountEntity::class,
            parentColumns = ["accountId"],
            childColumns = ["user_account_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class SmartHomeEntity(
    @PrimaryKey(autoGenerate = true) val smarthomeId: Long = 0,
    val user_account_id: Long,
    val home_name: String,
    val address: String,
    val details: String
)
