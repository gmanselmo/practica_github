package Entidades;

/**
 *
 * @author Erick Rodriguez
 */
public class Gato {

    private String nombre;
    private String edad;
    private String color;
    private String nombreResponsable;
    private boolean esAdoptado;

    public Gato() {
    }

    public Gato(String nombre, String edad, String color, String nombreResponsable, boolean esAdoptado) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.nombreResponsable = nombreResponsable;
        this.esAdoptado = esAdoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public boolean isEsAdoptado() {
        return esAdoptado;
    }

    public void setEsAdoptado(boolean esAdoptado) {
        this.esAdoptado = esAdoptado;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", nombreResponsable=" + nombreResponsable + ", esAdoptado=" + esAdoptado + '}';
    }

}
