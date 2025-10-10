package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.tfg.ControlEscenas;

/**
 * Controlador de la pantalla de inicio del juego.
 * Gestiona las acciones de los botones de la pantalla principal.
 * 
 * @author Jaime
 * @version 1.0
 */
public class PantallaInicioController {

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
     * Navega a la pantalla del juego.
     * Este método es invocado cuando el usuario presiona el botón de jugar.
     * 
     * @param event El evento de acción generado por el botón
     */
    @FXML
    void irAJuego(ActionEvent event) {
        controlEscenas.showGameScreen();
    }

    /**
     * Navega a la pantalla de controles.
     * Este método es invocado cuando el usuario presiona el botón de controles.
     * 
     * @param event El evento de acción generado por el botón
     */
    @FXML
    void irAControles(ActionEvent event) {
        controlEscenas.showControlsScreen();
    }

    /**
     * Cierra la aplicación.
     * Este método es invocado cuando el usuario presiona el botón de salir.
     * 
     * @param event El evento de acción generado por el botón
     */
    @FXML
    void cerrar(ActionEvent event) {
        System.exit(0);
    }

}
