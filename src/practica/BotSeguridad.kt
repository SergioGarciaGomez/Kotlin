package practica

fun main() {

    val me = Person("Sergio", 22, arrayListOf("Programar", "Jugar videojuegos", "Ver series"))
    botDeSeguridad(me)

}

fun botDeSeguridad(person: Person) {

    if (person.name == "Sergio") {
        println("Éxito. Bienvenido ${person.name}.")

        when(person.age) {
            in 0..17 -> println("Eres menor de edad. Acceso denegado.")
            in 18..64 -> {
                println("Eres mayor de edad, acceso concedido.")
                printHobbies(person)
            }
            in 65..100 -> println("Eres demasiado mayor. Acceso denegado.")
        }

    } else {
        println("Error. Nombre incorrecto")
    }
}

fun printHobbies(person: Person) {

    println("Tus hobbies son ${person.hobbies.size}")

    for (hobby in person.hobbies) {
        println(hobby)
    }
}

data class Person(val name: String, val age: Int, val hobbies: ArrayList<String>)