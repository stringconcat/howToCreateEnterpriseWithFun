package `fun`.enterprise.bestPractices

open class BestPractice {
    fun getSource(): Source =
        Book()

    val approvedByWideCommunity: Boolean = true
    val approvedByExperts: Boolean = true
    val outdated: Boolean = false
}

class FunWrapper(val bestPractice: BestPractice): BestPractice()

interface Source
class Book: Source
class Content


object SOLID: BestPractice()
object TDD: BestPractice()
object GoF: BestPractice()
object CI: BestPractice()
object CD: BestPractice()
object ChaosTesting: BestPractice() {
    fun maximize() {}
}