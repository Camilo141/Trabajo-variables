class `40-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

                println("Ingrese la lectura anterior:")
                val lecturaAnterior = readln() .toDouble()
                println("Ingrese la lectura actual:")
                val lecturaActual = readln() .toDouble()

                val diferenciaLecturas = lecturaActual - lecturaAnterior

                val montoAPagar = when {
                    diferenciaLecturas <= 100 -> diferenciaLecturas * 2622.00
                    diferenciaLecturas <= 300 -> 100 * 2622.00 + (diferenciaLecturas - 100) * 79.78
                    diferenciaLecturas <= 500 -> 100 * 2622.00 + 200 * 79.78 + (diferenciaLecturas - 300) * 89.52
                    else -> 100 * 2622.00 + 200 * 79.78 + 200 * 89.52 + (diferenciaLecturas - 500) * 97.95
                }
                println("El monto a pagar es: Bs. $montoAPagar")
            }


        }
    }
