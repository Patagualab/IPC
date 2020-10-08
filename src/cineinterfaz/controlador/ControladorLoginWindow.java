/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.Main;
import cineinterfaz.vista.LoginWindow;
import cineinterfaz.vista.ModeloCineInterfaz;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista login.
 */
public class ControladorLoginWindow {

    private LoginWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Constructor del controlador de la vista login.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorLoginWindow(LoginWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cambia a la vista home.
     */
    public void home() {
        Main.getHomeStateMachine().home();
    }

    /**
     * Cambia a la vista cartelera.
     */
    public void cartelera() {
        Main.getHomeStateMachine().cartelera();
    }

    /**
     * Cambia a la vista proximos.
     */
    public void proximos() {
        Main.getHomeStateMachine().proximos();
    }

    /**
     * Cambia a la vista infantil.
     */
    public void infantil() {
        Main.getHomeStateMachine().infantil();
    }

    /**
     * Cambia a la vista login.
     */
    public void login() {
        miModelo.setLogin(true);
        Main.loginSucceed();
    }

}
