fun main() {
    val n = 10
    val result = calculateSum(n)
    println("Значение суммы S = 1^2 + 2^2 + ... + $n^2: $result")
}

fun calculateSum(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    return sum
}
