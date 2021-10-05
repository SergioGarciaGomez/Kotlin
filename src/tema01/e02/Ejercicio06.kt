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

    val h = 6 // altura
    var espacios = h - 1 // la primera capa siempre serán h - 1 espacios, y -1 para cada capa extra de pirámide
    var capa = 1

    for (i:Int in 1..h) {

        for (j :Int in 1..espacios){ // bucle que pone los espacios en blanco
            print(" ")
        }
        espacios-- // cada vez que se repita los espacios necesarios serán -1 en relación con el anterior

        for (j :Int in 1..capa){ // imprime lo que sería la parte central de la pirámide, hacia la izquierda
            print(j)
        }

        for (j :Int in (capa - 1) downTo 1){ // imprime la parte derecha sin contar el centro
            print(j)
        }
        capa++
        println()
    }
}