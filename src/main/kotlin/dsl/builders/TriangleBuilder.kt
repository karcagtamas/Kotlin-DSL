package com.example.dsl.builders

import com.example.console.shapes.Triangle

class TriangleBuilder {
    var lines = 0
    var char = '*'

    fun build() = Triangle(lines, char)
}