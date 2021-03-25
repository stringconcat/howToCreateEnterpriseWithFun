package `fun`.enterprise

import `fun`.enterprise.bestPractices.Book
import `fun`.enterprise.bestPractices.Content
import `fun`.enterprise.bestPractices.FunWrapper
import `fun`.enterprise.corporations.FIX
import `fun`.enterprise.corporations.Google
import `fun`.enterprise.corporations.ThoughtWorks
import `fun`.enterprise.corporations.Yandex
import `fun`.enterprise.project.Developer
import `fun`.enterprise.software.AwesomeCourse

fun findAwesomeCourseFor(you: Developer): Developer {

    val we = listOf(ThoughtWorks.Sergey, FIX.Eugene)
    val ourEnterpriseDevCourse = AwesomeCourse(
        authors = we,
        bestPractices = (ThoughtWorks.bestPractices() + Google.bestPractices() + Yandex.bestPractices())
            .filter { practice -> !practice.outdated }
            .filter { practice -> practice.approvedByExperts || practice.approvedByWideCommunity }
            .map { practice ->
                practice
                    .let { bestPractice -> findBooksAbout(bestPractice) }
                    .let { book -> we.read(book) }
                    .let { bookContent -> distillKnowledge(bookContent) }
                    .let { bestPractice -> FunWrapper(bestPractice) }
            },
        experience = we
            .sumBy { it.experienceYears }
            .let { experienceYears -> assert(experienceYears >= 20) },
        practice = true
    )

    val youFinishedTheCourse = ourEnterpriseDevCourse
        .registerNow(you)
        .listenToLectures()
        .doPracticeByYourself().sendToFeedback(we).await()
        .askQuestionsTo(we)
        .participateWebinars()
        .finish()

    return youFinishedTheCourse
}









































private fun List<Developer>.read(book: Book): Content =
    Content()