import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val signosZodiaco = mapOf(
        "Sagitario" to Pair(Pair(22, 11), Pair(21, 12)),
        "Capricornio" to Pair(Pair(22, 12), Pair(20, 1)),
        "Acuario" to Pair(Pair(21, 1), Pair(19, 2)),
        "Piscis" to Pair(Pair(20, 2), Pair(19, 3)),
        "Aries" to Pair(Pair(21, 3), Pair(20, 4)),
        "Tauro" to Pair(Pair(21, 4), Pair(21, 5)),
        "Géminis" to Pair(Pair(22, 5), Pair(21, 6)),
        "Cáncer" to Pair(Pair(22, 6), Pair(22, 7)),
        "Leo" to Pair(Pair(23, 7), Pair(23, 8)),
        "Virgo" to Pair(Pair(24, 8), Pair(22, 9)),
        "Libra" to Pair(Pair(23, 9), Pair(22, 10)),
        "Escorpio" to Pair(Pair(23, 10), Pair(21, 11))
    )

    println("Ingrese su fecha de nacimiento (formato dd-MM-yyyy):")
    val inputDate = scanner.nextLine()
    val (dia, mes, año) = inputDate.split("-").map { it.toInt() }
    val edad = calcularEdad(dia, mes, año)
    val signoZodiaco = obtenerSignoZodiaco(dia, mes, signosZodiaco)

    println("Su signo del zodiaco es $signoZodiaco y su edad es $edad años.")
}

fun calcularEdad(dia: Int, mes: Int, año: Int): Int {
    val calendario = Calendar.getInstance()
    val añoActual = calendario.get(Calendar.YEAR)
    val mesActual = calendario.get(Calendar.MONTH) + 1
    val diaDelMesActual = calendario.get(Calendar.DAY_OF_MONTH)

    var edad = añoActual - año

    if (mesActual < mes || (mesActual == mes && diaDelMesActual < dia)) {
        edad--
    }

    return edad
}

fun obtenerSignoZodiaco(dia: Int, mes: Int, signosZodiaco: Map<String, Pair<Pair<Int, Int>, Pair<Int, Int>>>): String {
    val fechaNacimiento = Pair(dia, mes)

    for ((signo, fechas) in signosZodiaco) {
        val inicioRango = fechas.first
        val finRango = fechas.second

        if (fechaNacimiento.first in inicioRango.first..finRango.first && fechaNacimiento.second == inicioRango.second ||
            fechaNacimiento.first in inicioRango.first..finRango.first && fechaNacimiento.second == finRango.second) {
            return signo
        }
    }

    return "Desconocido"
}