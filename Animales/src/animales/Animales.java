package animales;

import Servicio.PerroServicio;

public class Animales {

    public static void main(String[] args) {

        PerroServicio ps = new PerroServicio();
        
        ps.crearPerro("Missile", 5, false, "Germán M. Anselmo");
        
        ps.mostrarPerro();

    }

}
