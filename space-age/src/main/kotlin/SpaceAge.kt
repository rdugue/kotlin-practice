class SpaceAge(val seconds: Long) {
    private val EARTH = seconds / 31557600.0
    private fun round(value: Double) = Math.round(value*100).toDouble() / 100

    fun onEarth() = round(EARTH)
    fun onMercury() = round(EARTH / 0.2408467)
    fun onMars() = round(EARTH / 1.8808158)
    fun onVenus() = round(EARTH / 0.61519726)
    fun onJupiter() = round(EARTH / 11.862615)
    fun onSaturn() = round(EARTH / 29.447498)
    fun onUranus() = round(EARTH / 84.016846)
    fun onNeptune() = round(EARTH / 164.79132)
 }