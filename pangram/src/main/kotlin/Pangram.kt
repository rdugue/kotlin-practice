package Pangrams

fun isPangram(sentence: String): Boolean {
    val alphabet = listOf(
        'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x',
        'y', 'z'
    )
    var is_pangram = true

    for (letter in alphabet) {
        if (sentence.trim().toLowerCase().indexOf(letter) == -1) {
            is_pangram = false
            break
        }
    }
    
    return is_pangram
}