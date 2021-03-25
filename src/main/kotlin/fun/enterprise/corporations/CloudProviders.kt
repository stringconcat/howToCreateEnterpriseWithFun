package `fun`.enterprise.corporations

open class CloudProviders {

    companion object {
        fun randomOf(cloudProviders1: CloudProviders, cloudProviders2: CloudProviders, cloudProviders3: CloudProviders) = this
    }

}

object AWS: CloudProviders()
object GoogleCloud: CloudProviders()
object Azure: CloudProviders()
