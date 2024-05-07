class Alumno(val nombre: String, val calificaciones: List<Double>)

class Grupo(val alumnos: List<Alumno>)

class AñoEscolar(val grupos: List<Grupo>)

fun calcularPromedio(calificaciones: List<Double>): Double {
    return if (calificaciones.isNotEmpty()) {
        calificaciones.sum() / calificaciones.size
    } else {
        0.0
    }
}

fun main() {
    // Ejemplo de datos: Año Escolar
    val grupo1 = Grupo(
        listOf(
            Alumno("Juan", listOf(8.0, 7.5, 9.0)),
            Alumno("María", listOf(7.0, 8.0, 8.5)),
            Alumno("Pedro", listOf(9.0, 8.5, 9.5))
        )
    )

    val grupo2 = Grupo(
        listOf(
            Alumno("Ana", listOf(8.5, 9.0, 7.5)),
            Alumno("Luis", listOf(7.5, 8.0, 8.0)),
            Alumno("Sofía", listOf(8.0, 9.0, 9.5))
        )
    )

    val añoEscolar = AñoEscolar(listOf(grupo1, grupo2))

    // Calcular promedio de cada grupo
    val promediosGrupos = añoEscolar.grupos.map { grupo ->
        val promedioGrupo = grupo.alumnos.flatMap { it.calificaciones }.let { calcularPromedio(it) }
        promedioGrupo
    }

    // Calcular promedio de cada alumno
    val promediosAlumnos = añoEscolar.grupos.flatMap { grupo ->
        grupo.alumnos.map { alumno ->
            val promedioAlumno = calcularPromedio(alumno.calificaciones)
            alumno.nombre to promedioAlumno
        }
    }

    // Calcular promedio general de todos los grupos
    val promedioGeneral = promediosGrupos.average()

    // Imprimir resultados
    println("Promedio general de los grupos: $promedioGeneral")
    println("Promedio de cada grupo: $promediosGrupos")
    println("Promedio de cada alumno: $promediosAlumnos")
}
