fun main() {
    val array = intArrayOf(1, 4, 3, 0, 1)
    val sequenceType = checkSequenceType(array)
    println("Характер последовательности в массиве:")
    when (sequenceType) {
        SequenceType.STRICTLY_DECREASING -> println("Строго убывающая")
        SequenceType.NON_INCREASING -> println("Не возрастающая")
        SequenceType.STRICTLY_INCREASING -> println("Строго возрастающая")
        SequenceType.NON_DECREASING -> println("Неубывающая")
        else -> println("Различные значения в последовательности")
    }
}

enum class SequenceType {
    STRICTLY_DECREASING,
    NON_INCREASING,
    STRICTLY_INCREASING,
    NON_DECREASING,
    DIFFERENT
}

fun checkSequenceType(array: IntArray): SequenceType {
    var increasing = false
    var decreasing = false
    for (i in 0 until array.size - 1) {
        if (array[i] < array[i + 1]) {
            increasing = true
        } else if (array[i] > array[i + 1]) {
            decreasing = true
        }
    }
    return when {
        increasing && !decreasing -> SequenceType.STRICTLY_INCREASING
        !increasing && decreasing -> SequenceType.STRICTLY_DECREASING
        increasing -> SequenceType.NON_DECREASING
        else -> SequenceType.NON_INCREASING
    }
}
