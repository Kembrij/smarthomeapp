package com.kembrij.smarthomeapp.utils
import androidx.databinding.ViewDataBinding


inline fun <T : ViewDataBinding> T.executeAfter(block: T.() -> Unit) {
    block()
    executePendingBindings()
}