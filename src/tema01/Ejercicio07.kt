package tema01

/*
    @author Sergio García

    Ejercicio 07 - Tema 01

    Define un rango que almacene los números impares entre 10 y 50.
    Seguidamente dice si 22 y 39 están en dicho rango (De impares).
*/

fun main() {

    val rangoImpares = 11..50 step 2
    if (22 !in rangoImpares) { println("El 22 no está en la cadena") }
    if (39 in rangoImpares) { println("El 39 está en la cadena") }
}