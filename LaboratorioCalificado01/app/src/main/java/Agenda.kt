
class Agenda {
    private val listaContactos = mutableListOf<Contacto>()

    // Método para agregar un nuevo contacto a la lista
    fun agregarContacto(contacto: Contacto) {
        listaContactos.add(contacto)
    }

    // Método para mostrar la lista de contactos existentes
    fun mostrarContactos() {
        if (listaContactos.isEmpty()) {
            println("La agenda está vacía.")
        } else {
            println("Lista de contactos:")
            listaContactos.forEach {
                println("Nombre: ${it.nombre}, Teléfono: ${it.telefono}, Email: ${it.email}")
            }
        }
    }

    // Método para buscar un contacto por email
    fun buscarContactoEmail(email: String): Contacto? {
        return listaContactos.find { it.email == email }
    }

    // Método para buscar un contacto por teléfono
    fun buscarContactoTelefono(telefono: String): Contacto? {
        return listaContactos.find { it.telefono == telefono }
    }
}

