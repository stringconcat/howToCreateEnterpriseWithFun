package `fun`.enterprise

import `fun`.enterprise.bestPractices.BestPractice
import `fun`.enterprise.bestPractices.Book
import `fun`.enterprise.bestPractices.Content
import `fun`.enterprise.project.*
import `fun`.enterprise.software.Java
import `fun`.enterprise.software.Kotlin

fun howToWriteEnterpriseApplicationAndDoNotDie() {

    val you = Hungry(
        SickOfBloodyEnterprise(
            Developer(languages = listOf(Java, Kotlin))
        )
    )

    you
        .assignTo(BloodyEnterpriseProject())
        .where { assignment -> assignment.role in listOf(
            TeamLead,
            SeniorDeveloper,
            StrongMiddleDeveloper
        ) }

    if (you.getSickOfTypicalEnterprise && you.wantToEvolve) {
        val youFinishedTheCourse = findAwesomeCourseFor(you)
        writeBloodyEnterpriseLikeOpenSource(youFinishedTheCourse)
    }
}



































fun main() {
    howToWriteEnterpriseApplicationAndDoNotDie()
}







fun distillKnowledge(bookContent: Content): BestPractice =
    BestPractice()



fun findBooksAbout(bestPractice: BestPractice): Book =
    Book()
