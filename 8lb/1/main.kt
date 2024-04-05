fun calculateSum(n: Int, i: Int = 1): Double {
    return if (i > n) {
        0.0 
    } else {
        val currentTerm = Math.pow(i + 1.0, 2 * n.toDouble())
        currentTerm + calculateSum(n, i + 1)
    }
}

fun main() {
    val n = 10
    val result = calculateSum(n)
    println("Значение суммы S($n) = $result")
}
