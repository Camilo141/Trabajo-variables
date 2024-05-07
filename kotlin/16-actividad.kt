class `16-actividad` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val largo = 4.0
            val ancho = 1.5
            val area = largo * ancho
            val consumo = 0.5
            val areaPieza = consumo
            val cantidad = (area / areaPieza).toInt()
            val areaTotalPiezas = cantidad * areaPieza
            val desperdicio = area - areaTotalPiezas

            println("Con una lámina de $largo metros de largo y $ancho metros de ancho:")
            println("Se pueden fabricar $cantidad piezas")
            println("El desperdicio es de $desperdicio metros cuadrados")
        }

    }
}