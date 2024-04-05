fun main() {
    val n = 2
    val result = calculateExpression(n)
    println("Результат вычисления (-1)^$n * $n!: $result")
}

fun calculateExpression(n: Int): Long {
    val factorial = factorial(n)
    val sign = if (n % 2 == 0) 1 else -1
    return sign * factorial
}

fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        var result: Long = 1
        for (i in 2..n) {
            result *= i.toLong()
        }
        result
    }
}
