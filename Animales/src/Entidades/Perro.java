package Entidades;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Perro {
    
    private String nombre;
    private int edad;
    private boolean castrado;
    private String nombreDuenio;

    public Perro() {
    }

    public Perro(String nombre, int edad, boolean castrado, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.castrado = castrado;
        this.nombreDuenio = nombreDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", castrado=" + castrado + ", nombreDuenio=" + nombreDuenio + '}';
    }
    
}
