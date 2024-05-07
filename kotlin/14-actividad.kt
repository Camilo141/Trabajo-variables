
class `14-actividad` {



    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Opeacion a desarrollar ecuaciones lineales: "
                    + "aX + bY = c \n"
                    + "dX + eY = f \n  ")

            println("Ingrese el valor de a: " )
            val A: Double = readln().toDouble()
            println("Ingresar el valor de b: ")
            val B: Double = readln().toDouble()
            println("Ingresar el valor de c: ")
            val C: Double = readln().toDouble()
            println("Ingrese el valor de d: ")
            val D: Double = readln().toDouble()
            println("Ingresar el valor de e: ")
            val E: Double = readln().toDouble()
            println("Ingresar el valor de f: ")
            val F: Double = readln().toDouble()

            val operacion =(A * E - B * D)

            val x = (C * E - B * F) / operacion
            val y = (A * F - C * D) / operacion

            println("La solución del sistema de ecuaciones es: ")
            println("x = $x")
            println("y = $y")
        }
        }
    }

