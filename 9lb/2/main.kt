fun main() {
    val inputString = "hello world"
    val halfLength = inputString.length / 2

    val firstHalf = inputString.substring(0, halfLength)
    val secondHalf = inputString.substring(halfLength)

    val rotatedFirstHalf = firstHalf.substring(1) + firstHalf[0]
    val resultString = rotatedFirstHalf + secondHalf

    println("Исходная строка: $inputString")
    println("Результирующая строка после циклической перестановки: $resultString")
}
