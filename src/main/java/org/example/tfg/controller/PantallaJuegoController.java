package org.example.tfg.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.tfg.ControlEscenas;

/**
 * Controlador de la pantalla principal del juego.
 * Gestiona la lógica del juego y la navegación de regreso al menú principal.
 * 
 * @author Jaime
 * @version 1.0
 */
public class PantallaJuegoController {

    /**
     * Referencia al controlador de escenas para la navegación entre pantallas.
     */
    private ControlEscenas controlEscenas;

    /**
     * Establece el controlador de escenas para permitir la navegación.
     * 
     * @param controlEscenas El controlador de escenas a asociar
     */
    public void setControlEscenas(ControlEscenas controlEscenas) {
        this.controlEscenas = controlEscenas;
    }

    /**
     * Navega de regreso a la pantalla de inicio.
     * Este método es invocado cuando el usuario presiona el botón de volver al menú.
     * 
     * @param event El evento de acción generado por el botón
     */
    @FXML
    void volverAlMenu(ActionEvent event) {
        controlEscenas.showStartScreen();
    }

}
