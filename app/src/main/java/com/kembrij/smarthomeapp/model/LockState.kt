package com.kembrij.smarthomeapp.model

enum class LockState {
    LOCKED,
    LOCKING,
    UNLOCKED,
    UNLOCKING,
    UNKNOWN;

    fun stateToString() = when (this) {
        LOCKED -> "locked"
        LOCKING -> "locking"
        UNLOCKED -> "unlocked"
        UNLOCKING -> "unlocking"
        else -> "unknown"
    }
}