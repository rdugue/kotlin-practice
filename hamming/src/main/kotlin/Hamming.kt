package Hamming

fun compute(s1: String, s2: String): Int {
    if (s1.length != s2.length) throw IllegalArgumentException("Strands aren't same length")
    var count = 0

    for (i in s1.indices) if (s1[i] != s2[i]) count += 1

    return count
}