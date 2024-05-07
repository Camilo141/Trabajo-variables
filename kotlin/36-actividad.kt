class `36-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

                val billetes = intArrayOf(50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10)

                print("Ingrese la cantidad de Bolívares: ")
                var cantidad = readln() .toInt()

                val resultado = desglosarBilletes(cantidad, billetes)

                println("Desglose de la cantidad en billetes:")
                resultado.forEach { (billete, conteo) ->
                    if (conteo > 0) {
                        println("Billetes de $billete: $conteo")
                    }
                }
            }

            fun desglosarBilletes(cantidad: Int, billetes: IntArray): Map<Int, Int> {
                var restante = cantidad
                val conteoBilletes = mutableMapOf<Int, Int>()

                for (billete in billetes) {
                    val conteo = restante / billete
                    conteoBilletes[billete] = conteo
                    restante %= billete
                }

                return conteoBilletes
            }



        }
    }
