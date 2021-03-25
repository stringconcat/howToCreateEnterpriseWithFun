package `fun`.enterprise.project

class Assignment(
    val project: Project,
    val dev: Developer
) {
    val role: ProjectRole =
        TeamLead

    fun where(predicate: (Assignment) -> Boolean) {

    }

}