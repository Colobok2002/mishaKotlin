fun main() {
    println("Введите натуральное число n:")
    val n = readLine()?.toIntOrNull() ?: return

    val result = calculateExpression(n)
    println("Значение выражения: $result")
}

fun calculateExpression(n: Int): Double {
    var product = 1.0
    for (i in 1..n) {
        product *= (1 + 1.0 / (i * i))
    }
    return product
}
