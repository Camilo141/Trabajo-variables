class Obrero(val nombre: String, val unidadesPorDia: IntArray) {
    fun totalProduccionSemana(): Int {
        return unidadesPorDia.sum()
    }
}

class Bloquera(val obreros: List<Obrero>, val limiteProduccion: Int) {
    fun calcularProduccionSemana(): List<Pair<String, Any>> {
        val produccionPorObrero = mutableListOf<Pair<String, Int>>()
        var obrerosQueSuperanLimite = 0

        for (obrero in obreros) {
            val totalProduccion = obrero.totalProduccionSemana()
            produccionPorObrero.add(obrero.nombre to totalProduccion)
            if (totalProduccion >= limiteProduccion) {
                obrerosQueSuperanLimite++
            }
        }

        val porcentajeSuperanLimite = obrerosQueSuperanLimite.toDouble() / obreros.size * 100

        val maxProduccion = produccionPorObrero.maxByOrNull { it.second }
        val promedioProduccion = produccionPorObrero.map { it.second }.average().toInt()

        val resultados = mutableListOf<Pair<String, Any>>()
        resultados.add("Porcentaje de obreros que superaron el límite" to porcentajeSuperanLimite)
        resultados.add("Obrero que más produjo" to (maxProduccion?.first ?: ""))
        resultados.add("Cantidad producida por el obrero que más produjo" to (maxProduccion?.second ?: 0))
        resultados.add("Promedio de producción de la bloquera en la semana" to promedioProduccion)

        return resultados
    }
}

fun main() {
    val obreros = listOf(
        Obrero("Juan", intArrayOf(100, 150, 200, 180, 160)),
        Obrero("María", intArrayOf(120, 130, 110, 90, 140)),
        Obrero("Pedro", intArrayOf(90, 100, 80, 110, 120))
    )

    val bloquera = Bloquera(obreros, 500)

    val resultados = bloquera.calcularProduccionSemana()

    resultados.forEach { println("${it.first}: ${it.second}") }
}
