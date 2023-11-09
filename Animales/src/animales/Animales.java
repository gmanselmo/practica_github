package animales;

import Servicio.GatoService;
import Servicio.PerroServicio;

public class Animales {

    public static void main(String[] args) {

        PerroServicio ps = new PerroServicio();
        GatoService gs = new GatoService();

        ps.crearPerro("Missile", 5, false, "Germán M. Anselmo");

        ps.mostrarPerro();

        gs.crearGato("pepito", "4", "Amarillo", "pepitoOwner", true);
        gs.mostrarGato();

    }

}
