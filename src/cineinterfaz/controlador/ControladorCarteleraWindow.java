
package cineinterfaz.controlador;

import cineinterfaz.vista.CarteleraWindow;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.Main;
import pelicula.Pelicula;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 * 
 * Controlador de la vista cartelera.
 */
public class ControladorCarteleraWindow {

    private CarteleraWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Constructor del controlador
     * 
     * @param miVista
     * @param miModelo 
     */
    public ControladorCarteleraWindow(CarteleraWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Abre la vista proximos.
     */
    public void proximos() {
        Main.getHomeStateMachine().proximos();
    }

    /**
     * Abre la vista home.
     */
    public void home() {
        Main.getHomeStateMachine().home();
    }

    /**
     * Abre la vista infantil.
     */
    public void infantil() {
        Main.getHomeStateMachine().infantil();
    }

    /**
     * Establece la pelicula y abre la vista pelicula.
     * @param pelicula 
     */
    public void pelicula(Pelicula pelicula) {
        miModelo.setPelicula(pelicula);
        Main.getHomeStateMachine().pelicula();
    }

}
