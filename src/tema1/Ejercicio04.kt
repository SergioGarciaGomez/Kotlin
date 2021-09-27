package tema1

/*
    @author Sergio García

    Ejercicio 04 - Tema 01

    Dados los números AB y 03 calcula sobre papel las operaciones AND OR Y XOR de los números dados.
    Un desplazamiento de 2 bits a la derecha de AB
    Un desplazamiento de 3 bits a la izquierda de AB
*/

fun main() {

    val n1 = 0xAB
    val n2 = 3

    println("AB and 3 = ${n1 and n2}") // Resultado = 3    Hex = 03
    println("AB or 3 = ${n1 or n2}")   // Resultado = 171  Hex = AB
    println("AB xor 3 = ${n1 xor n2}") // Resultado = 168  Hex = A8
    println("AB shr 2 = ${n1 shr 2}")  // Resultado = 42   Hex = 2A
    println("AB shl 3 = ${n1 shl 3}")  // Resultado = 1368 Hex = 558
}