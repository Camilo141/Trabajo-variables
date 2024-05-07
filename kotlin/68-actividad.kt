class Actividad68 {

    fun esPerfecto(n: Int): Boolean {
        var suma = 0
        for (i in 1 until n) {
            if (n % i == 0) {
                suma += i
            }
        }
        return suma == n
    }

    fun encontrarPerfectos() {
        var n = 2
        var countPerfectos = 0
        while (countPerfectos < 3) {
            if (esPerfecto(n)) {
                println("$n es un número perfecto")
                countPerfectos++
            }
            println("Revisando $n")
            n++
        }
    }
}

fun main() {
    val actividad = Actividad68()
    actividad.encontrarPerfectos()
}
