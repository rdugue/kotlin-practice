package ETL
 
    fun transform(old: Map<Int, List<Char>>): Map<Char, Int> {
        val shiny = mutableMapOf<Char, Int>()

        for ((key, value) in old) {
            for (v in value) {
                shiny[v.toLowerCase()] = key
            }
        }

        return shiny
    }
