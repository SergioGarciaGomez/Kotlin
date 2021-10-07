package practica

fun main() {

    val programador = Programmer()
    println(programador.getProgrammerData())

}

class Programmer : ProgrammerInterface {

    override fun getProgrammerData(): ProgrammerData = ProgrammerData(getName(), getAge(), getLanguage())

    private fun getName(): String {
        return "Sergio"
    }

    private fun getAge(): Int {
        return 20
    }

    private fun getLanguage(): String {
        return "Kotlin"
    }
}

private interface ProgrammerInterface {
    fun getProgrammerData(): ProgrammerData {
        return getProgrammerData()
    }
}

data class ProgrammerData(val name: String, val age: Int, val language: String)


