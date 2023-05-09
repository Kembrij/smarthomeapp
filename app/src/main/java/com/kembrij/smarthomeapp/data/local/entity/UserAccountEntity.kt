package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
data class UserAccountEntity(
    @PrimaryKey(autoGenerate = true) val accountId: Long = 0,
    val firstName: String,
    val lastName: String,
    val userName: String,
    val email: String,
    val password: String
)
