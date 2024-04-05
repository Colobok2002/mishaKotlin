import kotlin.math.sin

class MathOperations {
    companion object {
        fun calculateExpressionStatic(x: Double): Double {
            var sum = 0.0
            for (i in 1..10) {
                sum += 4 * sin(x * x * x + 2 * x * x + x + 2) / (x * x + 2)
            }
            return sum
        }
    }

    fun calculateExpressionInstance(x: Double): Double {
        var sum = 0.0
        var i = 1
        while (i <= 10) {
            sum += 4 * sin(x * x * x + 2 * x * x + x + 2) / (x * x + 2)
            i++
        }
        return sum
    }
}

fun main() {
    val x = 23.0 

    val resultStaticForLoop = MathOperations.calculateExpressionStatic(x)
    println("Значение выражения с использованием статического метода и цикла for: $resultStaticForLoop")

    val mathOperations = MathOperations()
    val resultInstanceWhileLoop = mathOperations.calculateExpressionInstance(x)
    println("Значение выражения с использованием экземплярного метода и цикла while: $resultInstanceWhileLoop")

    var sum = 0.0
    var i = 1
    do {
        sum += 4 * sin(x * x * x + 2 * x * x + x + 2) / (x * x + 2)
        i++
    } while (i <= 10)
    println("Значение выражения с использованием цикла do-while: $sum")
}
