import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime.MIDNIGHT

class Gigasecond(var birthdate: LocalDateTime) {
    constructor(birthdate: LocalDate) : this(LocalDateTime.of(birthdate, MIDNIGHT)) {}

    val date: LocalDateTime
        get() = birthdate.plusSeconds(1000000000)
}