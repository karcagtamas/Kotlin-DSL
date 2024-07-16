package com.example.dsl.builders

import com.example.console.shapes.Square

class SquareBuilder : ShapeBuilder() {
    override fun build() = Square(lines, char)
}