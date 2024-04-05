import kotlin.random.Random

fun main() {
    println("Выберите метод ввода массива (1 - вручную, 2 - с помощью генератора):")
    val inputMethod = readLine()?.toIntOrNull() ?: 1
    val array = if (inputMethod == 1) enterArrayManually() else generateArray()

    println("Исходный массив:")
                printArray(array)

    var action: Int
    do {
        println("Выберите действие (1-3):")
        action = requestAction()
        when (action) {
            1 -> replaceNegativeWithSquares(array)
            2 -> {
                swapMaxWithFirst(array)
                println("Сумма элементов, кратных 5: ${sumOfElementsDivisibleByFive(array)}")
            }
            3 -> increasePositiveElementsBySeven(array)
            else -> println("Непонятный символ. Пожалуйста, выберите действие из предложенных (1-3).")
        }
    } while (action !in 1..3)

    println("Измененный массив:")
    printArray(array)
}
fun requestAction(): Int = readLine()?.toIntOrNull() ?: 0

fun enterArrayManually(): Array<Array<Int>> {
    println("Введите размеры массива (строки, столбцы):")
    val rows = readLine()?.toIntOrNull() ?: 1
    val cols = readLine()?.toIntOrNull() ?: 1
    return Array(rows) { Array(cols) { 0 } }.apply {
        for (i in indices) {
            for (j in this[i].indices) {
                println("Введите элемент [$i][$j]:")
                this[i][j] = readLine()?.toIntOrNull() ?: 0
            }
        }
    }
}

fun generateArray(): Array<Array<Int>> {
    val rows = Random.nextInt(1, 10)
    val cols = Random.nextInt(1, 10)
    return Array(rows) { Array(cols) { Random.nextInt(-100, 100) } }
}

fun printArray(array: Array<Array<Int>>) {
    for (row in array) {
        println(row.joinToString(" "))
    }
}

fun replaceNegativeWithSquares(array: Array<Array<Int>>) {
    array.forEach { row ->
        for (i in row.indices) {
            if (row[i] < 0) row[i] = row[i] * row[i]
        }
    }
}

fun swapMaxWithFirst(array: Array<Array<Int>>) {
    val maxPosition = findMaxElementPosition(array)
    val temp = array[0][0]
    array[0][0] = array[maxPosition.first][maxPosition.second]
    array[maxPosition.first][maxPosition.second] = temp
}

fun findMaxElementPosition(array: Array<Array<Int>>): Pair<Int, Int> {
    var maxPos = 0 to 0
    var maxVal = Int.MIN_VALUE
    array.forEachIndexed { i, row ->
        row.forEachIndexed { j, value ->
            if (value > maxVal) {
                maxVal = value
                maxPos = i to j
            }
        }
    }
    return maxPos
}

fun sumOfElementsDivisibleByFive(array: Array<Array<Int>>): Int =
        array.sumOf { row -> row.filter { it % 5 == 0 }.sum() }

fun increasePositiveElementsBySeven(array: Array<Array<Int>>) {
    array.forEach { row ->
        for (i in row.indices) {
            if (row[i] > 0) row[i] += 7
        }
    }
}
