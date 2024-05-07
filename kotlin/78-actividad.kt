data class Producto(val codigo: Int, val precio: Double)

data class Venta(val producto: Producto, val unidadesVendidas: Int)

class PuntoDeVenta(val codigo: Int, val sucursal: Sucursal) {
    private val ventas = mutableListOf<Venta>()

    fun registrarVenta(venta: Venta) {
        ventas.add(venta)
    }

    fun imprimirInformacion() {
        val montoNeto = obtenerMontoNeto()
        val comision = calcularComision()
        val codigoProductoMenorVenta = obtenerCodigoProductoConMenorVenta()

        println("Punto de venta: $codigo")
        println("Unidades vendidas: ${ventas.sumBy { it.unidadesVendidas }}")
        println("Monto neto de la venta: $montoNeto")
        println("Monto pagado por comisión a los vendedores: $comision")
        println("Código del producto con menor número de unidades vendidas: $codigoProductoMenorVenta")
    }

    fun calcularComision(): Double {
        val comisionTotal = ventas.sumByDouble { it.producto.precio * it.unidadesVendidas * 0.1 }
        return if (sucursal.vendedores.isNotEmpty()) {
            comisionTotal / sucursal.vendedores.size.toDouble()
        } else {
            0.0
        }
    }

    fun obtenerMontoNeto(): Double {
        return ventas.sumByDouble { it.producto.precio * it.unidadesVendidas }
    }

    fun obtenerCodigoProductoConMenorVenta(): Int? {
        val productosVendidos = ventas.groupBy { it.producto.codigo }
        val productoMenosVendido = productosVendidos.minByOrNull { it.value.sumBy { venta -> venta.unidadesVendidas } }
        return productoMenosVendido?.key
    }
}

class Sucursal(val codigo: Int, val descripcion: String, val montoEsperadoVenta: Double) {
    private val puntosDeVenta = mutableListOf<PuntoDeVenta>()
    val vendedores = mutableListOf<String>()

    fun agregarPuntoDeVenta(puntoDeVenta: PuntoDeVenta) {
        puntosDeVenta.add(puntoDeVenta)
    }

    fun calcularMontoTotalVendido(): Double {
        return puntosDeVenta.sumByDouble { it.obtenerMontoNeto() }
    }

    fun calcularPorcentajeVentaAlcanzado(): Double {
        val montoTotal = calcularMontoTotalVendido()
        return (montoTotal / montoEsperadoVenta) * 100
    }

    fun obtenerPuntoVentaConMayorComision(): Pair<Int, Double>? {
        val puntoVentaMayorComision = puntosDeVenta.maxByOrNull { it.calcularComision() }
        return puntoVentaMayorComision?.let { it.codigo to it.calcularComision() } ?: Pair(-1, 0.0)
    }
}

fun main() {
    val sucursal = Sucursal(1, "Sucursal 1", 1000.0)
    sucursal.vendedores.addAll(listOf("Vendedor 1", "Vendedor 2", "Vendedor 3"))

    val puntoDeVenta = PuntoDeVenta(1001, sucursal)
    sucursal.agregarPuntoDeVenta(puntoDeVenta)

    val producto1 = Producto(1, 10.0)
    val producto2 = Producto(2, 20.0)
    val producto3 = Producto(3, 30.0)

    puntoDeVenta.registrarVenta(Venta(producto1, 5))
    puntoDeVenta.registrarVenta(Venta(producto2, 3))
    puntoDeVenta.registrarVenta(Venta(producto3, 7))

    puntoDeVenta.imprimirInformacion()

    println("Sucursal: ${sucursal.codigo}, Descripción: ${sucursal.descripcion}")
    println("Monto total vendido: ${sucursal.calcularMontoTotalVendido()}")
    println("Porcentaje de venta alcanzado: ${sucursal.calcularPorcentajeVentaAlcanzado()}%")
    val puntoVentaConMayorComision = sucursal.obtenerPuntoVentaConMayorComision()
    println("Punto de venta con mayor comisión: Código ${puntoVentaConMayorComision?.first}, Comisión ${puntoVentaConMayorComision?.second}")

    val porcentajeSucursalesAlcanzado = if (sucursal.calcularPorcentajeVentaAlcanzado() >= 100) 100 else 0
    println("Porcentaje de sucursales que alcanzaron el monto de venta esperado: $porcentajeSucursalesAlcanzado%")
}
