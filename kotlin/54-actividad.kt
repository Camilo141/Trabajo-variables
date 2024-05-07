class `54-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val totalCuestionarios = 64
            val preguntasPorCuestionario = 23
            val respuestasPosibles = 5


            val respuestas = Array(totalCuestionarios) { IntArray(preguntasPorCuestionario) }

            for (i in 0 until totalCuestionarios) {
                println("Ingrese las respuestas del cuestionario ${i + 1}:")
                for (j in 0 until preguntasPorCuestionario) {
                    print("Respuesta ${j + 1}: ")
                    respuestas[i][j] = readln().toInt()
                }

                var sumaPromedios = 0.0
                var promedioMasAlto = 0.0
                var promedioMasBajo = 5.0
                var cuestionariosInferioresA3 = 0
                var cuestionariosSuperioresA4 = 0
                var cuestionariosEntre45y5 = 0

                for (i in 0 until totalCuestionarios) {
                    var sumaPuntos = 0
                    for (j in 0 until preguntasPorCuestionario) {
                        sumaPuntos += respuestas[i][j]
                    }
                    val promedio = sumaPuntos.toDouble() / preguntasPorCuestionario
                    sumaPromedios += promedio

                    if (promedio > promedioMasAlto) {
                        promedioMasAlto = promedio
                    }
                    if (promedio < promedioMasBajo) {
                        promedioMasBajo = promedio
                    }

                    if (promedio < 3) {
                        cuestionariosInferioresA3++
                    }
                    if (promedio > 4) {
                        cuestionariosSuperioresA4++
                    }

                    if (promedio >= 4.5 && promedio <= 5) {
                        cuestionariosEntre45y5++
                    }
                }

                val porcentajeInferiorA3 = (cuestionariosInferioresA3.toDouble() / totalCuestionarios) * 100
                val porcentajeEntre45y5 = (cuestionariosEntre45y5.toDouble() / totalCuestionarios) * 100


                println("a. Promedio general de todos los cuestionarios: ${sumaPromedios / totalCuestionarios}")
                println("b. Promedio más alto obtenido: $promedioMasAlto")
                println("c. Promedio más bajo obtenido: $promedioMasBajo")
                println("d. Porcentaje de cuestionarios con promedio inferior a 3: $porcentajeInferiorA3%")
                println("e. Porcentaje de cuestionarios con promedio entre 4.5 y 5: $porcentajeEntre45y5%")
            }

        }
    }
}
