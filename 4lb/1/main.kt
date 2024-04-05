enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main() {
    println("Введите номер дня недели (от 1 до 7): ")
    val dayNumber = readLine()?.toIntOrNull() ?: 0

    val dayOfWeek = when (dayNumber) {
        1 -> DayOfWeek.MONDAY
        2 -> DayOfWeek.TUESDAY
        3 -> DayOfWeek.WEDNESDAY
        4 -> DayOfWeek.THURSDAY
        5 -> DayOfWeek.FRIDAY
        6 -> DayOfWeek.SATURDAY
        7 -> DayOfWeek.SUNDAY
        else -> null
    }

    when (dayOfWeek) {
        null -> println("Некорректный номер дня недели")
        else -> println("Название дня недели: ${dayOfWeek.name.lowercase().replaceFirstChar { it.uppercase() }}")
    }
}
