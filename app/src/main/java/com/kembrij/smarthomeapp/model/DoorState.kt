package com.kembrij.smarthomeapp.model

enum class DoorState {
    OPEN,
    CLOSED,
    UNKNOWN;

    fun stateToString() = when (this) {
        OPEN -> "open"
        CLOSED -> "closed"
        else -> "unknown"
    }
}