class `48-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

                println("Fahrenheit  Celsius  Kelvin  Rankine")

                for (fahrenheit in 28..54) {
                    val celsius = (5 * (fahrenheit - 32)) / 9
                    val kelvin = celsius + 273.15
                    val rankine = fahrenheit + 459.67
                    println("$fahrenheit         $celsius         $kelvin       $rankine")
                }

                for (fahrenheit in 450..950 step 50) {
                    val celsius = (5 * (fahrenheit - 32)) / 9
                    val kelvin = celsius + 273.15
                    val rankine = fahrenheit + 459.67
                    println("$fahrenheit         $celsius         $kelvin       $rankine")
                }
                for (fahrenheit in -50..250 step 10) {
                    val celsius = (5 * (fahrenheit - 32)) / 9
                    val kelvin = celsius + 273.15
                    val rankine = fahrenheit + 459.67
                    println("$fahrenheit         $celsius         $kelvin       $rankine")
                }
            }


        }
    }

