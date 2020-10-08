package cineinterfaz.controlador;

import cineinterfaz.Main;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.vista.CompletadoWindow;
import cineinterfaz.vista.PagoWindow;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista completado.
 */
public class ControladorCompletadoWindow {

    private CompletadoWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Constructor de la vista completado.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorCompletadoWindow(CompletadoWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cambia a la vista home.
     */
    public void aceptar() {
        Main.logout();
    }

}
