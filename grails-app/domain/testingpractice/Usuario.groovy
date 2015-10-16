package testingpractice

class Usuario {

    String nombre
    String apellido
    int edad
    String genero
    long cedula


    static constraints = {
        nombre size: 3..47, blank: false, nullable: false
        apellido size: 5..50, blank: false, nullable: false
        edad min: 17, blank: false
        genero maxSize: 1, validator: { it == "K" || it == "F" }, blank: false, nullable: false
        cedula unique: true, blank: false
    }

    String toString() {
        return nombre + " " + apellido
    }
}
