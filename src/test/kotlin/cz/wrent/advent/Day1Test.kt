package cz.wrent.advent

import cz.wrent.advent.Day1.move
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Day1Test {

    @Test
    fun partOne() {
        val input = """L68
L30
R48
L5
R60
L55
L1
L99
R14
L82"""
        assertEquals(3, Day1.partOne(input))
    }

    @Test
    fun partTwo() {
        val input = """L68
L30
R48
L5
R60
L55
L1
L99
R14
L82"""
        assertEquals(6, Day1.partTwo(input))
    }

    @Test
    fun testMove() {
        assertEquals(60 to 0, 50.move(Day1.Direction.RIGHT, 10))
        assertEquals(40 to 0, 50.move(Day1.Direction.LEFT, 10))
        assertEquals(50 to 1, 50.move(Day1.Direction.RIGHT, 100))
        assertEquals(50 to 1, 50.move(Day1.Direction.LEFT, 100))
        assertEquals(0 to 1, 50.move(Day1.Direction.RIGHT, 50))
        assertEquals(0 to 1, 50.move(Day1.Direction.LEFT, 50))
        assertEquals(0 to 2, 50.move(Day1.Direction.LEFT, 150))
        assertEquals(99 to 0, 0.move(Day1.Direction.LEFT, 1))
        assertEquals(1 to 0, 0.move(Day1.Direction.RIGHT, 1))
    }
}
