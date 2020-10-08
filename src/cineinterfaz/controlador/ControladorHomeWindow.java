/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.vista.HomeWindow;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.Main;
import pelicula.Pelicula;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista home.
 */
public class ControladorHomeWindow {

    private HomeWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Constructor del controlador de la vista home.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorHomeWindow(HomeWindow miVista, ModeloCineInterfaz miModelo) {
        this.miVista = miVista;
        this.miModelo = miModelo;
    }

    /**
     * Cambia a la vista proximos.
     */
    public void proximos() {
        Main.getHomeStateMachine().proximos();
    }

    /**
     * Cambia a la vista cartelera.
     */
    public void cartelera() {
        Main.getHomeStateMachine().cartelera();
    }

    /**
     * Cambia a la vista infantil.
     */
    public void infantil() {
        Main.getHomeStateMachine().infantil();
    }

    /**
     * Establece los valores de las pelicula y cambia a la vista pelicula.
     */
    public void pelicula(Pelicula pelicula) {
        miModelo.setPelicula(pelicula);
        Main.getHomeStateMachine().pelicula();
    }

}
