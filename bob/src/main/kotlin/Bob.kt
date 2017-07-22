package Bob

fun hey(phrase: String): String {
    val answers = listOf("Sure.", "Whoa, chill out!", "Fine. Be that way!", "Whatever.")

    fun isQuestion() = phrase.last().equals('?') ?: false
    fun isAllNumbers(): Boolean {
        var result = true
        var strip = phrase
                    .replace(" ", "")
                    .replace(",", "")
                    .replace("?", "")
                    .replace(".", "")
                    .replace("!", "")
                    .replace("'", "")
        for (c in strip) if (!c.isDigit()) result = false
        return result
    }
    fun isAllCaps(): Boolean {
        var result = true
        for (c in phrase.replace(" ", "")) {
            if (!c.equals(c.toUpperCase())) result = false 
        }
        if (isAllNumbers()) result = false
        return result
    }

    return when {
        phrase.isBlank() -> answers[2]
        isAllCaps() -> answers[1]
        isQuestion() -> answers[0]
        else -> answers[3]
    }
}