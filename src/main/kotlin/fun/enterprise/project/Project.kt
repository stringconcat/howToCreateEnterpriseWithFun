package `fun`.enterprise.project

import `fun`.enterprise.software.Api
import `fun`.enterprise.corporations.HexagonalArchitecture
import `fun`.enterprise.software.Requirements
import `fun`.enterprise.bestPractices.*
import `fun`.enterprise.corporations.CloudProviders

open class Project(developer: Developer = Developer(
    10,
    emptyList()
)
) {
    fun where(predicate: (Project) -> Boolean) {

    }

    fun requirements(requirements: Requirements): Project = this
    fun core(howToBuild: DomainDrivenDesignStrategy): Project = this
    fun architecture(
        philosophy: EvolutionaryArchitecture,
        lowLevelArchitecture: HexagonalArchitecture,
        microservices: DomainGuidedArchitecture
    ): Project = this

    fun codeQualityStandards(solid: SOLID, goF: GoF, tdd: TDD): Project = this
    fun monitoring(i: Int): Project = this
    fun infrastructure(include: RightInfrastructure): Project = this
    fun api(asPlugin: Api): Project = this
    fun securityBuiltIn(b: Boolean): Project = this
    fun testing(manual: Boolean, tdd: Boolean, additional: Unit): Project = this
    fun deploy(randomOf: CloudProviders.Companion): Project = this


    var status: Status =
        Status.SUCCESS
}
class BloodyEnterpriseProject: Project()

enum class Status {
    SUCCESS, Fail
}