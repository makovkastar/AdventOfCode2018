package utils

private const val NEW_LINE_DELIMITER = '\n'

fun CharSequence.splitNewLines(): List<String> {
    return trim().split(NEW_LINE_DELIMITER)
}

fun List<String>.toIntList(): List<Int> {
    return map { it.trim().toInt() }
}

fun Any.getResourceAsString(name: String): String {
    return this.javaClass.getResource(name).readText()
}