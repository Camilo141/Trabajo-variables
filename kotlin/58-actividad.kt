class `58-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingrese el capital a depositar:")
            val capital = readln().toDouble()
            println("Ingrese la tasa de interés (%):")
            val tasaInteres = readln().toDouble()
            println("Ingrese la duración del depósito en semanas:")
            val duracionSemanas =readln().toInt()
            val capitalTotal = calcularCapitalAcumulado(capital, tasaInteres, duracionSemanas)
            println("El capital total acumulado al final del período de $duracionSemanas semanas es: $capitalTotal")
        }

        fun calcularCapitalAcumulado(capital: Double, tasaInteres: Double, duracionSemanas: Int): Double {
            val tasaDiaria = tasaInteres / 100 / 365
            val duracionDias = duracionSemanas * 7
            var capitalAcumulado = capital

            repeat(duracionDias) {
                val interesDiario = capitalAcumulado * tasaDiaria
                capitalAcumulado += interesDiario
            }

            return capitalAcumulado
        }
    }
}