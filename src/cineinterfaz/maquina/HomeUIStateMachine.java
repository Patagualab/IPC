package cineinterfaz.maquina;

import cineinterfaz.vista.*;
import javax.swing.JFrame;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Maquina de estados de Home.
 */
public class HomeUIStateMachine {

    private JFrame currentState;
    private ModeloCineInterfaz modelo;

    /**
     * Constructor de la maquina de estados.
     *
     * @param modelo
     */
    public HomeUIStateMachine(ModeloCineInterfaz modelo) {
        this.modelo = modelo;
        start();
    }

    /**
     * Método de inicio de la máquina de estados, inicia en la vista Home.
     *
     */
    public void start() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new HomeWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista home de la maquina.
     */
    public void home() {
        currentState.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new HomeWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista cartelera de la máquina.
     */
    public void cartelera() {
        currentState.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new CarteleraWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista próximos de la máquina.
     */
    public void proximos() {
        currentState.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new ProximosWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista infantil de la máquina.
     */
    public void infantil() {
        currentState.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InfantilWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista película de la máquina.
     */
    public void pelicula() {
        currentState.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new PeliculaWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Inicia la vista login de la máquina.
     */
    public void login() {
        currentState.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new LoginWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Cierra las vista actual.
     */
    public void close() {
        currentState.dispose();
    }

}
