package Servicio;

import Entidades.Gato;

public class GatoService {

    private Gato gato;

    public GatoService() {
        this.gato = new Gato();
    }

    public void crearGato(String nombre, String edad, String color, String responsable, boolean adoptado) {
        gato.setNombre(nombre);
        gato.setEdad(edad);
        gato.setColor(color);
        gato.setNombreResponsable(responsable);
        gato.setEsAdoptado(adoptado);

    }

    public void mostrarGato() {
        System.out.println(gato.toString());
    }

}
