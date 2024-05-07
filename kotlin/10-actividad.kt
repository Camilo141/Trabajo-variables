class `10-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
                val ChelinesAPesetas = 956.871 / 100
                val DolarAPesetas = 122.499
                val DracmasAPesetas = 88.607 / 100
                val FrancosBelgasAPesetas = 323.728 / 100
                val FrancoFrancesAPesetas = 20.11
                val LibraEsterlinaAPesetas = 178.938
                val LirasItalianasAPesetas = 9.289 / 100

                println("Ingrese una cantidad en chelines austriacos: ")
                val chelines = readln().toDouble()
                val pesetasDesdeChelines = chelines * ChelinesAPesetas
                println("$chelines chelines austríacos equivalen a $pesetasDesdeChelines pesetas")

                println("Ingrese una cantidad en dracmas griegos: ")
                val dracmas = readln().toDouble()
                val francosDesdeDracmas = dracmas * (1 / DracmasAPesetas) * FrancoFrancesAPesetas
                println("$dracmas dracmas griegos equivalen a $francosDesdeDracmas francos franceses")

                println("Ingrese una cantidad en pesetas: ")
                val pesetas = readln().toDouble()
                val dolaresDesdePesetas = pesetas / DolarAPesetas
                println("$pesetas pesetas equivalen a $dolaresDesdePesetas dólares")

                val lirasDesdePesetas = pesetas * LirasItalianasAPesetas
                println("$pesetas pesetas equivalen a $lirasDesdePesetas liras italianas")
            }
    }
}