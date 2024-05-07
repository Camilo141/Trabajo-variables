class `42-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingrese la edad de la persona:")
            val edad = readln().toInt()
            println("Ingrese el nivel de hemoglobina en la sangre en g%:")
            val nivelHemoglobina = readln().toDouble()
            println("Ingrese el sexo de la persona M para masculino y F para femenino:")

            val sexo = readln().toUpperCase()
            val tieneAnemia = when {
                edad <= 0 -> false
                edad <= 1 -> nivelHemoglobina < 13 || nivelHemoglobina > 26
                edad <= 6 -> nivelHemoglobina < 10 || nivelHemoglobina > 18
                edad <= 12 -> nivelHemoglobina < 11 || nivelHemoglobina > 15
                edad <= 5 -> nivelHemoglobina < 11.5 || nivelHemoglobina > 15
                edad <= 10 -> nivelHemoglobina < 12.6 || nivelHemoglobina > 15.5
                edad <= 15 -> nivelHemoglobina < 13 || nivelHemoglobina > 15.5
                sexo == "F" -> nivelHemoglobina < 12 || nivelHemoglobina > 16
                sexo == "M" -> nivelHemoglobina < 14 || nivelHemoglobina > 18
                else -> false
            }
            if (tieneAnemia) {
                println("La persona tiene anemia.")
            } else {
                println("La persona no tiene anemia.")
            }
        }

    }
}