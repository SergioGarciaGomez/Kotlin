package tema1

/*
    @author Sergio García

    Ejercicio 07 - Tema 01

    Define un rango que almacene los números impares entre 10 y 50.
    Seguidamente dice si 22 y 39 están en dicho rango (De impares).
*/

fun main() {

    val rangoImpares = 11..50 step 2
    if (22 in rangoImpares step 2) { println("El 22 está en la cadena") }
    if (39 in rangoImpares step 2) { println("El 39 está en la cadena") }
}