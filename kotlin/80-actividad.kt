data class Municipio(val codigo: Int)

class Ciudad(val codigo: Int) {
    private val municipios = mutableListOf<Municipio>()

    fun agregarMunicipio(municipio: Municipio) {
        municipios.add(municipio)
    }

    // Método público para obtener la lista de municipios
    fun getMunicipios(): List<Municipio> {
        return municipios.toList()
    }
}

class Estado(val codigo: Int) {
    private val ciudades = mutableListOf<Ciudad>()

    fun agregarCiudad(ciudad: Ciudad) {
        ciudades.add(ciudad)
    }

    fun obtenerTodosLosMunicipios(): List<Municipio> {
        val listaMunicipios = mutableListOf<Municipio>()
        for (ciudad in ciudades) {
            listaMunicipios.addAll(ciudad.getMunicipios())
        }
        return listaMunicipios
    }
}

fun main() {
    // Ejemplo de uso
    val municipio1 = Municipio(1)
    val municipio2 = Municipio(2)

    val ciudad1 = Ciudad(1)
    ciudad1.agregarMunicipio(municipio1)
    ciudad1.agregarMunicipio(municipio2)

    val municipio3 = Municipio(3)
    val municipio4 = Municipio(4)

    val ciudad2 = Ciudad(2)
    ciudad2.agregarMunicipio(municipio3)
    ciudad2.agregarMunicipio(municipio4)

    val estado = Estado(1)
    estado.agregarCiudad(ciudad1)
    estado.agregarCiudad(ciudad2)

    val todosLosMunicipios = estado.obtenerTodosLosMunicipios()
    println("Todos los municipios en el estado:")
    for (municipio in todosLosMunicipios) {
        println("Código: ${municipio.codigo}")
    }
}
