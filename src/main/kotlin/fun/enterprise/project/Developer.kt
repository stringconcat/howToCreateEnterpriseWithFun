package `fun`.enterprise.project

import `fun`.enterprise.software.Language

open class Developer(
    val experienceYears: Int = 0,
    val languages: Collection<Language>
) {
    val knowladge: Knowledge =
        Knowledge()
    val finishedSuccessfully: Boolean = true
    val getSickOfTypicalEnterprise: Boolean = true
    val wantToEvolve: Boolean = true
    fun assignTo(project: Project): Assignment =
        Assignment(project = project, dev = this)
}

class SickOfBloodyEnterprise(developer: Developer): Developer(developer.experienceYears, developer.languages)
class Hungry(developer: Developer): Developer(developer.experienceYears, developer.languages)