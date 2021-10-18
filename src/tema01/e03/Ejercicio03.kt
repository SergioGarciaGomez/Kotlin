package tema01.e03

/*
    @author Sergio García

    Ejercicio 03 - Tema 01

    Escribe una función que, dados dos arrays de números enteros determine si ambos son circularmente
    iguales y muestre un mensaje en pantalla indicándolo.
    Supongamos V = { 3, 4, 1, 5 } y S = { 5, 3, 4, 1 }. Se dice que ambos son circularmente iguales
    porque cada valor numérico ocupa la misma posición con respecto a su predecesor en cada vector,
    teniendo en cuenta que son circulares. Esto es, el 1 sigue al 4, este al 3, y el 3 va seguido del 5.
    Si S = { 5, 4 ,3, 1 } los vectores V y S no son circularmente iguales.
*/

fun main() {

    val v = arrayOf(3, 4, 1, 5)
    val s = arrayOf(1, 5, 3, 4)
    //foo(v, s)
    if (circular(v, s)) {
        println("El vector ES circular")
    } else {
        println("El vector NO ES circular")
    }

}

private fun foo(a1: Array<Int>, a2: Array<Int>) {

    // Soy consciente de que así solo funciona con un array de size 4, pero no soy capaz de dar con
    // la otra forma de hacerlo, me he quedado cerca, pero al final lo hice así porque no me salía del tod o

    if ((a1[0] == a2[1]) && (a1[1] == a2[2]) && (a1[2] == a2[3]) && (a1[3] == a2[0])) {
        println("Los arrays son circularmente iguales")
    } else if ((a1[0] == a2[0]) && (a1[1] == a2[1]) && (a1[2] == a2[2]) && (a1[3] == a2[3])) {
        println("Los arrays son circularmente iguales")
    } else if ((a1[0] == a2[3]) && (a1[1] == a2[0]) && (a1[2] == a2[1]) && (a1[3] == a2[2])) {
        println("Los arrays son circularmente iguales")
    } else if ((a1[0] == a2[2]) && (a1[1] == a2[3]) && (a1[2] == a2[0]) && (a1[3] == a2[1])) {
        println("Los arrays son circularmente iguales")
    } else {
        println("Los arrays NO SON circularmente iguales")
    }

}

fun circular(v: Array<Int>, s: Array<Int>):Boolean {

    var i = 0
    var j = s.lastIndexOf(v[0])

    while ((i < v.size) && (v[i] == s[j])) {
        i++
        j = (j + 1) % s.size
    }

    return i == v.size // Si i vale lo mismo que el tamaño del primer array, es que se ha recorrido entero
}


