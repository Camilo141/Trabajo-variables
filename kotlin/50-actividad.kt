class `50-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Digite el primer numero: ")
                val inicio = readln() .toInt()
            println("Digite el segundo numero: ")
                val fin = readln() .toInt()

                var sumaPares = 0
                for (numero in inicio..fin) {
                    if (numero % 2 == 0) {
                        sumaPares += numero
                    }
                }

                println("La suma de todos los números pares entre $inicio y $fin es: $sumaPares")
            }

        }
    }

