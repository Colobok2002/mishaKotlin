import java.math.BigInteger

fun main() {
    val iterations = 10000

    var sum = BigInteger.ZERO
    for (n in 1..iterations) {
        val numerator = BigInteger.valueOf((n - 1).toLong())
        val denominator = BigInteger.valueOf(n.toLong()).pow(2)
        val term = numerator.toDouble() / denominator.toDouble()
        sum += term.toBigDecimal().toBigInteger()
    }

    val limit = sum / BigInteger.valueOf(iterations.toLong())
    println("Предел последовательности a_n при n -> ∞: $limit")
}
