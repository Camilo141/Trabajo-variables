class `20-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Digite el monto del prestamo: ")
            var capital : Double = readln().toDouble()
            println("Digite la cantidad de intereses pagados: ")
            var interes : Double = readln().toDouble()
            println("Digite la duracion de años")
            var tiempo: Int = readln().toInt()

            val razon = (interes *100) / (capital * tiempo)
            val proceso = (capital * tiempo * razon ) /100
            println("El interes anual es: $proceso %")
}
}
}