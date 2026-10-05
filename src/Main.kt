fun main() {

    /*
        ============================================
        1. COMENTARIOS
        ============================================
    */

    // Comentario de una sola línea

    /*
        Comentario
        de varias líneas
    */


    /*
        ============================================
        2. SALIDA POR CONSOLA
        ============================================
    */

    println("HOLA MUNDO")

    println("Bienvenidos al repaso de Kotlin")

    print("Hola ")
    print("Estudiantes")

    println()


    /*
        ============================================
        3. VARIABLES Y CONSTANTES
        ============================================
    */

    // var -> puede cambiar
    // val -> no puede cambiar

    var edad = 20

    val pi = 3.1416

    println("Edad: $edad")
    println("PI: $pi")

    edad = 25

    println("Nueva edad: $edad")


    /*
        ============================================
        4. TIPOS DE DATOS EXPLÍCITOS
        ============================================
    */

    var numeroEntero: Int = 50

    var numeroDecimal: Double = 25.5

    var nombre: String = "Carlos"

    var letra: Char = 'A'

    var activo: Boolean = true


    println("Número entero: $numeroEntero")

    println("Número decimal: $numeroDecimal")

    println("Nombre: $nombre")

    println("Letra: $letra")

    println("Activo: $activo")


    /*
        ============================================
        5. TIPOS DE DATOS IMPLÍCITOS
        ============================================
    */

    var numero = 100

    var decimal = 10.5

    var texto = "Aprendiendo Kotlin"

    var estado = true


    println(numero)

    println(decimal)

    println(texto)

    println(estado)


    /*
        ============================================
        6. INTERPOLACIÓN DE VARIABLES
        ============================================
    */

    var estudiante = "Laura"

    var semestre = 3


    println("Estudiante: $estudiante")

    println("Semestre: $semestre")

    println("Próximo semestre: ${semestre + 1}")


    /*
        ============================================
        7. TEXTO DE VARIAS LÍNEAS
        ============================================
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
        ============================================
        8. OPERADORES ARITMÉTICOS
        ============================================
    */

    var a = 20

    var b = 5


    println("Suma: ${a + b}")

    println("Resta: ${a - b}")

    println("Multiplicación: ${a * b}")

    println("División: ${a / b}")

    println("Residuo: ${a % b}")


    /*
        ============================================
        9. ENTRADA DE DATOS
        ============================================
    */

    print("Ingrese su nombre: ")

    var nombreUsuario = readln()

    println("Bienvenido $nombreUsuario")


    print("Ingrese un número: ")

    var n1 = readln().toInt()


    print("Ingrese otro número: ")

    var n2 = readln().toInt()


    var suma = n1 + n2


    println("La suma de $n1 y $n2 es: $suma")


    /*
        ============================================
        10. CONVERSIÓN DE DATOS
        ============================================
    */

    var textoNumero = "100"

    var numeroConvertido = textoNumero.toInt()

    println(numeroConvertido)


    /*
        Conversiones comunes:

        toInt()
        toDouble()
        toFloat()
        toString()
    */


    /*
        ============================================
        11. OPERADORES DE COMPARACIÓN
        ============================================
    */

    var x = 10

    var y = 20


    println(x > y)

    println(x < y)

    println(x == y)

    println(x != y)


    /*
        ============================================
        12. OPERADORES LÓGICOS
        ============================================
    */

    var edadPersona = 25

    var tieneDocumento = true


    if (edadPersona >= 18 && tieneDocumento) {

        println("Puede ingresar")

    }


    /*
        ============================================
        13. IF
        ============================================
    */

    var numeroEvaluar = 25


    if (numeroEvaluar > 0) {

        println("POSITIVO")

    }


    /*
        ============================================
        14. IF - ELSE
        ============================================
    */

    var nota = 4.0


    if (nota >= 3.0) {

        println("APROBÓ")

    } else {

        println("REPROBÓ")

    }


    /*
        ============================================
        15. IF - ELSE IF - ELSE
        ============================================
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
        ============================================
        16. WHEN
        ============================================
    */

    var opcion = 2


    when (opcion) {

        1 -> {

            println("Registrar")

        }

        2 -> {

            println("Consultar")

        }

        3 -> {

            println("Modificar")

        }

        4 -> {

            println("Salir")

        }

        else -> {

            println("Opción incorrecta")

        }
    }


    /*
        ============================================
        17. FOR
        ============================================
    */

    println("FOR ASCENDENTE")


    for (i in 1..10) {

        println(i)

    }


    /*
        ============================================
        18. FOR DESCENDENTE
        ============================================
    */

    println("FOR DESCENDENTE")


    for (i in 10 downTo 1) {

        println(i)

    }


    /*
        ============================================
        19. FOR CON STEP
        ============================================
    */

    println("NÚMEROS DE 2 EN 2")


    for (i in 0..20 step 2) {

        println(i)

    }


    /*
        ============================================
        20. WHILE
        ============================================
    */

    var contador = 1


    while (contador <= 5) {

        println(contador)

        contador++

    }


    /*
        ============================================
        21. DO WHILE
        ============================================
    */

    var contador2 = 1


    do {

        println(contador2)

        contador2++

    } while (contador2 <= 5)


    /*
        ============================================
        22. FUNCIONES
        ============================================
    */

    saludar()


    /*
        ============================================
        23. FUNCIÓN CON PARÁMETROS
        ============================================
    */

    saludarPersona("Pedro")


    /*
        ============================================
        24. FUNCIÓN QUE RETORNA UN VALOR
        ============================================
    */

    var resultadoSuma = sumar(
        10,
        5
    )

    println("Resultado: $resultadoSuma")


    /*
        ============================================
        25. FUNCIÓN CON WHEN
        ============================================
    */

    var resultadoOperacion = calcular(
        10.0,
        5.0,
        "+"
    )

    println(
        "Resultado calculadora: $resultadoOperacion"
    )


    /*
        ============================================
        26. LISTAS
        ============================================
    */

    val nombres = mutableListOf<String>()

    nombres.add("Carlos")

    nombres.add("Laura")

    nombres.add("Pedro")


    println("LISTA DE NOMBRES")


    for (nombreLista in nombres) {

        println(nombreLista)

    }


    /*
        ============================================
        27. DATA CLASS
        ============================================

        Una data class sirve para representar
        información y crear objetos.
    */


    val estudiante1 = Estudiante(
        nombre = "Carlos",
        programa = "Ingeniería de Sistemas",
        semestre = 3,
        promedio = 4.2
    )


    val estudiante2 = Estudiante(
        nombre = "Laura",
        programa = "Ingeniería Industrial",
        semestre = 2,
        promedio = 2.8
    )


    /*
        ============================================
        28. ACCEDER A LOS DATOS DEL OBJETO
        ============================================
    */

    println("ESTUDIANTE 1")

    println("Nombre: ${estudiante1.nombre}")

    println("Programa: ${estudiante1.programa}")

    println("Semestre: ${estudiante1.semestre}")

    println("Promedio: ${estudiante1.promedio}")


    /*
        ============================================
        29. USAR OBJETOS EN CONDICIONES
        ============================================
    */

    if (estudiante1.promedio >= 3.0) {

        println("${estudiante1.nombre} APROBÓ")

    } else {

        println("${estudiante1.nombre} REPROBÓ")

    }


    /*
        ============================================
        30. LISTA DE OBJETOS
        ============================================
    */

    val estudiantes = mutableListOf<Estudiante>()


    estudiantes.add(estudiante1)

    estudiantes.add(estudiante2)


    /*
        También podemos crear y agregar
        el objeto directamente.
    */

    estudiantes.add(
        Estudiante(
            nombre = "Ana",
            programa = "Administración",
            semestre = 1,
            promedio = 3.8
        )
    )


    /*
        ============================================
        31. RECORRER LISTA DE OBJETOS
        ============================================
    */

    println()
    println("ESTUDIANTES REGISTRADOS")


    for (estu in estudiantes) {

        println("-------------------------")

        println("Nombre: ${estu.nombre}")

        println("Programa: ${estu.programa}")

        println("Semestre: ${estu.semestre}")

        println("Promedio: ${estu.promedio}")

    }


    /*
        ============================================
        32. CONDICIÓN CON LISTA DE OBJETOS
        ============================================
    */

    println()
    println("ESTADO DE LOS ESTUDIANTES")


    for (estu in estudiantes) {

        if (estu.promedio >= 3.0) {

            println("${estu.nombre}: APROBÓ")

        } else {

            println("${estu.nombre}: REPROBÓ")

        }

    }


    /*
        ============================================
        33. BUSCAR UN OBJETO
        ============================================
    */

    print("Ingrese el nombre del estudiante a buscar: ")

    val nombreBuscar = readln()


    for (estu in estudiantes) {

        if (estu.nombre.equals(
                nombreBuscar,
                ignoreCase = true
            )
        ) {

            println("ESTUDIANTE ENCONTRADO")

            println("Nombre: ${estu.nombre}")

            println("Programa: ${estu.programa}")

            println("Promedio: ${estu.promedio}")

        }

    }

}


/*
    ============================================
    FUNCIONES
    ============================================
*/


fun saludar() {

    println("Hola desde una función")

}


fun saludarPersona(
    nombre: String
) {

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

        "/" -> {

            if (numero2 != 0.0) {

                numero1 / numero2

            } else {

                0.0
            }
        }

        else -> 0.0

    }
}


/*
    ============================================
    DATA CLASS
    ============================================
*/

data class Estudiante(

    val nombre: String,

    val programa: String,

    val semestre: Int,

    val promedio: Double

)