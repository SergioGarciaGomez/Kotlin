package tema01

/*
    @author Sergio García

    Ejercicio 01 - Tema 01

    Bocadillo de jamón = 1.5, Refresco = 1.05, Cerveza = 0.75. Muestra por pantalla lo que debería pagar un cliente que
    ha comprado 5 bocadillos, 3 refrescos y 2 cervezas.
*/

fun main() {

    val bocadilloJamon = 1.5
    val refresco = 1.05
    val cerveza = 0.75
    val totalBocadillos = 5
    val totalRefrescos = 3
    val totalCervezas = 2
    val total = (bocadilloJamon * totalBocadillos) + (refresco * totalRefrescos) + (cerveza * totalCervezas)
    println("El total a pagar por 5 bocadillos de jamón, 3 refrescos y 2 cervezas es: $total €")
}
