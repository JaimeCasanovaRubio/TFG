package org.example.tfg;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Inicializa la ventana principal y configura el controlador de escenas.
 * 
 * @author Jaime
 * @version 1.0
 */
public class Main extends Application {
    
    /**
     * Método de inicio de la aplicación JavaFX.
     * Configura el título de la ventana, inicializa el controlador de escenas
     * y muestra la pantalla de inicio.
     * 
     * @param stage El escenario principal de la aplicación
     * @throws IOException Si hay un error al cargar las vistas FXML
     */
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Juego de TFG");

        ControlEscenas controlEscenas = new ControlEscenas(stage);
        controlEscenas.showStartScreen();

        stage.show();
    }
}
