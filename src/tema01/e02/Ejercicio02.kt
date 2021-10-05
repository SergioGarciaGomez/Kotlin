package tema01.e02

/*
    @author Sergio García

    Ejercicio 02 - Tema 01

    Programa que dada una nota numérica decimal almacenada en una variable, muestra si el alumno tiene suspenso,
    aprobado, bien, notable o sobresaliente. Si el valor es incorrecto se mostrará error.
*/

fun main() {

    val nota = 9.5

    if (nota < 0 || nota > 10) {
        println("La nota introducida es incorrecta.")
    } else if (nota >= 0 && nota < 5) {
        println("Su nota es $nota, tiene un insuficiente.")
    } else if (nota >= 5 && nota < 6) {
        println("Su nota es $nota, tiene un suficiente.")
    } else if (nota >= 6 && nota < 7) {
        println("Su nota es $nota, tiene un bien.")
    } else if (nota >= 7 && nota < 9) {
        println("Su nota es $nota, tiene un notable.")
    } else {
        println("Su nota es $nota, tiene un sobresaliente.")
    }
}