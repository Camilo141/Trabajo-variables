class `04-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingresar el total de la cuenta sin descuento: ")
            var totalSin : Int = readln().toInt()
            val descuento = 0.15f

            val operacion = totalSin * descuento;
            val totalDes = totalSin - operacion ;

            println("El total de la cuenta con un 20% de descuento: \$ $totalDes ");
        }
    }
}

