/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.Main;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.vista.PagoWindow;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista pago.
 */
public class ControladorPagoWindow {

    private PagoWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Controlador de la vista pago.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorPagoWindow(PagoWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cierra la ventana de pago.
     */
    public void cancelar() {
        Main.logout();
    }

    /**
     * Abre la ventana de pago completado.
     */
    public void pagar() {
        Main.getLoginStateMachine().completado();
    }

}
