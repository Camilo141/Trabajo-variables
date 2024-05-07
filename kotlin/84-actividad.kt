class Proveedor(val nombre: String, var ciudad: String, var numArticulos: Int)

class RegistroProveedores {
    private val proveedores = mutableListOf<Proveedor>()

    fun agregarProveedor(proveedor: Proveedor) {
        proveedores.add(proveedor)
        proveedores.sortBy { it.nombre } // Ordenar proveedores alfabéticamente por nombre
    }

    fun buscarProveedor(nombreProveedor: String): Proveedor? {
        return proveedores.find { it.nombre == nombreProveedor }
    }

    fun actualizarCiudad(nombreProveedor: String, nuevaCiudad: String) {
        val proveedor = buscarProveedor(nombreProveedor)
        if (proveedor != null) {
            proveedor.ciudad = nuevaCiudad
        } else {
            println("Proveedor no encontrado.")
        }
    }

    fun actualizarNumArticulos(nombreProveedor: String, nuevoNumArticulos: Int) {
        val proveedor = buscarProveedor(nombreProveedor)
        if (proveedor != null) {
            proveedor.numArticulos = nuevoNumArticulos
        } else {
            println("Proveedor no encontrado.")
        }
    }
}

fun main() {
    val registro = RegistroProveedores()

    registro.agregarProveedor(Proveedor("Proveedor A", "Ciudad X", 100))
    registro.agregarProveedor(Proveedor("Proveedor B", "Ciudad Y", 150))
    registro.agregarProveedor(Proveedor("Proveedor C", "Ciudad Z", 200))

    val nombreProveedorABuscar = "Proveedor A"
    val proveedorEncontrado = registro.buscarProveedor(nombreProveedorABuscar)
    if (proveedorEncontrado != null) {
        println("Proveedor: ${proveedorEncontrado.nombre}")
        println("Ciudad: ${proveedorEncontrado.ciudad}")
        println("Número de artículos: ${proveedorEncontrado.numArticulos}")
    } else {
        println("Proveedor '$nombreProveedorABuscar' no encontrado.")
    }


    registro.actualizarCiudad("Proveedor B", "Nueva Ciudad")


    registro.actualizarNumArticulos("Proveedor C", 250)
}
