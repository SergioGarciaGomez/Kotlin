package tema01.e02

/*
    @author Sergio García

    Ejercicio 06 - Tema 01

    Programa que dibuja una pirámide como en pantalla
       1
      121
     12321
    1234321
*/

fun main() {

    var altura = 4

    for (i:Int in 1..altura) {
        var cadena = ""
        for (j:Int in altura..i) cadena += " "
    }

}