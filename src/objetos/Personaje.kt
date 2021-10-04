package objetos

const val algo = "" // las constantes solo almacenan tipos primitivos

open class Personaje {
    var nombre: String = "Alguno"
        get() = field.uppercase()
    var vida: Int = 100
    var mana: Int = 100
}

class Mago: Personaje() {

}

//class Personaje(var nombre: String, val vida: Int)

fun main() {

    val guerrero = Personaje()
    guerrero.nombre = "Otro" //setter
    println(guerrero.nombre) //getter
    val mago = Mago()
    println(mago.nombre)

}