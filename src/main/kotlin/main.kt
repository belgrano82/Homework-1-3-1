fun main() {
    val timeOfAbsence = agoToText(75610)
    println(timeOfAbsence)

}

fun agoToText(seconds: Int): String {
    val minutes = seconds / 60
    val hours = seconds / 60 / 60
    return when (seconds) {
        in 0..60 -> "был(а) только что"
        in 61..(60 * 60) -> endingForMinutes(minutes)
        in (60 * 60 + 1)..(24 * 60 * 60) -> endingForHours(hours)
        in (24 * 60 * 60 + 1)..(24 * 60 * 60 * 2) -> "был(а) вчера"
        in (24 * 60 * 60 * 2 + 1)..(24 * 60 * 60 * 3) -> "был(а) позавчера"
        else -> "был(а) давно"


    }

}

fun endingForMinutes(minutes: Int): String {
    return when (minutes) {
        1, 21, 31, 41, 51 -> "был(а) $minutes минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "был(а) $minutes минуты назад"
        else -> "был(а) $minutes минут назад"
    }

}

fun endingForHours(hours: Int): String {
    return when (hours) {
        1, 21 -> "был(а) $hours час назад"
        2, 3, 4, 22, 23 -> "был(а) $hours часа назад"
        else -> "был(а) $hours часов назад"
    }

}