package com.kembrij.smarthomeapp.data.local.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey


data class ScriptEntity(
    @PrimaryKey(autoGenerate = true) val script_Id: Int = 0,
    val scripName: String,
    val lastRun: String
)

