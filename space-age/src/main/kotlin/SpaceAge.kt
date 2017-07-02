class SpaceAge(val seconds: Long) {
    private fun round(value: Double) = Math.round(value*100).toDouble() / 100

    fun onEarth() = round(seconds / 31557600.0)
    fun onMercury() = round(onEarth() / 0.2408467)
    fun onMars() = round(onEarth() / 1.8808158)
    fun onVenus() = round(onEarth() / 0.61519726)
    fun onJupiter() = round(onEarth() / 11.862615)
    fun onSaturn() = round(onEarth() / 29.447498)
    fun onUranus() = round(onEarth() / 84.016846)
    fun onNeptune() = round(onEarth() / 164.79132)
 }