package cz.wrent.advent


fun main() {
    println(Day2.partOne(input))
    println(Day2.partTwo(input))
}

object Day2 {
    fun partOne(input: String): Long =
        part(input) { isValid() }


    fun partTwo(input: String): Long =
        part(input) { isReallyValid() }


    private fun part(input: String, fn: Long.() -> Boolean): Long {
        val ranges = input.split(",").map { it.split("-") }.map { it.first().toLong()..it.last().toLong() }

        return ranges.flatMap { range ->
            range.mapNotNull { it.takeIf { !it.fn() } }
        }.sum()
    }


    fun Long.isValid(): Boolean {
        val asString = this.toString()
        return !(asString.length % 2 == 0 && asString.take(asString.length / 2) == asString.takeLast(asString.length / 2))
    }

    fun Long.isReallyValid(): Boolean {
        val asString = this.toString()
        val half = asString.length / 2

        for (i in 1..half) {
            val chunks = asString.chunked(i).toSet()
            if (chunks.size == 1) return false
        }
        return true
    }
}

private const val input =
    """2200670-2267527,265-409,38866-50720,7697424-7724736,33303664-33374980,687053-834889,953123-983345,3691832-3890175,26544-37124,7219840722-7219900143,7575626241-7575840141,1-18,1995-2479,101904-163230,97916763-98009247,52011-79060,31-49,4578-6831,3310890-3365637,414256-608125,552-1005,16995-24728,6985-10895,878311-912296,59-93,9978301-10012088,17302200-17437063,1786628373-1786840083,6955834840-6955903320,983351-1034902,842824238-842861540,14027173-14217812"""
