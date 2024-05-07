class `32-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println( "Ingrese el valor de P: " )
            var P = readln() .toInt()
            println("Ingrese el valor de Q: ")
            var Q = readln() .toInt()

            val expresion = ((P * P * P ) + (Q * Q * Q * Q)) - (2* (P * P))
            if (expresion > 680 ) {
                println(
                    " El valor de P es: $P \n " +
                            " El valor de Q es: $Q \n" +
                            " El resultado fue: $expresion"
                )
            }
                else {
                    println( " los valores no satisfacen la expresion ")
                }

            }

        }
    }

