package Scrabble 

private fun scoreLetter(letter: Char) = when(letter.toUpperCase()) {
    'D', 'G' -> 2
    'B', 'C', 'M', 'P' -> 3
    'F', 'H', 'V', 'W', 'Y' -> 4
    'K' -> 5
    'J', 'X' -> 8
    'Q', 'Z' -> 10
    else -> 1
}

fun scoreWord(word: String): Int {
    var score = 0
    for (letter in word.trim()) {
        score += scoreLetter(letter)
    }

    return score
}