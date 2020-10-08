/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz;

import pelicula.Pelicula;
import cineinterfaz.maquina.*;
import cineinterfaz.vista.*;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Clase main de la interfaz
 */
public class Main {

    private static cineinterfaz.maquina.HomeUIStateMachine homeStateMachine;
    private static cineinterfaz.maquina.LoginUIStateMachine loginStateMachine;
    private static ModeloCineInterfaz modelo;

    /**
     * Crea las peliculas y las maquinas de estados de las vistas.
     *
     * @param args the command line arguments
     *
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Pelicula[] populares = new Pelicula[]{
            new Pelicula("Los Increibles 2", "Sinopsis", 135, "/imagenes/populares/increibles.jpg"),
            new Pelicula("Vengadores: Infinity War", "Sinopsis", 149, "/imagenes/populares/losvengadores.jpg"),
            new Pelicula("La primera purga: la noche de las bestias", "Sinopsis", 140, "/imagenes/populares/purga.jpg"),
            new Pelicula("El Grinch", "Sinopsis", 135, "/imagenes/populares/grinch.jpg"),
            new Pelicula("Animales fantáisticos: Los crímenes de Grindelwald", "Sinopsis", 170, "/imagenes/populares/animalesfan.jpg")
        };

        Pelicula[] cartelera = new Pelicula[]{
            new Pelicula("Los Increibles 2", "Sinopsis", 135, "/imagenes/cartelera/increibles.jpg"),
            new Pelicula("Vengadores: Infinity War", "Sinopsis", 149, "/imagenes/cartelera/losvengadores.jpg"),
            new Pelicula("La primera purga: la noche de las bestias", "Sinopsis", 140, "/imagenes/cartelera/purga.jpg"),
            new Pelicula("El Grinch", "Sinopsis", 135, "/imagenes/cartelera/grinch.jpg"),
            new Pelicula("12 valientes", "Sinopsis", 155, "/imagenes/cartelera/12valientes.jpg"),
            new Pelicula("El buen maestro", "Sinopsis", 106, "/imagenes/cartelera/elbuenmaestro.jpg"),
            new Pelicula("Roman J. Israel, Esq.", "Sinopsis", 180, "/imagenes/cartelera/roman.jpg"),
            new Pelicula("La casa torcida", "Sinopsis", 93, "/imagenes/cartelera/lacasatorcida.jpg"),
            new Pelicula("Animales fantáisticos: Los crímenes de Grindelwald", "Sinopsis", 170, "/imagenes/cartelera/animalesfan.jpg"),
            new Pelicula("Las leyes de la termodinámica", "Sinopsis", 100, "/imagenes/cartelera/lasleyesdelatermodinamica.jpg")
        };

        Pelicula[] proximos = new Pelicula[]{
            new Pelicula("Venom", "Sinopsis", 120, "/imagenes/proximos/venom.jpg"),
            new Pelicula("Slender Man", "Sinopsis", 105, "/imagenes/proximos/slenderman.jpg"),
            new Pelicula("Smallfoot", "Sinopsis", 120, "/imagenes/proximos/smallfoot.jpg"),
            new Pelicula("Oceans'8", "Sinopsis", 130, "/imagenes/proximos/oceans8.jpg")
        };

        Pelicula[] infantil = new Pelicula[]{
            new Pelicula("Los Increibles 2", "Sinopsis", 135, "/imagenes/infantil/increibles.jpg"),
            new Pelicula("Vengadores: Infinity War", "Sinopsis", 149, "/imagenes/infantil/losvengadores.jpg"),
            new Pelicula("El Grinch", "Sinopsis", 135, "/imagenes/infantil/grinch.jpg"),
            new Pelicula("Animales fantásticos: Los crímenes de Grindelwald", "Sinopsis", 170, "/imagenes/infantil/animalesfan.jpg")
        };

        modelo = new ModeloCineInterfaz(populares, cartelera, proximos, infantil);
        homeStateMachine = new cineinterfaz.maquina.HomeUIStateMachine(modelo);

    }

    /**
     * Devuelve la maquina Home.
     *
     * @return homeStateMachine
     */
    public static cineinterfaz.maquina.HomeUIStateMachine getHomeStateMachine() {
        return homeStateMachine;
    }

    /**
     * Devuelve la maquina Login.
     *
     * @return loginStateMachine
     */
    public static cineinterfaz.maquina.LoginUIStateMachine getLoginStateMachine() {
        return loginStateMachine;
    }

    /**
     * Cambia a la maquina login.
     */
    public static void loginSucceed() {
        homeStateMachine.close();
        loginStateMachine = new cineinterfaz.maquina.LoginUIStateMachine(modelo);
    }

    /**
     * Cambia a la maquina Home.
     */
    public static void logout() {
        loginStateMachine.close();
        homeStateMachine = new cineinterfaz.maquina.HomeUIStateMachine(modelo);
    }
}
