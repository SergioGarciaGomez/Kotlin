package tema1

/*
@author Sergio García

Ejercicio 03 - Tema 01

Programa que dado un año guardado en una variable a, muestre true or false según sea bisiesto o no. Un año es bisiesto
si es divisible por 4 pero no entre 100, o si es divisible por 400. SIN CONDICIONALES.
*/

fun main() {

    print("Introduce un año: ")
    val a = readLine()?.toInt()
    if (a in 0..1000000000 step 4) {
        println("El año $a es bisiesto")
    } else {
        println("El año $a no es bisiesto")
    }
}