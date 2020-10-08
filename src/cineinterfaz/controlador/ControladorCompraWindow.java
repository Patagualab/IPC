/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.vista.CompraWindow;
import cineinterfaz.Main;
import cineinterfaz.vista.ModeloCineInterfaz;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista compra.
 */
public class ControladorCompraWindow {

    private CompraWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Clase controlador de la vista compra.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorCompraWindow(CompraWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cambia a la vista home.
     */
    public void home() {
        Main.logout();
    }

    /**
     * Cambia a la vista cartelera.
     */
    public void cartelera() {
        Main.logout();
    }

    /**
     * Cambia a la vista proximos.
     */
    public void proximos() {
        Main.logout();
    }

    /**
     * Cambia a la vista infantil.
     */
    public void infantil() {
        Main.logout();
    }

    /**
     * Cambia a la vista pagar.
     */
    public void pagar() {
        Main.getLoginStateMachine().pagar();
    }

}
