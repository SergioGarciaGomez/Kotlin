package tema01.e03

/*
    @author Sergio García

    Ejercicio 04 - Tema 01

    Modifica el ejercicio 2 para que la función muestre las cadenas con dos saltos de línea si el valor
    booleano es true, o separadas por un tabulador si es false. Escribimos tabulador dentro de un print con \t.
*/

fun main() {

    val array = arrayOf("Gato", "Perro", "Lagarto", "Caballo", )
    println("Array true (2 espacios)")
    foo(array, true)
    println("Array false (1 tabulador)")
    foo(array)
}

private fun <T> foo(a: Array<T>, booleano:Boolean = false) {

    var cadena = ""

    if (booleano) {
        a.forEachIndexed { _, item -> cadena += "$item\n\n" }
    } else {
        a.forEachIndexed { _, item -> cadena += "$item\t" }
    }

    println(cadena)
}