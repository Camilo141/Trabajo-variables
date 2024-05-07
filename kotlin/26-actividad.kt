class `26-actividad` {

        companion object {
            @JvmStatic
            fun main(args: Array<String>) {

                println("Digite el valor de A")
                var A = readln() .toInt()
                println("Digite el valor de B")
                var B = readln() .toInt()
                println("Digite el valor de C")
                var C = readln() .toInt()
                println("Digite el valor de D")
                var D = readln() .toInt()

                if ( D == 0 ){
                    val operacion1 = (A - C ) * (A - C)
                    println(" operacion: (A-C)² la respuesta es: $operacion1 ")
                }
                else {
                if (D > 0) {

                    val operacion2 = ((A - B) * (A - B) * (A - B)) / D
                    println(" operacion: (A-B)³/D la respuesta es: $operacion2 ")
                    }
                }

            }
        }
    }