package com.example.dsl

import com.example.console.container.Panel
import com.example.console.shapes.*
import com.example.dsl.builders.RhombusBuilder
import com.example.dsl.builders.SquareBuilder
import com.example.dsl.builders.TriangleBuilder

inline fun panel(init: Panel.() -> Unit): Panel {
    return Panel().apply { init() }
}

inline fun Panel.square(init: SquareBuilder.() -> Unit): Square {
    return SquareBuilder().apply { init() }.build().also { addShape(it) }
}

inline fun Panel.triangle(init: TriangleBuilder.() -> Unit): Triangle {
    return TriangleBuilder().apply { init() }.build().also { addShape(it) }
}

inline fun Panel.rhombus(init: RhombusBuilder.() -> Unit): Rhombus {
    return RhombusBuilder().apply { init() }.build().also { addShape(it) }
}

fun Panel.space(): Unit {
    addShape(Space)
}

inline fun Panel.composed(init: () -> ComposedShape): ComposedShape {
    return init().also { addShape(it) }
}

infix fun Shape.union(other: Shape): ComposedShape {
    return ComposedShape(this, other, ComposedShape.Operation.UNION)
}

infix fun Shape.intersection(other: Shape): ComposedShape {
    return ComposedShape(this, other, ComposedShape.Operation.INTERSECTION)
}

operator fun Shape.plus(other: Shape): ComposedShape {
    return this union other
}

operator fun Shape.minus(other: Shape): ComposedShape {
    return this intersection other
}