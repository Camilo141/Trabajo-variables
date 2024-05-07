class `46-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
                println("Ingrese  el valor de N")
                val N = readln() .toInt()
                println("Ingrese el valor de K")
                val K = readln() .toInt()

                if (K >= N) {
                    println("Error: K debe ser menor que N.")
                    return
                }

                println("Secuencia de $N a $K:")
                for (i in N downTo K) {
                    print("$i ")
                }
            }


        }
    }
