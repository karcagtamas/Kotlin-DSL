package com.example

import com.example.console.shapes.*
import com.example.dsl.panel

fun main() {
    panel {
        val square = Square(8, 'd')
        val triangle = Triangle(7, 's')
        val rhombus = Rhombus(11, 'l')

        addShape(square)
        addShape(Space)
        addShape(triangle)
        addShape(Space)
        addShape(rhombus)
        addShape(Space)
        addShape(
            ComposedShape(square, rhombus, ComposedShape.Operation.UNION)
        )
        addShape(Space)
        addShape(
            ComposedShape(rhombus, triangle, ComposedShape.Operation.UNION)
        )
        addShape(Space)
        addShape(
            ComposedShape(square, rhombus, ComposedShape.Operation.INTERSECTION)
        )
        addShape(Space)
        addShape(
            ComposedShape(rhombus, triangle, ComposedShape.Operation.INTERSECTION)
        )
        addShape(Space)
        addShape(
            ComposedShape(
                ComposedShape(square, rhombus, ComposedShape.Operation.UNION),
                triangle,
                ComposedShape.Operation.UNION
            )
        )
        addShape(Space)
        addShape(
            ComposedShape(
                ComposedShape(square, rhombus, ComposedShape.Operation.INTERSECTION),
                triangle,
                ComposedShape.Operation.INTERSECTION
            )
        )
    }.print()
}