import kotlin.math.sqrt

fun main() {

    println("Введите координаты первой точки (x1, y1): ")
    val (x1, y1) = readLine()?.split(" ")?.map { it.toDouble() } ?: return

    println("Введите координаты второй точки (x2, y2): ")
    val (x2, y2) = readLine()?.split(" ")?.map { it.toDouble() } ?: return

    val distance = calculateDistance(x1, y1, x2, y2)

    println("Расстояние между точками: $distance")
}

fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
}
