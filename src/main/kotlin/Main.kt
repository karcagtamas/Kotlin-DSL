package com.example

import com.example.console.shapes.*
import com.example.dsl.panel

fun main() {
    panel {
        val square = Square(8, 'd')
        val triangle = Triangle(7, 's')
        val rhombus = Rhombus(11, 'l')

        it.addShape(square)
        it.addShape(Space)
        it.addShape(triangle)
        it.addShape(Space)
        it.addShape(rhombus)
        it.addShape(Space)
        it.addShape(
            ComposedShape(square, rhombus, ComposedShape.Operation.UNION)
        )
        it.addShape(Space)
        it.addShape(
            ComposedShape(rhombus, triangle, ComposedShape.Operation.UNION)
        )
        it.addShape(Space)
        it.addShape(
            ComposedShape(square, rhombus, ComposedShape.Operation.INTERSECTION)
        )
        it.addShape(Space)
        it.addShape(
            ComposedShape(rhombus, triangle, ComposedShape.Operation.INTERSECTION)
        )
        it.addShape(Space)
        it.addShape(
            ComposedShape(
                ComposedShape(square, rhombus, ComposedShape.Operation.UNION),
                triangle,
                ComposedShape.Operation.UNION
            )
        )
        it.addShape(Space)
        it.addShape(
            ComposedShape(
                ComposedShape(square, rhombus, ComposedShape.Operation.INTERSECTION),
                triangle,
                ComposedShape.Operation.INTERSECTION
            )
        )
    }.print()
}