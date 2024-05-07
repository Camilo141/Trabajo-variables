class `66-actividad`

data class Maleta(val codigo: String, val peso: Double)
data class Pasajero(val codigoAbordo: String, val nombre: String, val maletas: List<Maleta>)
data class Vuelo(val numeroVuelo: String, val pasajeros: List<Pasajero>)

fun main() {
    val maletasPasajero1 = listOf(Maleta("M001", 4.0), Maleta("M002", 7.5))
    val maletasPasajero2 = listOf(Maleta("M003", 16.0), Maleta("M004", 2.0))
    val pasajerosVuelo1 = listOf(Pasajero("C001", "Juan", maletasPasajero1), Pasajero("C002", "Maria", maletasPasajero2))
    val vuelo1 = Vuelo("V001", pasajerosVuelo1)

    calcularInformacionVuelo(listOf(vuelo1))
}

fun calcularInformacionVuelo(vuelos: List<Vuelo>) {
    vuelos.forEach { vuelo ->
        var montoTotalVuelo = 0.0
        var totalPasajerosSinCargo = 0
        var maxPeso = 0.0
        var minPeso = Double.MAX_VALUE
        var pasajeroMaxPeso: Pasajero? = null
        var pasajeroMinPeso: Pasajero? = null

        vuelo.pasajeros.forEach { pasajero ->
            var totalKilos = 0.0
            var montoTotalPasajero = 0.0
            var maletaMaxPeso = 0.0
            var codigoMaletaMaxPeso = ""

            pasajero.maletas.forEach { maleta ->
                totalKilos += maleta.peso
                montoTotalPasajero += calcularMontoPorPeso(maleta.peso)
                if (maleta.peso > maletaMaxPeso) {
                    maletaMaxPeso = maleta.peso
                    codigoMaletaMaxPeso = maleta.codigo
                }
            }

            if (montoTotalPasajero == 0.0) totalPasajerosSinCargo++
            montoTotalVuelo += montoTotalPasajero

            println("Vuelo ${vuelo.numeroVuelo}, Código ${pasajero.codigoAbordo}, Nombre ${pasajero.nombre}, Total Kg ${totalKilos}, Monto a pagar $montoTotalPasajero")
            println("Vuelo ${vuelo.numeroVuelo}, Nombre ${pasajero.nombre}, Código maleta más pesada $codigoMaletaMaxPeso")

            if (totalKilos > maxPeso) {
                maxPeso = totalKilos
                pasajeroMaxPeso = pasajero
            }
            if (totalKilos < minPeso) {
                minPeso = totalKilos
                pasajeroMinPeso = pasajero
            }
        }

        println("Vuelo ${vuelo.numeroVuelo}, Pasajero con más peso: ${pasajeroMaxPeso?.nombre}, Peso: $maxPeso")
        println("Vuelo ${vuelo.numeroVuelo}, Pasajero con menos peso: ${pasajeroMinPeso?.nombre}, Peso: $minPeso")
        println("Vuelo ${vuelo.numeroVuelo}, Monto total por equipaje: $montoTotalVuelo")
        println("Porcentaje de pasajeros que no pagaron por equipaje: ${(totalPasajerosSinCargo.toDouble() / vuelo.pasajeros.size) * 100}%")
    }
}

fun calcularMontoPorPeso(peso: Double): Double = when {
    peso <= 3.0 -> 0.0
    peso <= 6.0 -> 600.0
    peso <= 9.0 -> 1200.0
    peso <= 12.0 -> 1500.0
    peso <= 15.0 -> 2000.0
    else -> 2500.0
}
