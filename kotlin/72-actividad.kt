
    import kotlin.math.pow

    class Satelite(val nombre: String, val pais: String, val masa: Double, val altura: Double) {
        companion object {
            const val MASA_TIERRA = 5.97e24
            const val G = 6.67259e-11
        }

        fun calcularFuerzaAtraccion(): Double {
            val distancia = altura + 6371000
            return (G * masa * MASA_TIERRA) / distancia.pow(2)
        }
    }

    fun main() {
        val satelites = listOf(
            Satelite("Canada 1", "Canadá", 8300.0, 31200000.0),
            Satelite("Alfa 1", "Chile", 5500.0, 36000000.0),
            Satelite("Boby 4", "EE.UU.", 12000.0, 33450000.0),
            Satelite("Che 3", "Argentina", 3350.0, 34200000.0)
        )


        val fuerzasAtraccion = satelites.map { it.calcularFuerzaAtraccion() }
        val mayorFuerza = fuerzasAtraccion.maxOrNull()
        val menorFuerza = fuerzasAtraccion.minOrNull()
        println("Mayor fuerza de atracción: $mayorFuerza")
        println("Menor fuerza de atracción: $menorFuerza")

        val fuerzaPromedio = fuerzasAtraccion.average()
        println("Fuerza de atracción promedio: $fuerzaPromedio")

        val mayorMasa = satelites.maxByOrNull { it.masa }?.masa
        println("Mayor masa de los satélites: $mayorMasa")

        val masaPromedio = satelites.map { it.masa }.average()
        println("Masa promedio de los satélites: $masaPromedio")

        val menorAltura = satelites.minByOrNull { it.altura }?.altura
        val mayorAltura = satelites.maxByOrNull { it.altura }?.altura
        println("Menor altura de los satélites: $menorAltura")
        println("Mayor altura de los satélites: $mayorAltura")
    }

