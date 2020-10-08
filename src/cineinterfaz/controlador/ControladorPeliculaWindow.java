/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.controlador;

import cineinterfaz.Main;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.vista.PeliculaWindow;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase controlador de la vista pelicula.
 */
public class ControladorPeliculaWindow {

    private PeliculaWindow miVista;
    private ModeloCineInterfaz miModelo;

    /**
     * Controlador de la vista pelicula.
     *
     * @param miVista
     * @param miModelo
     */
    public ControladorPeliculaWindow(PeliculaWindow miVista, ModeloCineInterfaz miModelo) {
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
     * Establece la informacion elegida en la vista.
     *
     * @param dia
     * @param hora
     * @param nEntradas
     */
    public void hora1(String dia, String hora, int nEntradas) {
        miModelo.setDia(dia);
        miModelo.setHora(hora);
        miModelo.setNEntradas(nEntradas);
        Main.getHomeStateMachine().login();
    }

    /**
     * Establece la informacion elegida en la vista.
     *
     * @param dia
     * @param hora
     * @param nEntradas
     */
    public void hora2(String dia, String hora, int nEntradas) {
        miModelo.setDia(dia);
        miModelo.setHora(hora);
        miModelo.setNEntradas(nEntradas);
        Main.getHomeStateMachine().login();
    }

    /**
     * Establece la informacion elegida en la vista.
     *
     * @param dia
     * @param hora
     * @param nEntradas
     */
    public void hora3(String dia, String hora, int nEntradas) {
        miModelo.setDia(dia);
        miModelo.setHora(hora);
        miModelo.setNEntradas(nEntradas);
        Main.getHomeStateMachine().login();
    }
}
