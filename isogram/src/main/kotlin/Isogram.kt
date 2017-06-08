package Isogram

fun isIsogram(input: String): Boolean {
    val alphabet = listOf(
        'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', 'ä', 'é', 'ö', 'ü'
    )
    var count = 0

    for (c in alphabet) {
        for (x in input) {
            count = if (c.equals(x, true)) count + 1 else count
            if (count > 1) break else continue
        }
        if (count > 1) break else count = 0
    }

    return if (count > 1) false else true
}