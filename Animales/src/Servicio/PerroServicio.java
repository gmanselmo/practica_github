package Servicio;

import Entidades.Perro;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PerroServicio {

    Perro perro = new Perro();
    
    public void crearPerro(String nombre, int edad, boolean isCastrado, String nombreDuenio) {
        
        perro.setNombre(nombre);
        
        perro.setEdad(edad);
        
        perro.setCastrado(isCastrado);
        
        perro.setNombreDuenio(nombreDuenio);
        
    }
    
    public void mostrarPerro() {
        
        System.out.println(perro);
        
    }

}
