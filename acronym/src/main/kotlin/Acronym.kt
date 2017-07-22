package Acronym

fun generate(phrase: String): String? {
    val words = phrase.split(" ", "-")
    var result: String? = null
    for (word in words) {
        result = result?.plus(word[0].toUpperCase()) ?: "${word[0]}"
        println(result)
        val last = word.length - 1
        for (i in word.slice(2..last).indices) {
            if (i < 1) {
                if (word[i].isUpperCase()) result.plus(word[i])
            } else {
                if (word[i-1].isLowerCase() && word[i].isUpperCase()) result.plus(word[i])
            }
        }
    }
    
    return result
}