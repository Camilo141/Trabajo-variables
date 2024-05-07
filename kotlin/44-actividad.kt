class `44-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

                println("Ingrese el monto de la hipoteca:")
                val montoHipoteca = readln() .toDouble()
                println("Ingrese el monto total de inversión necesario para iniciar el negocio:")
                val inversionTotal = readln() .toDouble()

                val inversionPersona: Double
                val inversionSocio: Double

                if (montoHipoteca < 1_000_000) {
                    inversionPersona = inversionTotal / 2
                    inversionSocio = inversionTotal / 2
                } else {
                    inversionPersona = montoHipoteca
                    val restoInversion = inversionTotal - montoHipoteca
                    inversionSocio = restoInversion / 2
                }
                println("La persona invertirá: $inversionPersona")
                println("El socio invertirá: $inversionSocio")
            }


        }
    }
