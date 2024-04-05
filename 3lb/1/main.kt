fun main() {
    println("Введите целое число a:")
    val a = readLine()?.toIntOrNull() ?: return 
    println("Число x равно: ${if (a % 2 == 0) a * 3 else a / 2}")
}
