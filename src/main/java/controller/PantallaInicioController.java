package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PantallaInicioController {

    @FXML
    private Button btnCerrar;

    @FXML
    void cerrar(ActionEvent event) {
        System.exit(0);
    }

}
