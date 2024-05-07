class `28-actividad` {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(" Ingrese el valor total de la compra: ")
            var compra = readln() .toDouble()
            val porcentajecredito = 0.20

            if (compra > 500000) {

                val empresa = compra * 0.55
                val prestamo = compra * 0.30
                val interes = (compra * 0.15) * porcentajecredito
                val credito = (compra * 0.15) + interes
                println(
                    " La cantidad de los fondos de la empresa a invertir es: $empresa \n" +
                            " La cantidad a pagar de credito es: $credito \n" +
                            " El monto a pagar por intereses es: $interes \n" +
                            " La cantidad prestada del banco es: $prestamo"
                );
            }
                else {

            val empresa2 = compra * 0.70
            val interes2 = (compra * 0.30) * porcentajecredito
            val credito2 = (compra * 0.30) + interes2
            println(" La cantidad de los fondos de la empresa a invertir es: $empresa2 \n"+
                    " La cantidad a pagar de credito es: $credito2 \n" +
                    " El monto a pagar por intereses es: $interes2");

                }



            }


        }

    }
