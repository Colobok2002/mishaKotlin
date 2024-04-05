fun main() {
    val n = 25

    val resultForLoop = calculateSumForLoop(n)
    println("Значение суммы S с использованием цикла for: $resultForLoop")

    val resultWhileLoop = calculateSumWhileLoop(n)
    println("Значение суммы S с использованием цикла while: $resultWhileLoop")

    val resultDoWhileLoop = calculateSumDoWhileLoop(n)
    println("Значение суммы S с использованием цикла do-while: $resultDoWhileLoop")
}

fun calculateSumForLoop(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += (i + 1) * (i + 1)
    }
    return sum
}

fun calculateSumWhileLoop(n: Int): Int {
    var sum = 0
    var i = 1
    while (i <= n) {
        sum += (i + 1) * (i + 1)
        i++
    }
    return sum
}

fun calculateSumDoWhileLoop(n: Int): Int {
    var sum = 0
    var i = 1
    do {
        sum += (i + 1) * (i + 1)
        i++
    } while (i <= n)
    return sum
}
