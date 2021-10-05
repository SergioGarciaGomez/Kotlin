package tema01.e02

/*
    @author Sergio García

    Ejercicio 05 - Tema 01

    Programa que le da la vuelta a un número por ejemplo 1234 sería 4321
*/

fun main() {

    val numeroInicial = 1234
    var x = numeroInicial
    var numeroInvertido = 0

    while (x > 0) {
        numeroInvertido = (numeroInvertido * 10) + (x % 10)
        x /= 10
    }

    println("El número $numeroInicial dado la vuelta es $numeroInvertido")
}