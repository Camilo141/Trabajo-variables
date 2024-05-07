class `24-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print("Ingrese el monto de la inversión inicial: ")
            val capitalInicial = readln() .toDouble()
            print("Ingrese la tasa de interés anual (%): ")
            val tasaInteres = readln() .toDouble()
            print("Ingrese el número de años: ")
            val años = readln() .toInt()

            var montoFinal = capitalInicial
            for (año in 1..años) {
                val intereses = montoFinal * (tasaInteres / 100)
                if (intereses > 7000) {
                    montoFinal += intereses
                    println("Año $año: Los intereses de $intereses exceden $7000 y se reinvierten. Nuevo saldo: $montoFinal")
                } else {
                    println("Año $año: Los intereses de $intereses no exceden $7000 y no se reinvierten.")
                }
            }
            println("El monto final en la cuenta después de $años años es de $montoFinal")
        }


        }

        }




