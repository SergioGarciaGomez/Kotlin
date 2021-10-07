package objetos

const val algo = "" // las constantes solo almacenan tipos primitivos

abstract class Personaje { // open por defecto
    var nombre: String = "Alguno"
        get() = field.uppercase()
    var vida: Int = 100
    var mana: Int = 100
}

class Mago: Personaje() {

}

data class Item(var nombre: String, var cantidad: Int)

val item = Item("Poti de vida", 10)

enum class tipoItem(puntos: Int) {
    COMUN(1), POCOCOMUN(3), RARO(5), EPICO(10), LEGENDARIO(50)
}

//class Personaje(var nombre: String, val vida: Int)

fun main() {

    val mago = Mago()
    mago.nombre = "Otro" //setter
    println(mago.nombre) //getter
    println(mago.vida)
    tipoItem.COMUN
    println(tipoItem.values().size)

   /* while (mago.vida > 0) {
        println("$")
    }*/

}