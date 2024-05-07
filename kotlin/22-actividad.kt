import kotlin.math.round

class `22-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print("Ingrese el precio al contado del computador: ")
            val precioContado = readln().toDouble()
            print("Ingrese el precio de cada cuota del computador: ")
            val precioCuota = readln().toDouble()

            val porcentajeRecargo = calcularRecargo(precioContado, precioCuota)
            println("El porcentaje de recargo por pagar en cuotas es del %.2f%%".format(porcentajeRecargo))
        }

        fun calcularRecargo(precioContado: Double, precioCuota: Double): Double {
            val totalCuotas = precioCuota * 12
            val diferencia = totalCuotas - precioContado
            val porcentajeRecargo = (diferencia / precioContado) * 100
            return Math.round(porcentajeRecargo * 100) / 100.0
        }
    }
}
