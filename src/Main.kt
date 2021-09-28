fun main() {
    println("Hello, world!!!")
    val valor = 10
    var secuencia = arrayOf(1, 2, 3, 4, 5, 6)
    var secuenciaNulos = arrayOfNulls<Int>(5)
    val cadena = "Esto es una cadena"
    println("El valor de mis variables es $cadena y $valor y \$valor")

    // post incremento y pre incremento / a++ / ++a
    val cadena2: String? = null;
    println(cadena2?.length) // variable? = null safety, se asegura que la variable no es nula
    val rangoNumerico = 1..20;
    println(rangoNumerico); // printa el objeto, habría que recorrer el objeto para printar el rango
    val rangoNumericoConSaltos = 1..20 step 2; // 1,3,5,7,9... esto ya no es un rango sino una progresión
    val rango: CharProgression = 'z'.downTo('a')
    for (l in rango) print(" $l")
    println()
    val cadena3: String? = null
    println("La cadena contiene: ${cadena3 ?: "Un valor nulo"}")

    when (cadena3 != null) {

    }

    val edad = 17
    val resultadoIf = if (edad >= 18) "Mayor de edad" else "Menor de edad"
    println(resultadoIf)

    val resultadoIf2 =

        if (edad >= 18) {
            val x = edad * 2
            x
        } else {
            edad
        }

    println(resultadoIf2)

    val resultadoWhen = when (edad * 2) {
        in 10..20 -> "Adolescente"
        in 21..40 -> "Adolescente algo más maduro"
        in 41..60 -> "Joven"
        in 61..80 -> "Segunda adolescencia"
        in 81..100 -> "La flor de la vida"
        else -> "A la tumba"
    }
    println(resultadoWhen)

    val rangoBucle = 0..100 step 3
    for (n in rangoBucle) print(" $n")
    println()

    for (num in 1..20) {
        if (num % 2 == 0) continue
        print(" $num")
    }
}