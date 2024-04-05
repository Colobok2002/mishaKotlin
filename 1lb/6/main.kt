import kotlin.math.sqrt

fun main() {
    println("Введите значение a:")
    val a = readLine()?.toDoubleOrNull() ?: return
    println("Введите значение b:")
    val b = readLine()?.toDoubleOrNull() ?: return
    println("Введите значение h:")
    val h = readLine()?.toDoubleOrNull() ?: return

    println("+------+------------------+")
    println("|  x   |      f(x)        |")
    println("+------+------------------+")

    var x = a
    while (x <= b) {
        val fx = calculateFunction(x)
        println(String.format("| %.2f |      %.4f      |", x, fx))
        x += h
    }

    println("+------+------------------+")
}

fun calculateFunction(x: Double): Double {
    return 1 / sqrt(x)
}
