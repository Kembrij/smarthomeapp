package com.kembrij.smarthomeapp.domain.model

data class SmartHome(
    val user_account_id: Long,
    val home_name: String,
    val address: String,
    val details: String
)
