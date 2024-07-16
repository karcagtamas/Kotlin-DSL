package com.example.dsl

import com.example.console.container.Panel

fun panel(init: Panel.() -> Unit): Panel {
    return Panel().apply { init() }
}