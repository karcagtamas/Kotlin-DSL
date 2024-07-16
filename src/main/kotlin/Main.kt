package com.example

import com.example.dsl.*

fun main() {
    panel {
        val square = square {
            lines = 8
            char = 'd'
        }
        space()

        val triangle = triangle {
            lines = 7
            char = 's'
        }
        space()

        val rhombus = rhombus {
            lines = 11
            char = 'l'
        }
        space()

        composed { square union rhombus }

        space()

        composed { rhombus union triangle }

        space()

        composed { square intersection rhombus }

        space()

        composed { rhombus intersection triangle }

        space()

        composed { square union rhombus union triangle }

        space()

        composed { square intersection rhombus intersection triangle }
    }.print()
}