package com.example.dsl.builders

import com.example.console.shapes.Rhombus

class RhombusBuilder : ShapeBuilder() {
    override fun build() = Rhombus(lines, char)
}