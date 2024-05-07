class `02-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingresar por favor el capital que la persona invirtió: ")
            var capital : Int = readln().toInt()
            val mesUno: Int = 1
            val interes = 0.02f

            val ganancia = capital * interes * mesUno
            val total = (capital + ganancia) - capital;

            println("El porcentaje total después de haber pasado un mes será: \$ $total")
        }
    }
}