package WordCount

fun phrase(words: String): Map<String, Int> {
    val sanitized = words
                    .replace("[^\\s\\w\\']*".toRegex(), "")
                    .replace("  ", " ")
                    .toLowerCase()
                    .split(" ")
    var expected = mutableMapOf<String, Int>()
    
    for (w in sanitized) {
        if (expected[w] == null ) {
            expected[w] = 1
        } else {
            expected[w] = expected?.getValue(w) + 1
        }
    }

    return expected
}