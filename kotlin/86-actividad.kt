
    data class Profesor(val nombre: String, val sexo: Char, val edad: Int)

    fun main() {
        val profesores = listOf(
            Profesor("Juan", 'M', 35),
            Profesor("María", 'F', 40),
            Profesor("Pedro", 'M', 30),
            Profesor("Ana", 'F', 50),
            Profesor("Luis", 'M', 45)
        )


        val edadPromedio = profesores.map { it.edad }.average()


        val profesorMasJoven = profesores.minByOrNull { it.edad }


        val profesorMasMayor = profesores.maxByOrNull { it.edad }


        val profesorasMayoresAlPromedio = profesores.count { it.sexo == 'F' && it.edad > edadPromedio }


        val profesoresMenoresAlPromedio = profesores.count { it.edad < edadPromedio }


        println("Edad promedio del grupo de profesores: $edadPromedio")
        println("Nombre del profesor más joven del grupo: ${profesorMasJoven?.nombre}")
        println("Nombre del profesor más mayor del grupo: ${profesorMasMayor?.nombre}")
        println("Número de profesoras con edad mayor al promedio: $profesorasMayoresAlPromedio")
        println("Número de profesores con edad menor al promedio: $profesoresMenoresAlPromedio")
    }

