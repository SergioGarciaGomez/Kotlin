package tema01.e03

import objetos.item

/*
    @author Sergio García

    Ejercicio 02 - Tema 01

    Escribe una función que, dados un vector de cadenas de caracteres y un valor de tipo booleano,
    muestre las cadenas en diferentes líneas separadas por comas según dicho valor booleano sea
    true o false respectivamente, siendo este último el valor por defecto. Deberá utilizarse el
    método forEachIndexed para recorrer el array.
*/

fun main() {

    val array = arrayOf("Gato", "Perro", "Lagarto", "Caballo", )
    println("Array true (espacios)")
    foo(array, true)
    println("Array false (comas)")
    foo(array)
}

private fun <T> foo(a: Array<T>, booleano:Boolean = false) {

    var cadena = ""

    if (booleano) {
        a.forEachIndexed { _, item -> cadena += "$item\n" }
    } else {
        a.forEachIndexed { _, item -> cadena += "$item, " }
    }

    println(cadena)
}