package org.example.tfg;

import org.example.tfg.controller.PantallaControlesController;
import org.example.tfg.controller.PantallaInicioController;
import org.example.tfg.controller.PantallaJuegoController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Gestiona la navegación y el cambio de escenas en la interfaz gráfica de la aplicación.
 * <p>
 * Esta clase centraliza la lógica para cargar ficheros FXML, configurar sus controladores
 * y mostrarlos en el escenario principal ({@link Stage}).
 *
 * @author Jaime
 * @version 1.0
 */
public class ControlEscenas {


    /**
     * El {@link Stage} principal de la aplicación JavaFX sobre el cual se montan todas las escenas.
     */
    private Stage escenarioPrincipal;


    /**
     * Construye un nuevo gestor de escenas.
     *
     * @param escenarioPrincipal El {@link Stage} principal proporcionado por la aplicación al iniciarse.
     */
    public ControlEscenas(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }


    /**
     * Carga y muestra la pantalla de inicio.
     * <p>
     * Este método realiza las siguientes acciones:
     * <ol>
     *     <li>Carga el fichero {@code views/pantallaInicioView.fxml}.</li>
     *     <li>Obtiene el controlador {@link PantallaInicioController} asociado.</li>
     *     <li>Inyecta una referencia de este {@code ControlEscenas} en el controlador.</li>
     *     <li>Establece la escena resultante en el escenario principal.</li>
     * </ol>
     */
    public void showStartScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/pantallaInicioView.fxml"));
            Parent root = loader.load();
            PantallaInicioController controller = loader.getController();
            controller.setControlEscenas(this);
            escenarioPrincipal.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga y muestra la pantalla de controles.
     * <p>
     * Este método realiza las siguientes acciones:
     * <ol>
     *     <li>Carga el fichero {@code views/PantallaControles.fxml}.</li>
     *     <li>Obtiene el controlador {@link PantallaControlesController} asociado.</li>
     *     <li>Inyecta una referencia de este {@code ControlEscenas} en el controlador.</li>
     *     <li>Establece la escena resultante en el escenario principal.</li>
     * </ol>
     */
    public void showControlsScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/PantallaControles.fxml"));
            Parent root = loader.load();
            PantallaControlesController controller = loader.getController();
            controller.setControlEscenas(this);
            escenarioPrincipal.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga y muestra la pantalla principal del juego.
     * <p>
     * Este método realiza las siguientes acciones:
     * <ol>
     *     <li>Carga el fichero {@code views/pantallaJuegoView.fxml}.</li>
     *     <li>Obtiene el controlador {@link PantallaJuegoController} asociado.</li>
     *     <li>Inyecta una referencia de este {@code ControlEscenas} en el controlador.</li>
     *     <li>Establece la escena resultante en el escenario principal.</li>
     * </ol>
     */
    public void showGameScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/pantallaJuegoView.fxml"));
            Parent root = loader.load();
            PantallaJuegoController controller = loader.getController();
            controller.setControlEscenas(this);
            escenarioPrincipal.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
