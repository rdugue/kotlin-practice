package Accumulate 

fun <T, R> accumulate(input: List<T>, op: (T) -> R): List<R> {
    var output = mutableListOf<R>()

    for (i in input) {
        output.add(op(i))
    }

    return output
}