data class Alumno(val nombre: String, val notas: List<Int>)

fun calcularPromedio(notas: List<Int>): Double {
    return if (notas.isNotEmpty()) {
        notas.sum().toDouble() / notas.size
    } else {
        0.0
    }
}

fun main() {
    val alumnos = listOf(
        Alumno("María", listOf(16, 14, 15, 13, 9)),
        Alumno("Juan Carlos", listOf(10, 9, 7, 11, 14)),
        Alumno("Josefina", listOf(13, 12, 15, 17, 13)),
        Alumno("José Luis", listOf())
    )

    val promediosAlumnos = mutableListOf<Double>()
    var promedioClase = 0.0

    for (alumno in alumnos) {
        val promedio = calcularPromedio(alumno.notas)
        promediosAlumnos.add(promedio)
    }

    promedioClase = if (promediosAlumnos.isNotEmpty()) {
        promediosAlumnos.sum() / promediosAlumnos.size
    } else {
        0.0
    }

    var menorAlPromedio = 0
    var mayorAlPromedio = 0

    for (promedioAlumno in promediosAlumnos) {
        if (promedioAlumno < promedioClase) {
            menorAlPromedio++
        } else if (promedioAlumno > promedioClase) {
            mayorAlPromedio++
        }
    }

    println("Número Nombre Promedio")
    var numero = 1
    for (alumno in alumnos) {
        println("$numero ${alumno.nombre} ${calcularPromedio(alumno.notas)}")
        numero++
    }
    println("Promedio de la clase: $promedioClase")
    println("Alumnos con promedio menor al promedio de la clase: $menorAlPromedio")
    println("Alumnos con promedio mayor al promedio de la clase: $mayorAlPromedio")
}
