package com.kembrij.smarthomeapp.domain.model

import java.time.LocalDateTime

data class Device(
    val home_Id: Long,
    val room_Id: Long,
    val device_parameters: String,
    val device_type: Int,
    val current_status: String,
    val time_activated: LocalDateTime,
    val time_deactivated: LocalDateTime,
    val is_active: Boolean
)
