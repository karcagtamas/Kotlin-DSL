package com.example.dsl

import com.example.console.container.Panel
import com.example.console.shapes.Rhombus
import com.example.console.shapes.Square
import com.example.console.shapes.Triangle
import com.example.dsl.builders.RhombusBuilder
import com.example.dsl.builders.SquareBuilder
import com.example.dsl.builders.TriangleBuilder

fun panel(init: Panel.() -> Unit): Panel {
    return Panel().apply { init() }
}

fun Panel.square(init: SquareBuilder.() -> Unit): Square {
    return SquareBuilder().apply { init() }.build().also { addShape(it) }
}

fun Panel.triangle(init: TriangleBuilder.() -> Unit): Triangle {
    return TriangleBuilder().apply { init() }.build().also { addShape(it) }
}

fun Panel.rhombus(init: RhombusBuilder.() -> Unit): Rhombus {
    return RhombusBuilder().apply { init() }.build().also { addShape(it) }
}