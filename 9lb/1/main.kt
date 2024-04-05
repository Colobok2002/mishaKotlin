class RecursiveCalculator {
    fun doubleFactorial(n: Int): Long {
        return if (n <= 1) {
            1
        } else {
            n.toLong() * doubleFactorial(n - 2)
        }
    }
}

fun main() {
    val calculator = RecursiveCalculator()
    val n = 7
    val result = calculator.doubleFactorial(n)
    println("Double factorial of $n is $result")
}
