
    class EstacionClimatica {
        private var diasRegistrados = 0
        private var sumatoriaMaxima = 0
        private var sumatoriaMinima = 0
        private var errores = 0

        fun registrarTemperatura(maxima: Int, minima: Int) {
            diasRegistrados++
            if (maxima !in 14..30 || minima !in 14..30) {
                errores++
            } else {
                sumatoriaMaxima += maxima
                sumatoriaMinima += minima
            }
        }

        fun obtenerCantidadDias(): Int {
            return diasRegistrados
        }

        fun obtenerMediaMaxima(): Double {
            return if (diasRegistrados > 0) sumatoriaMaxima.toDouble() / diasRegistrados else 0.0
        }

        fun obtenerMediaMinima(): Double {
            return if (diasRegistrados > 0) sumatoriaMinima.toDouble() / diasRegistrados else 0.0
        }

        fun obtenerCantidadErrores(): Int {
            return errores
        }

        fun obtenerPorcentajeErrores(): Double {
            return if (diasRegistrados > 0) (errores.toDouble() / diasRegistrados) * 100 else 0.0
        }
    }

    fun main() {
        val estacion = EstacionClimatica()

        estacion.registrarTemperatura(25, 18)
        estacion.registrarTemperatura(28, 15)
        estacion.registrarTemperatura(32, 12) // Esta temperatura está fuera de rango
        estacion.registrarTemperatura(20, 22)

        println("Número de días registrados: ${estacion.obtenerCantidadDias()}")
        println("Media máxima: ${estacion.obtenerMediaMaxima()}")
        println("Media mínima: ${estacion.obtenerMediaMinima()}")
        println("Número de errores ingresados: ${estacion.obtenerCantidadErrores()}")
        println("Porcentaje de errores ingresados: ${estacion.obtenerPorcentajeErrores()}%")
    }


