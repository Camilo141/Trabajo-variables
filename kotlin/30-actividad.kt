class `30-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

                print("Ingrese el dígito A: ")
                val A = readln() .toInt()
                print("Ingrese el dígito B: ")
                val B = readln() .toInt()
                print("Ingrese el dígito C: ")
                val C = readln() .toInt()
                print("Ingrese el dígito D: ")
                val D = readln() .toInt()

                val N = A * 1000 + B * 100 + C * 10 + D
                val redondeado = if (N % 100 >= 50) ((N / 100) + 1) * 100
                else (N / 100) * 100
                println("El número $N se redondea a la centena más próxima que es: $redondeado")
            }



        }
    }
