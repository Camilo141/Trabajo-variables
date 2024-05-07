class Cliente(val codigo: Int, var pagarésPendientes: Int, var montoTotalPagado: Int = 0) {
    fun cancelarPagarés(cantidad: Int) {
        if (cantidad <= pagarésPendientes) {
            pagarésPendientes -= cantidad
            montoTotalPagado += cantidad * 50000
        } else {
            println("El cliente no tiene suficientes pagarés pendientes para cancelar.")
        }
    }
}

class Banco {
    private val clientes = mutableListOf<Cliente>()

    fun cargarDatos(codigo: Int, pagarésPendientes: Int) {
        clientes.add(Cliente(codigo, pagarésPendientes))
    }

    fun registrarCancelaciónPagarés(codigoCliente: Int, cantidadCancelar: Int) {
        val cliente = clientes.find { it.codigo == codigoCliente }
        if (cliente != null) {
            cliente.cancelarPagarés(cantidadCancelar)
        } else {
            println("El cliente con el código $codigoCliente no existe.")
        }
    }

    fun generarListado() {
        val clientesConPagos = clientes.filter { it.montoTotalPagado > 0 }
            .sortedByDescending { it.montoTotalPagado }

        println("Código Cliente | Pagarés Pendientes | Pagarés Cancelados | Monto Total Pagado")
        clientesConPagos.forEach {
            println("${it.codigo} | ${it.pagarésPendientes} | ${it.pagarésPendientes} | ${it.montoTotalPagado}")
        }
    }
}

fun main() {
    val banco = Banco()

    banco.cargarDatos(215, 10)
    banco.cargarDatos(102, 15)

    banco.registrarCancelaciónPagarés(215, 2)

    banco.generarListado()
}
