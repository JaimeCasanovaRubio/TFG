module org.example.tfg {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tfg to javafx.fxml;
    exports org.example.tfg;
    exports controller;
    opens controller to javafx.fxml;
}