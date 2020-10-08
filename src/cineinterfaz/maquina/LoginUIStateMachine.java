/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineinterfaz.maquina;

import cineinterfaz.vista.CompraWindow;
import cineinterfaz.vista.ModeloCineInterfaz;
import cineinterfaz.vista.CompletadoWindow;
import cineinterfaz.vista.PagoWindow;
import javax.swing.JFrame;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Maquina de estados del pago de las entradas.
 */
public class LoginUIStateMachine {

    private JFrame currentState;
    private ModeloCineInterfaz modelo;

    public LoginUIStateMachine(ModeloCineInterfaz modelo) {
        this.modelo = modelo;
        start();
    }

    /**
     * Inicio de la máquina, activa la vista Compra.
     */
    public void start() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new CompraWindow(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Cierra la vista actual.
     */
    public void close() {
        currentState.dispose();
    }

    /**
     * Inicia la vista pagar.
     */
    public void pagar() {
        currentState.dispose();

        currentState = new PagoWindow(modelo);
        currentState.setVisible(true);

    }
    
    /**
     * Inicia la vista completado.
     */
    public void completado() {
        currentState.dispose();

        currentState = new CompletadoWindow(modelo);
        currentState.setVisible(true);
    }

}
