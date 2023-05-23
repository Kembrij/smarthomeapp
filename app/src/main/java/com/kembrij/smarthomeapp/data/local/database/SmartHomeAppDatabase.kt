package com.kembrij.smarthomeapp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kembrij.smarthomeapp.data.local.dao.*
import com.kembrij.smarthomeapp.data.local.entity.*
import com.kembrij.smarthomeapp.data.local.converters.*


@Database(
    entities = [
        DeviceEntity::class,
        RoomEntity::class,
        SmartHomeEntity::class,
        UserAccountEntity::class,
        DashBoardEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(LocalDateTimeConverter::class)
abstract class SmartHomeDatabase : RoomDatabase() {

    abstract fun deviceDao(): DeviceDao
    abstract fun roomDao(): RoomDao
    abstract fun smartHomeDao(): SmartHomeDao
    abstract fun userAccountDao(): UserAccountDao

    companion object {

        @Volatile
        private var INSTANCE: SmartHomeDatabase? = null

        fun getDatabase(context: Context): SmartHomeDatabase {
            val temInstance = INSTANCE

            if (temInstance != null) {
                return temInstance
            }

            synchronized(this) {
                val instance = androidx.room.Room.databaseBuilder(
                    context.applicationContext,
                    SmartHomeDatabase::class.java,
                    "smartHomeAppDatabase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }


}