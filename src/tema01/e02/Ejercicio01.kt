package tema01.e02

/*
    @author Sergio García

    Ejercicio 01 - Tema 01

    Escribe un programa que almacena una edad, y muestra por pantalla si el usuario está jubilado,
    en activo o menor de edad.
*/

fun main() {

    val edad = 20

    if (edad < 0) {
        println("Aprovecha que no hay niño")
    } else if (edad in 0..17) {
        println("Es menor de edad")
    } else if (edad in 18..64) {
        println("Está en activo")
    } else {
        println("Está jubilado")
    }
}