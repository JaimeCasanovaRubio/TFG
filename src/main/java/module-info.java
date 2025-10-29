module org.example.tfg {
    requires javafx.controls;
    requires javafx.fxml;



    opens org.example.tfg to javafx.fxml;
    exports org.example.tfg;
    exports org.example.tfg.controller;
    exports org.example.tfg.npc.listas;
    exports org.example.tfg.npc.modelo;
    opens org.example.tfg.controller to javafx.fxml;
}