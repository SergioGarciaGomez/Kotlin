package tema01

/*
    @author Sergio García

    Ejercicio 02 - Tema 01

    Muestra por pantalla el volumen de un cilindro conocido por su altura (h = 12.3) y su diámetro (d = 3.0).
    El volumen se calcula con la ecuación V = pi * r2 * h donde pi = 3.1416. r es el radio del cilindro.
*/

fun main() {

    val h = 12.3
    val d = 3
    val r = d / 2
    val volumen = 3.1416 * r * r * h
    println("El volumen de un cilindro con altura de 12.3m y diámetro de 3m es de $volumen L")
}