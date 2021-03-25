package `fun`.enterprise.software

object Api {
    val Rest = Rest()
    val GRPC = GRPC()

    fun asPlugin() = this
}

class Rest {
    fun enable() = Api
}

class GRPC {
    fun enable() = Api
}


fun str(a: String?): String =
    a?:""