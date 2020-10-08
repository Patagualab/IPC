/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.vista.ProximosWindow;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.Main;
import pelicula.Pelicula;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista proximos.
 */
public class ControladorProximosWindow {

    private ProximosWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Constructor del controlador de la vista proximos.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorProximosWindow(ProximosWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cambia a la vista cartelera.
     */
    public void cartelera() {
        Main.getHomeStateMachine().cartelera();
    }

    /**
     * Cambia a la vista home.
     */
    public void home() {
        Main.getHomeStateMachine().home();
    }

    /**
     * Cambia a la vista infantil.
     */
    public void infantil() {
        Main.getHomeStateMachine().infantil();
    }

    /**
     * Establece los valores de la pelicula y cambia a la vista pelicula.
     *
     * @param pelicula
     */
    public void pelicula(Pelicula pelicula) {
        miModelo.setPelicula(pelicula);
        Main.getHomeStateMachine().pelicula();
    }
}
