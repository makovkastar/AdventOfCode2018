import utils.circular
import utils.getResourceAsString
import utils.splitNewLines
import utils.toIntList

object Day01 {

    fun part1(input: String): Int {
        return input.splitNewLines()
                .toIntList()
                .sum()
    }

    fun part2(input: String): Int {
        val frequencyChanges = input.splitNewLines()
                .toIntList()
        val seenFrequencies = mutableSetOf<Int>()

        var currentFrequency = 0
        frequencyChanges.circular().forEach { frequencyChange ->
            currentFrequency += frequencyChange
            if (!seenFrequencies.add(currentFrequency)) {
                return currentFrequency
            }
        }

        throw IllegalArgumentException("Should not happen!")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(part1(getResourceAsString("day01.txt")))
        println(part2(getResourceAsString("day01.txt")))
    }
}
