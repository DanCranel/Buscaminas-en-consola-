package POO.Examen.buscaminas;

import POO.Examen.buscaminas.controlador.ControladorJuego;
import POO.Examen.buscaminas.vista.VistaConsola;


public class Main {

    public static void main(String[] args) {
    	
        // Vista: se encarga de mostrar información por consola y leer al usuario
        VistaConsola vista = new VistaConsola();
        
        // Controlador: coordina la interacción entre la vista y el modelo
        ControladorJuego controlador = new ControladorJuego(vista);
        controlador.iniciar();
    }
}
