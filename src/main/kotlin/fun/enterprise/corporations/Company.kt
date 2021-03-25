package `fun`.enterprise.corporations

import `fun`.enterprise.bestPractices.BestPractice
import `fun`.enterprise.project.Developer
import `fun`.enterprise.software.Java
import `fun`.enterprise.software.Kotlin

open class Company {
    fun bestPractices(): List<BestPractice> = emptyList()
}

object ThoughtWorks: Company() {
    val Sergey = Developer(
        experienceYears = 10,
        languages = listOf(
            Java,
            Kotlin
        )
    )
}

object FIX: Company() {
    val Eugene = Developer(
        experienceYears = 10,
        languages = listOf(
            Java,
            Kotlin
        )
    )
}

object Google: Company()
object Yandex: Company()

