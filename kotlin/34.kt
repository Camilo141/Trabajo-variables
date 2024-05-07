class `34` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
// Solicitar al usuario la categoría y el sueldo actual
            print("Ingrese la categoría del trabajador (1, 2, 3, 4): ")
            val categoria = readln() .toInt()
            print("Ingrese el sueldo actual del trabajador: ")
            val sueldoActual = readln() .toDouble()

            val aumento = when (categoria) {
                1 -> 0.15
                2 -> 0.10
                3 -> 0.08
                4 -> 0.07
                else -> {
                    println("Categoría no válida. No se aplicará aumento.")
                    0.0
                }
            }
            val nuevoSueldo = sueldoActual + (sueldoActual * aumento)


            println("El nuevo sueldo será de: $${"%.2f".format(nuevoSueldo)}")

        }


    }
}
