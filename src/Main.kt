fun main() {

    // COMENTARIOS UNA LINEA

    /*

    comentarios multilinea

     */


    // VARIABLES -> var - variables que cambian
    // CONSTANTES -> val - datos que no cambian


    println("HOLA MUNDO")

    // VARIBLES DE TIPO IMPLICITO
    /*
        var numero = 56  // VARIABLE DE TIPO ENTERO

        var decimal = 12.5   // VARIABLE DE TIPO DECIMAL

        var texto = "REPASO KOTLIN"   //

        val pi = 3.14    // CONSTANTE


        println("VARIABLE DE TIPO ENTERO ${numero}")
        println("VARIABLE DE TIPO DECIMAL ${decimal}")
        println("VARIABLE DE TIPO TEXTO ${texto}")
        println("CONSTANTE ${pi}")
        */

    //VARIABLES DE TIPO EXPLICITO

    println("VARIABLES DE TIPO EXPLICITO")

    var numero1: Int = 56

    var decimal: Double = 12.5

    println("VARIABLE DE TIPO ENTERO ${numero1}")
    println("VARIABLE DE TIPO ENTERO ${decimal}")


    print(
        """
        
        OPCION 1
        OPCION 2
        OPCION 3
        OPCION 4
      
    """.trimIndent()
    )

    // INGRESAN DATOS POR TECLADO

    println("INGRESE UN NUMERO")
    var n1 = readln().toInt()

    println("INGRESE OTRO NUMERO")
    var n2 = readln().toInt()

    var su = n1 + n2

    println("LA SUMA DE ${n1} CON ${n2} ES: ${su}")


    // CONDICIONALES if - else
    /*
    var numero = 25

    if(numero > 0 ){
        println("POSITIVO")
    }else if(numero < 0){
        println("NEGATIVO")
    }else if(numero ==0){
        println("CERO")
    }
    */

    // WHEN
    /*
        print("INGRESE UNA OPCION")
        var op = readln().toInt()

        when (op) {

            1 -> {
                println("INSTRUCIONES")
                println("INSTRUCIONES")
                println("INSTRUCIONES")
            }

            2 -> {
                println("INSTRUCIONES")
                println("INSTRUCIONES")
                println("INSTRUCIONES")
            }

            else -> {
                 println("INSTRUCIONES")
                 println ("INSTRUCIONES")
                 println ("INSTRUCIONES")
        }
    */

    // ciclos for
/*
    for (i in 1..100 step 3) {
        println(i)

    }

    for (x in 100 downTo 1 step 3){

        println(x)

    }
*/

}