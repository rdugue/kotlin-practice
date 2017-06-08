fun transcribeToRna(dna: String): String {
    var rna = ""
    
    for (c in dna) {
        when (c) {
            'G' -> rna += "C"
            'C' -> rna += "G"
            'T' -> rna += "A"
            'A' -> rna += "U"
        }
    }

    return rna
}
