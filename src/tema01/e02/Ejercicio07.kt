package tema01.e02

/*
    @author Sergio García

    Ejercicio 07 - Tema 01

    Programa que tiene un array con diferentes valores. Muestra por pantalla la longitud de cada cadena del array
    que no sea nula.
*/

fun main() {

    val array = arrayOf("campamento", "cardinales", "polen", null, "hoja", "hermana", "relatividad", null)

    for (i:String? in array) {
        if (i != null) {
            println(i + ": " +i.length + " caracteres.")
        }
    }
}