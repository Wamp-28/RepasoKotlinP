fun main() {

    /*
        =====================================================
        1. COMENTARIOS EN KOTLIN
        =====================================================
    */

    // Comentario de una sola línea

    /*
        Comentario
        de varias
        líneas
    */


    /*
        =====================================================
        2. MOSTRAR INFORMACIÓN EN CONSOLA
        =====================================================
    */

    println("HOLA MUNDO")

    println("Bienvenidos al repaso de Kotlin")

    // print NO hace salto de línea
    print("Hola ")
    print("Estudiantes")

    println()


    /*
        =====================================================
        3. VARIABLES Y CONSTANTES
        =====================================================
    */

    // var -> variable que puede cambiar
    // val -> dato que no puede cambiar

    var edad = 20

    val pi = 3.1416

    println("Edad: $edad")
    println("PI: $pi")


    /*
        Podemos modificar una variable creada con var.
    */

    edad = 25

    println("Nueva edad: $edad")


    /*
        Esto produciría error porque pi fue creado con val:

        pi = 4.5
    */


    /*
        =====================================================
        4. TIPOS DE DATOS
        =====================================================
    */

    var numeroEntero: Int = 50

    var numeroDecimal: Double = 25.5

    var nombre: String = "Carlos"

    var letra: Char = 'A'

    var estado: Boolean = true


    println("Número entero: $numeroEntero")

    println("Número decimal: $numeroDecimal")

    println("Nombre: $nombre")

    println("Letra: $letra")

    println("Estado: $estado")


    /*
        =====================================================
        5. TIPO IMPLÍCITO
        =====================================================

        Kotlin puede reconocer automáticamente el tipo
        de dato.
    */

    var numero = 100

    var decimal = 10.5

    var texto = "Aprendiendo Kotlin"

    var activo = true


    println(numero)

    println(decimal)

    println(texto)

    println(activo)


    /*
        =====================================================
        6. CONCATENACIÓN E INTERPOLACIÓN
        =====================================================
    */

    var estudiante = "Laura"

    var semestre = 3


    // Concatenación
    println("Estudiante: " + estudiante)


    // Interpolación
    println("Estudiante: $estudiante")


    // También podemos hacer operaciones dentro de ${}
    println("Próximo semestre: ${semestre + 1}")


    /*
        =====================================================
        7. TEXTO DE VARIAS LÍNEAS
        =====================================================
    */

    println(
        """
        
        MENÚ PRINCIPAL
        
        1. Registrar
        2. Consultar
        3. Modificar
        4. Salir
        
        """.trimIndent()
    )


    /*
        =====================================================
        8. OPERADORES ARITMÉTICOS
        =====================================================
    */

    var a = 20

    var b = 5


    println("Suma: ${a + b}")

    println("Resta: ${a - b}")

    println("Multiplicación: ${a * b}")

    println("División: ${a / b}")

    println("Residuo: ${a % b}")


    /*
        =====================================================
        9. INGRESAR DATOS POR TECLADO
        =====================================================
    */

    print("Ingrese su nombre: ")

    var nombreUsuario = readln()

    println("Bienvenido $nombreUsuario")


    print("Ingrese un número: ")

    var n1 = readln().toInt()


    print("Ingrese otro número: ")

    var n2 = readln().toInt()


    var suma = n1 + n2


    println(
        "La suma de $n1 y $n2 es: $suma"
    )


    /*
        =====================================================
        10. CONVERSIONES DE DATOS
        =====================================================
    */

    var textoNumero = "100"

    var numeroConvertido = textoNumero.toInt()


    println(numeroConvertido)


    /*
        Otras conversiones importantes:

        toInt()
        toDouble()
        toFloat()
        toString()
    */


    /*
        =====================================================
        11. OPERADORES DE COMPARACIÓN
        =====================================================
    */

    /*
        >   mayor que
        <   menor que
        >=  mayor o igual
        <=  menor o igual
        ==  igual
        !=  diferente
    */


    var x = 10

    var y = 20


    println(x > y)

    println(x < y)

    println(x == y)

    println(x != y)


    /*
        =====================================================
        12. OPERADORES LÓGICOS
        =====================================================
    */

    /*
        &&  AND
        ||  OR
        !   NOT
    */


    var edadPersona = 25

    var tieneDocumento = true


    if (edadPersona >= 18 && tieneDocumento) {

        println("Puede ingresar")

    }


    /*
        =====================================================
        13. CONDICIONAL IF
        =====================================================
    */

    var numeroEvaluar = 25


    if (numeroEvaluar > 0) {

        println("POSITIVO")

    }


    /*
        =====================================================
        14. IF - ELSE
        =====================================================
    */

    var nota = 4.0


    if (nota >= 3.0) {

        println("APROBÓ")

    } else {

        println("REPROBÓ")

    }


    /*
        =====================================================
        15. IF - ELSE IF - ELSE
        =====================================================
    */

    var numeroValidar = -10


    if (numeroValidar > 0) {

        println("POSITIVO")

    } else if (numeroValidar < 0) {

        println("NEGATIVO")

    } else {

        println("CERO")

    }


    /*
        =====================================================
        16. WHEN
        =====================================================

        when es parecido al switch de otros lenguajes.
    */

    var opcion = 2


    when (opcion) {

        1 -> {

            println("Seleccionó registrar")

        }

        2 -> {

            println("Seleccionó consultar")

        }

        3 -> {

            println("Seleccionó modificar")

        }

        4 -> {

            println("Seleccionó salir")

        }

        else -> {

            println("Opción incorrecta")

        }
    }


    /*
        =====================================================
        17. FOR
        =====================================================
    */

    println("FOR ASCENDENTE")


    for (i in 1..10) {

        println(i)

    }


    /*
        =====================================================
        18. FOR DESCENDENTE
        =====================================================
    */

    println("FOR DESCENDENTE")


    for (i in 10 downTo 1) {

        println(i)

    }


    /*
        =====================================================
        19. FOR CON STEP
        =====================================================
    */

    println("NÚMEROS DE 2 EN 2")


    for (i in 0..20 step 2) {

        println(i)

    }


    /*
        =====================================================
        20. WHILE
        =====================================================
    */

    var contador = 1


    while (contador <= 10) {

        println(contador)

        contador++

    }


    /*
        =====================================================
        21. DO WHILE
        =====================================================
    */

    var contador2 = 1


    do {

        println(contador2)

        contador2++

    } while (contador2 <= 10)


    /*
        =====================================================
        22. FUNCIONES
        =====================================================
    */

    saludar()


    /*
        =====================================================
        23. FUNCIÓN CON PARÁMETROS
        =====================================================
    */

    saludarPersona("Pedro")


    /*
        =====================================================
        24. FUNCIÓN QUE RETORNA UN VALOR
        =====================================================
    */

    var resultado = sumar(10, 5)

    println("Resultado función: $resultado")


    /*
        =====================================================
        25. FUNCIÓN CON WHEN
        =====================================================
    */

    var resultadoOperacion = calcular(
        10.0,
        5.0,
        "+"
    )

    println(
        "Resultado calculadora: $resultadoOperacion"
    )

}


/*
    =====================================================
    FUNCIONES
    =====================================================
*/


fun saludar() {

    println("Hola desde una función")

}


fun saludarPersona(nombre: String) {

    println("Hola $nombre")

}


fun sumar(
    numero1: Int,
    numero2: Int
): Int {

    return numero1 + numero2

}


fun calcular(
    numero1: Double,
    numero2: Double,
    operacion: String
): Double {

    return when (operacion) {

        "+" -> numero1 + numero2

        "-" -> numero1 - numero2

        "*" -> numero1 * numero2

        "/" -> numero1 / numero2

        else -> 0.0

    }
}