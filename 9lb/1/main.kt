class StringProcessor(private val input: String) {
    fun countUpperCaseConsonants(): Int {
        val upperCaseConsonants = input.filter { it.isUpperCase() && it in '\u0041'..'\u005A' && it !in "AEIOU" }
        return upperCaseConsonants.length
    }
    
    fun extractUpperCaseConsonants(): String {
        return input.filter { it.isUpperCase() && it in '\u0041'..'\u005A' && it !in "AEIOU" }
    }
}

fun main() {
    val inputString = "qwewqewq WQQE qweW qweqwe"
    val processor = StringProcessor(inputString)

    val count = processor.countUpperCaseConsonants()
    val upperCaseConsonants = processor.extractUpperCaseConsonants()

    println("Количество заглавных согласных: $count")
    println("Вспомогательная строка из заглавных согласных букв: $upperCaseConsonants")
}
