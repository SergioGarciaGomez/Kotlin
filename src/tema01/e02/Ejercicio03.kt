package tema01.e02

/*
    @author Sergio García

    Ejercicio 03 - Tema 01

    Escribe un programa que almacena una edad, y muestra por pantalla si el usuario está jubilado,
    en activo o menor de edad. HACER CON WHEN
*/

fun main() {

    val edad = 20

    when (edad) {
        in 0..17 -> println("Menor de edad")
        in 18..64 -> println("En activo")
        in 65..130 -> println("Jubilado")
        else -> println("Edad incorrecta")
    }
}