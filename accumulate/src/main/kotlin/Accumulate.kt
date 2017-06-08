package Accumulate 

fun <T, R> accumulate(input: List<T>, op: (T) -> R): List<R> = input.map(op)