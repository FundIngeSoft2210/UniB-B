module com.example.unibnb2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Controller to javafx.fxml;
    exports Controller;
}