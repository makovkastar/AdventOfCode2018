package utils

class CircularList<out T>(list: List<T>): List<T> by list {
    override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            private var index = 0

            override fun hasNext() = true

            override fun next(): T {
                if (index >= size) {
                    index %= size
                }
                return get(index++)
            }
        }
    }
}

fun <T> List<T>.circular() = CircularList(this)