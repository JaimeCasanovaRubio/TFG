package org.example.tfg;

import controller.PantallaControlesController;
import controller.PantallaInicioController;
import controller.PantallaJuegoController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase encargada de gestionar la navegación entre las diferentes pantallas de la aplicación.
 * Controla el cambio de escenas y la configuración de los controladores correspondientes.
 * 
 * @author Jaime
 * @version 1.0
 */
public class ControlEscenas {

    /**
     * Escenario principal de la aplicación donde se muestran las diferentes escenas.
     */
    private Stage primaryStage;

    /**
     * Constructor de la clase ControlEscenas.
     * 
     * @param primaryStage El escenario principal de la aplicación
     */
    public ControlEscenas(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    /**
     * Muestra la pantalla de inicio del juego.
     * Carga el archivo FXML correspondiente y configura el controlador asociado.
     */
    public void showStartScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/pantallaInicioView.fxml"));
            Parent root = loader.load();
            PantallaInicioController controller = loader.getController();
            controller.setControlEscenas(this);
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra la pantalla de controles del juego.
     * Carga el archivo FXML correspondiente y configura el controlador asociado.
     */
    public void showControlsScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/PantallaControles.fxml"));
            Parent root = loader.load();
            PantallaControlesController controller = loader.getController();
            controller.setControlEscenas(this);
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra la pantalla principal del juego.
     * Carga el archivo FXML correspondiente y configura el controlador asociado.
     */
    public void showGameScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/pantallaJuegoView.fxml"));
            Parent root = loader.load();
            PantallaJuegoController controller = loader.getController();
            controller.setControlEscenas(this);
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
