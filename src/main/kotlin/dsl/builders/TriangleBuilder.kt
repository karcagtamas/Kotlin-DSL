package com.example.dsl.builders

import com.example.console.shapes.Triangle

class TriangleBuilder : ShapeBuilder() {
    override fun build() = Triangle(lines, char)
}