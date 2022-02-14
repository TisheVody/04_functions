class just {
}

fun main() {
    val test = agoToText(seconds)
    if (seconds > 60 * 60) println("был(а) в сети $test") else println("был(а) $test")
}

val seconds = 823
val minute = (seconds / 60)
val hour = (minute / 60)
val minuteWord = minuteFun(minute)
val hourWord = hourFun(hour)

fun agoToText(seconds: Int) = when (seconds) {
        in 0..60 -> "только что"
        in 61..60 * 60 -> "$minute $minuteWord назад"
        in 60 * 60 + 1..24 * 60 * 60 -> "$hour $hourWord назад"
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "сегодня"
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "вчера"
        in 3 * 24 * 60 * 60..Int.MAX_VALUE -> "давно"
        else -> "неверное время"
}

fun minuteFun(minute: Int): String {
    if (minute in 11..14) return "минут"
    return when (minute % 10) {
        1 -> "минуту"
        2, 3, 4 -> "минуты"
        in 5..9, 0 -> "минут"
        else -> "неверное время"
    }
}

fun hourFun(hour: Int): String {
    if (hour in 11..14) return "часов"
    return when (hour % 10) {
        1 -> "час"
        2, 3, 4 -> "часа"
        in 5..9, 0 -> "часов"
        else -> "неверное время"
    }
}
