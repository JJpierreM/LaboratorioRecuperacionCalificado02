
class Ejercicio01Kotlin {
    fun main() {


        // Crear una instancia de Contacto
        val contacto1 = Contacto("Juan", "123456789", "juan@example.com")
        // Imprimir información del contacto creado
        println("Nombre: ${contacto1.nombre}, Teléfono: ${contacto1.telefono}, Email: ${contacto1.email}")


        // Crear una instancia de Agenda
        val agenda = Agenda()

        // Agregar algunos contactos de ejemplo
        agenda.agregarContacto(Contacto("Juan", "123456789", "juan@example.com"))
        agenda.agregarContacto(Contacto("María", "987654321", "maria@example.com"))

        // Mostrar la lista de contactos
        agenda.mostrarContactos()

        // Buscar un contacto por email
        val contactoEncontradoEmail = agenda.buscarContactoEmail("maria@example.com")
        if (contactoEncontradoEmail != null) {
            println("Contacto encontrado por email: ${contactoEncontradoEmail.nombre}")
        } else {
            println("No se encontró ningún contacto con ese email.")
        }

        // Buscar un contacto por teléfono
        val contactoEncontradoTelefono = agenda.buscarContactoTelefono("123456789")
        if (contactoEncontradoTelefono != null) {
            println("Contacto encontrado por teléfono: ${contactoEncontradoTelefono.nombre}")
        } else {
            println("No se encontró ningún contacto con ese teléfono.")
        }
    }
}