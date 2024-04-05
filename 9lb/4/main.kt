fun main() {
    val inputString = "heqweqweqwe"

    val substring = inputString.filterIndexed { index, _ -> index % 2 != 0 }

    val mirroredSubstring = substring.reversed()
    var resultString = ""
    var j = 0
    for (i in inputString.indices) {
        if (i % 2 != 0) {
            resultString += mirroredSubstring[j]
            j++
        } else {
            resultString += inputString[i]
        }
    }

    println("Исходная строка: $inputString")
    println("Результирующая строка после зеркальной перестановки: $resultString")
}
