package com.example

import com.example.console.shapes.*
import com.example.dsl.panel
import com.example.dsl.rhombus
import com.example.dsl.square
import com.example.dsl.triangle

fun main() {
    panel {
        val square = square {
            lines = 8
            char = 'd'
        }
        addShape(Space)

        val triangle = triangle {
            lines = 7
            char = 's'
        }
        addShape(Space)

        val rhombus = rhombus {
            lines = 11
            char = 'l'
        }
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