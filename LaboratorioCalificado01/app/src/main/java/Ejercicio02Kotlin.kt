

class Ejercicio02Kotlin {
    fun main() {
        // Crear una lista de empleados de ejemplo
        val empleados = listOf(
            Empleado("Juan", 25, 2000.0),
            Empleado("María", 35, 2500.0),
            Empleado("Pedro", 28, 2200.0)
        )

        // Recorrer la lista de empleados y mostrar sus detalles y salario total
        println("Detalles de empleados:")
        empleados.forEach { empleado ->
            val salarioTotal = empleado.calcularSalarioTotal()
            println("Nombre: ${empleado.nombre}, Edad: ${empleado.edad}, Salario Total: $salarioTotal")
        }
    }
}


