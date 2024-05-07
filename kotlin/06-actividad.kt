class `06-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Ingresar la cantidad de niños que hay en el salon: ")
            var niños : Int = readln().toInt()
            println("Ingresar la cantidad de niñas que hay en el salon: ")
            var niñas : Int = readln().toInt()

            val suma : Int = niños + niñas ;
            val porcentajeniños = (niños * 100)/ suma;
            val porcentajeniñas = (niñas * 100)/ suma;

            println("El porcentaje de niños es:  $porcentajeniños % " +
                    "El porcentaje de niñas es:  $porcentajeniñas % ");

        }
    }
}
