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
    val rango: CharRange = 'z'.downTo('a') as CharRange;
    println(rango);
}