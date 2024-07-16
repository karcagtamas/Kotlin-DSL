package com.example.console.shapes

class Square(lines: Int, char: Char): Shape() {
    override val grid: Array<CharArray> = Array(lines) {
        CharArray(lines) { char }
    }
}