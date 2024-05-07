class `52-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
                var pesoNinos = 0
                var pesoJovenes = 0
                var pesoAdultos = 0
                var pesoViejos = 0
                var contadorNinos = 0
                var contadorJovenes = 0
                var contadorAdultos = 0
                var contadorViejos = 0


                repeat(100) {
                    println("Ingrese la edad de la persona ${it + 1}: ")
                    val edad =  readln() .toInt()

                    when {
                        it <= 12 -> {
                            pesoNinos += edad
                            contadorNinos++
                        }
                        it in 13..29 -> {
                            pesoJovenes += edad
                            contadorJovenes++
                        }
                        it in 30..59 -> {
                            pesoAdultos += edad
                            contadorAdultos++
                        }
                        else -> {
                            pesoViejos += edad
                            contadorViejos++
                        }
                    }
                }

                val promedioNinos = pesoNinos.toFloat() / contadorNinos
                val promedioJovenes = pesoJovenes.toFloat() / contadorJovenes
                val promedioAdultos = pesoAdultos.toFloat() / contadorAdultos
                val promedioViejos = pesoViejos.toFloat() / contadorViejos


            println("Promedio de peso de niños: $promedioNinos")
            println("Promedio de peso de jóvenes: $promedioJovenes")
            println("Promedio de peso de adultos: $promedioAdultos")
            println("Promedio de peso de viejos: $promedioViejos")
        }


            }
    }
