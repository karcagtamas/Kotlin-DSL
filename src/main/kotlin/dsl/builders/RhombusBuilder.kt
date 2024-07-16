package com.example.dsl.builders

import com.example.console.shapes.Rhombus

class RhombusBuilder {
    var lines = 0
    var char = '*'

    fun build() = Rhombus(lines, char)
}