package com.kembrij.smarthomeapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
data class UserAccountEntity(
    @PrimaryKey(autoGenerate = true) val account_Id_Pk: Int = 0,

    @ColumnInfo(name = "firstname")
    val firstName: String? = null,

    @ColumnInfo(name = "lastName")
    val lastName: String? = null,

    @ColumnInfo(name = "userName")
    val userName: String? = null,

    @ColumnInfo(name = "login")
    val login: String? = null,

    @ColumnInfo(name = "password")
    val password: String? = null
)
