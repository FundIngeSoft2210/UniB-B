package com.example.pontimotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Objects;
import java.util.ResourceBundle;

public class InicioController implements Initializable {
    public Button butonPrueba;
    public VBox Items;
    public HBox Resultado;
    public HBox hbox;
    public ImageView Imagen;
    public Label Room2;
    public Button InsertarHabitación;
    public AnchorPane Principal;
    public Button InsertRoom;
    @FXML
    Pane secPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Items.setVisible(false);
       /* File file = new File("/Users/kevin/IdeaProjects/PontiMotel/src/main/resources/com/example/pontimotel/Imagenes/Vista.jpg");
        Image image = new Image(file.toURI().toString());
        Imagen.setImage(image);*/

        AnchorPane pane = null;
        for(int i = 0 ; i<5;i++) {
            try {
                pane = FXMLLoader.load(getClass().getResource("ItemReserva.fxml"));

                Items.getChildren().add(pane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void History(ActionEvent event) {
    }

    public void eventHelp(ActionEvent event) {

    }

    public void SingOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.   load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ReserveRoom(ActionEvent event) {
    }

    public void Items(MouseEvent mouseEvent) {
    }
    

    public void eventBotonPrueba(ActionEvent event) throws IOException {
        Items.setVisible(true);
        Room2.setVisible(true);
        Imagen.setOpacity(0.04);
    }

    public void UpdateAccount(ActionEvent event) {
    }

    public void Resultado(MouseEvent mouseEvent) {
    }


    public void InsertRoom(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("InsertHabitacion.fxml"));
        Principal.getChildren().setAll(pane);
    }
}
