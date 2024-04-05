fun main() {
    val inputString = "hela" 
    val halfLength = inputString.length / 2 

    val firstHalf = inputString.substring(0, halfLength)
    val secondHalf = inputString.substring(halfLength)

    val rotatedFirstHalf = rotateString(firstHalf)
    val resultString = rotatedFirstHalf + secondHalf

    println("Исходная строка: $inputString")
    println("Результирующая строка после циклической перестановки: $resultString")
}

fun rotateString(str: String): String {
    return str.substring(1) + str[0]
}
