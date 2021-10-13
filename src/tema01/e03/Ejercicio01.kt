package tema01.e03

import objetos.algo

/*
    @author Sergio García

    Ejercicio 01 - Tema 01

    Diseña una función que reciba una variable de cualquier tipo y devuelva una cadena de texto indicando
    el tipo de dicha variable. Si por ejemplo pasamos una variable tipo entero, el mensaje que debe
    mostrar será este: "La variable es de tipo INTEGER".
*/

fun main() {
    foo(false)
}

private fun foo(dato: Any) {
    println("El nombre oficial del tipo de variable es ${dato.javaClass.canonicalName.uppercase()}")
    println("La variable es de tipo ${dato.javaClass.simpleName.uppercase()}")
}




