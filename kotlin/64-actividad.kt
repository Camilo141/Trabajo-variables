class `64-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
                val target = 1.99
                var sum = 0.0
                var term = 1.0
                var numberOfTerms = 0

                while (sum < target) {
                    sum += term
                    numberOfTerms += 1
                    term /= 2.0

                    if (sum > target) {
                        sum -= term
                        numberOfTerms -= 1
                        break
                    }
                }
                println("Numero de terminos: $numberOfTerms")
                println("Valor de la suma: $sum")
            }


        }
    }

