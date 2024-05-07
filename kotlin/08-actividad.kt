import kotlin.math.sqrt

class `08-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingresar el valor de A: ")
            val A: Double = readln().toDouble()
            println("Ingresar el valor de B: ")
            val B: Double = readln().toDouble()
            println("Ingresar el valor de C: ")
            val C: Double = readln().toDouble()

            val P: Double = (A + B + C) / 2

            val area = sqrt(P * (P - A) * (P - B) * (P - C))

            println("El área del triángulo es: $area")
        }
    }
}