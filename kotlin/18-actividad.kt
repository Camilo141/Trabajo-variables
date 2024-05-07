

class `18-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingrese la cantidad de galones surtidos:")
            val galonesSurtidos = readLine()?.toDouble() ?: run {
                println("Por favor, ingrese una cantidad válida de galones.")
                return
            }

            val litrosPorGalon = 3.785
            val precioPorLitro = 100
            val litrosSurtidos = galonesSurtidos * litrosPorGalon
            val total = litrosSurtidos * precioPorLitro

            println("El monto total a cobrar es de $total Bolívares.")
        }
    }
}


