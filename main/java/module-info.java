module com.example.pontimotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pontimotel to javafx.fxml;
    exports com.example.pontimotel;
}