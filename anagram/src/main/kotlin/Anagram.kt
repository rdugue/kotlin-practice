class Anagram(var word: String) {
    fun match(list: List<String>): List<String> = list.filter { check(it) }

    private fun check(list_word: String): Boolean {
        var isAnagram = true
        for (c in word) {
            if (countLetter(word, c) !== countLetter(list_word, c)) {
                isAnagram = false
                break
            }
        }

        return when {
            word.length !== list_word.length -> false
            word.equals(list_word, true) -> false
            else -> isAnagram
        }
    } 

    private fun countLetter(word: String, letter: Char): Int {
        var count = 0
        for (c in word) {
            count = if (c.equals(letter, true)) count + 1 else count
        }

        return count
    }
}