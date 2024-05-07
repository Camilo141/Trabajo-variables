import kotlin.math.sqrt

class `12-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Matematicas

            println("Ingrese la nota de la evalucion de matematicas: ")
            var evaluacionmate : Double = readln().toDouble()
            println("Ingrese la nota de la primera tarea de matematicas: ")
            var tareaUnoM : Double  = readln().toDouble()
            println("Ingrese la nota de la segunda tarea de matematicas: ")
            var tareaDosM : Double = readln().toDouble()
            println("Ingrese la nota de la tercera tarea de matematicas: ")
            var tareaTresM : Double = readln().toDouble()

            val tareasMSuma = tareaUnoM + tareaDosM + tareaTresM
            val PromedioM = (evaluacionmate * 0.90) +  (tareasMSuma * 0.10 )
            println("El promedio de Matematicas es:  $PromedioM ")

            // Fisica

            println("Ingrese la nota de la evalucion de Fisica: ")
            var evaluacionfisica : Double = readln().toDouble()
            println("Ingrese la nota de la primera tarea de Fisica: ")
            var tareaUnoF : Double  = readln().toDouble()
            println("Ingrese la nota de la segunda tarea de Fisica: ")
            var tareaDosF : Double = readln().toDouble()

            val tareasFSuma = tareaUnoF + tareaDosF
            val PromedioF = (evaluacionfisica * 0.80) +  (tareasFSuma * 0.20 )
            println("El promedio de Fisica es:  $PromedioF ")

            // Quimica

            println("Ingrese la nota de la evalucion de Quimica: ")
            var evaluacionquimi : Double = readln().toDouble()
            println("Ingrese la nota de la primera tarea de Quimica: ")
            var tareaUnoQ : Double  = readln().toDouble()
            println("Ingrese la nota de la segunda tarea de Quimica: ")
            var tareaDosQ : Double = readln().toDouble()
            println("Ingrese la nota de la tercera tarea de Quimica: ")
            var tareaTresQ : Double = readln().toDouble()

            val tareasQSuma = tareaUnoQ + tareaDosQ + tareaTresQ
            val PromedioQ = (evaluacionquimi * 0.90) +  (tareasQSuma * 0.10 )
            println("El promedio de Quimica es:  $PromedioQ ")



        }
    }
}




