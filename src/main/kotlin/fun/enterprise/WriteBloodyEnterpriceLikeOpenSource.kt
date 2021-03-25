package `fun`.enterprise

import `fun`.enterprise.bestPractices.*
import `fun`.enterprise.corporations.*
import `fun`.enterprise.project.Developer
import `fun`.enterprise.project.Project
import `fun`.enterprise.project.Status
import `fun`.enterprise.software.Api
import `fun`.enterprise.software.Monitor
import `fun`.enterprise.software.Requirements

fun writeBloodyEnterpriseLikeOpenSource(youFinishedTheCourse: Developer) {
    assert(youFinishedTheCourse.finishedSuccessfully)

    youFinishedTheCourse
        .also { dev -> assert(dev.knowladge.howToBuildEnterpriseLikeOpenSource) }
        .also { dev -> assert(dev.knowladge.howToCollectRequirements) }
        .also { dev -> assert(dev.knowladge.howNotToBurnOut) }

    val deployedProject = Project(developer = youFinishedTheCourse)
        .requirements(
            Requirements(trustToManagers = false, featureOrientedMind = false, userStories = true)
        )
        .core(howToBuild = DomainDrivenDesignStrategy())
        .architecture(
            philosophy = EvolutionaryArchitecture(FuturePredictionStrategy(), Flexability * 10),
            lowLevelArchitecture = UncleBob.theBest.hexagonalArchitecture,
            microservices = DomainGuidedArchitecture()
        )
        .codeQualityStandards(SOLID, GoF, TDD)
        .monitoring(Monitor.business + Monitor.techEssential)
        .infrastructure(RightInfrastructure().include(CI).include(CD))
        .api(Api
            .Rest.enable()
            .GRPC.enable()
            .asPlugin()
        )
        .securityBuiltIn(true)
        .testing(manual = false, tdd = true, additional = ChaosTesting.maximize())
        .deploy(CloudProviders.randomOf(AWS, GoogleCloud, Azure))

    assert(deployedProject.status == Status.SUCCESS)
}






















