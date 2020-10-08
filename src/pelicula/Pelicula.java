/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

/**
 *
 * @author andres
 *
 */
public class Pelicula {

    private String titulo;
    private String sinopsis;
    private int duracion;
    private String cartel;

    public Pelicula(String titulo, String sinopsis, int duracion, String cartel) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.cartel = cartel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCartel() {
        return cartel;
    }
}
