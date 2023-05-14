package com.kembrij.smarthomeapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kembrij.smarthomeapp.data.local.dao.*
import com.kembrij.smarthomeapp.data.local.entity.*
import com.kembrij.smarthomeapp.data.local.converters.*


@Database(
    entities = [
        DeviceEntity::class,
        DeviceTypeEntity::class,
        RoomEntity::class,
        SmartHomeEntity::class,
        UserAccountEntity::class,
        ScriptEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(LocalDateTimeConverter::class)
abstract class SmartHomeDatabase : RoomDatabase() {

    abstract fun deviceDao(): DeviceDao
    abstract fun deviceTypeDao(): DeviceTypeDao
    abstract fun roomDao(): RoomDao
    abstract fun smartHomeDao(): SmartHomeDao
    abstract fun userAccountDao(): UserAccountDao
}