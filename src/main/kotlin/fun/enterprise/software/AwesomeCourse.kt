package `fun`.enterprise.software

import `fun`.enterprise.bestPractices.BestPractice
import `fun`.enterprise.project.Developer

class AwesomeCourse(
    authors: Collection<Developer>,
    bestPractices: Collection<BestPractice>,
    experience: Unit,
    practice: Boolean
) {
    fun registerNow(listener: Developer): AwesomeCourse = this
    fun listenToLectures(): AwesomeCourse = this
    fun doPracticeByYourself(): AwesomeCourse = this
    fun sendToFeedback(recipients: List<Developer>): AwesomeCourse = this
    fun await(): AwesomeCourse = this
    fun askQuestionsTo(to: List<Developer>): AwesomeCourse = this
    fun participateWebinars(): AwesomeCourse = this
    fun finish(): Developer =
        Developer(10, emptyList())

}
