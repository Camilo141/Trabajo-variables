class `60-actividad` {
    data class Factura(
        val numFac: Int,
        val numCli: String,
        val monFac: Double,
        val fecCom: Int,
        val fecPag: Int
    )

    fun calcularMontos(factura: Factura): Pair<Double, Double> {
        val diasDiferencia = factura.fecPag - factura.fecCom

        val interesMora = when {
            diasDiferencia >= 60 -> factura.monFac * 0.08
            diasDiferencia in 31..59 -> factura.monFac * 0.06
            else -> 0.0
        }

        val descuentoProntoPago = if (diasDiferencia < 15) factura.monFac * 0.02 else 0.0

        return Pair(interesMora, descuentoProntoPago)
    }

    fun main() {
        println("Ingrese el número de facturas a procesar:")
        val numFacturas = readLine()!!.toInt()

        val facturas = mutableListOf<Factura>()

        repeat(numFacturas) {
            println("Ingrese los datos de la factura ${it + 1}:")
            print("Número de factura: ")
            val numFac = readLine()!!.toInt()
            print("Nombre del cliente: ")
            val numCli = readLine()!!
            print("Monto de la factura: ")
            val monFac = readLine()!!.toDouble()
            print("Fecha de compra (días desde la compra): ")
            val fecCom = readLine()!!.toInt()
            print("Fecha de pago (días desde la compra): ")
            val fecPag = readLine()!!.toInt()

            facturas.add(Factura(numFac, numCli, monFac, fecCom, fecPag))
        }

        for (factura in facturas) {
            val montos = calcularMontos(factura)
            println("Factura ${factura.numFac}:")
            println("Nombre del cliente: ${factura.numCli}")
            println("Monto a cancelar: ${factura.monFac}")
            println("Monto a pagar por interés de mora: ${montos.first}")
            println("Monto descontado por pronto pago: ${montos.second}")
            println()
        }
    }
}
