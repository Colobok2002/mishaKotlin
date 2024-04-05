fun main() {
    println("Введите длины сторон треугольника через пробел:")
    val sides = readLine()?.split(" ")?.map { it.toDouble() } ?: return

    val triangleType = determineTriangleType(sides)
    println("Тип треугольника: $triangleType")
}

fun determineTriangleType(sides: List<Double>): String {
    require(sides.size == 3) { "Должно быть введено ровно три длины сторон треугольника" }

    val (a, b, c) = sides
    return when {
        a == b && b == c -> "Равносторонний треугольник"
        a == b || a == c || b == c -> "Равнобедренный треугольник"
        else -> "Разносторонний треугольник"
    }
}
