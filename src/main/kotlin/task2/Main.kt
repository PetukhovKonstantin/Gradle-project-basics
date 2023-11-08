package basics.task2

import org.intellij.lang.annotations.RegExp

fun main() {
    val likes = 61
    val regex = """[1]${'$'}""".toRegex()
    val peopleWord = if (regex.containsMatchIn(likes.toString())) "человеку" else "людям"

    println("Понравилось ${likes.toString()} $peopleWord")
}