package com.example.dsl.builders

import com.example.console.shapes.Square

class SquareBuilder {
    var lines = 0
    var char = '*'
    
    fun build() = Square(lines, char)
}