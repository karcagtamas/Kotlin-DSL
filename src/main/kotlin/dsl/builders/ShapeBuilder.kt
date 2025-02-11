package com.example.dsl.builders

import com.example.console.shapes.Shape
import com.example.dsl.markers.ShapeDsl

@ShapeDsl
abstract class ShapeBuilder {
    private companion object {
        const val DEFAULT_CHAR = '*'
    }
    
    var char = DEFAULT_CHAR
    var lines = 0
    
    abstract fun build(): Shape
}