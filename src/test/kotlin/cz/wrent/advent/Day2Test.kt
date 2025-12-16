package cz.wrent.advent

import cz.wrent.advent.Day2.isReallyValid
import cz.wrent.advent.Day2.isValid
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Day2Test {

    @Test
    fun partOne() {
        val input =
            """11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124"""
        assertEquals(1227775554L, Day2.partOne(input))
    }

    @Test
    fun partTwo() {
        val input =
            """11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124"""
        assertEquals(4174379265, Day2.partTwo(input))
    }

    @Test
    fun isValid() {
        assertTrue(10L.isValid())
        assertFalse(11L.isValid())
        assertFalse(123123L.isValid())
        assertTrue(101L.isValid())
        listOf(11L, 22L, 99L, 1010L, 1188511885L, 222222L, 446446L, 38593859L).forEach {
            assertFalse(it.isValid())
        }
    }

    @Test
    fun isReallyValid() {
        assertTrue(10L.isReallyValid())
        assertTrue(101L.isReallyValid())
        listOf(11L, 22L, 99L, 111L, 999L, 1010L, 1188511885L, 222222L, 446446L, 38593859L, 565656L, 824824824L, 2121212121L).forEach {
            assertFalse(it.isReallyValid())
        }
    }
}
