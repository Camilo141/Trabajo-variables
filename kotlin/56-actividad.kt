class `56-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingrese el dividendo: ")
            var dividendo = readLine()!!.toInt()

            println("Ingrese el divisor: ")
            var divisor = readLine()!!.toInt()

            val resultado = divisionPorRestasSucesivas(dividendo, divisor)

            println("Resultado de dividir $dividendo entre $divisor:")
            println("Cociente: ${resultado.first}")
            println("Resto: ${resultado.second}")
        }

        fun divisionPorRestasSucesivas(dividendo: Int, divisor: Int): Pair<Int, Int> {
            var cociente = 0
            var resto = dividendo
            while (resto >= divisor) {
                resto -= divisor
                cociente++
            }
            return Pair(cociente, resto)
        }
    }
}


