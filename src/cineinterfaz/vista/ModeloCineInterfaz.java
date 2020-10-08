/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.vista;

import pelicula.Pelicula;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Modelo de la interfaz.
 */
public class ModeloCineInterfaz {

    private Pelicula[] populares;
    private Pelicula[] cartelera;
    private Pelicula[] proximos;
    private Pelicula[] infantil;
    private Pelicula pelicula;
    private String dia;
    private String hora;
    private int nEntradas;
    private boolean login;
    private int precio;

    public ModeloCineInterfaz(Pelicula[] populares, Pelicula[] cartelera, Pelicula[] proximos, Pelicula[] infantil) {
        this.populares = populares;
        this.cartelera = cartelera;
        this.proximos = proximos;
        this.infantil = infantil;
        this.precio = 6;
    }

    /**
     * GETTERS**
     */
    public Pelicula[] getPopulares() {
        return populares;
    }

    public Pelicula[] getCartelera() {
        return cartelera;
    }

    public Pelicula[] getProximos() {
        return proximos;
    }

    public Pelicula[] getInfantil() {
        return infantil;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public int getNEntradas() {
        return nEntradas;
    }

    public boolean getLogin() {
        return login;
    }

    public int getPrecio() {
        return precio;
    }

    /**
     * SETTERS**
     */
    public void setPopulares(Pelicula[] populares) {
        this.populares = populares;
    }

    public void setCartelera(Pelicula[] cartelera) {
        this.cartelera = cartelera;
    }

    public void setProximos(Pelicula[] proximos) {
        this.proximos = proximos;
    }

    public void setInfantil(Pelicula[] infantil) {
        this.infantil = infantil;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNEntradas(int nEntradas) {
        this.nEntradas = nEntradas;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
