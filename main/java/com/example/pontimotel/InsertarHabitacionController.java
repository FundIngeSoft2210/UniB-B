package com.example.pontimotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.ResourceBundle;

public class InsertarHabitacionController implements Initializable {
    public Button SingOut;
    public Button iHistory;
    public Button AddRoom;
    public ImageView Imagen11;
    public Label lbl1;
    public Label lbl2;
    public Button AddBtn;
    public AnchorPane Principal;
    public Label Lbl3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    int i = 0  ;
    System.out.println("holas");

    }

    public void UpdateAccount(ActionEvent event) {
    }

    public void ReserveRoom(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void History(ActionEvent event) {
    }

    public void eventHelp(ActionEvent event) {
    }

    public void SingOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void AddRoom(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InsertarHabiacion2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void HnadleDragOver(DragEvent dragEvent) {
        if(dragEvent.getDragboard().hasFiles()) {
            dragEvent.acceptTransferModes(TransferMode.ANY);
        }
    }

    public void HandleDrop(DragEvent dragEvent) throws FileNotFoundException {
       List<File> files=  dragEvent.getDragboard().getFiles();
        Image img = new Image(new FileInputStream(files.get(0)));
        Imagen11.setImage(img);
        Imagen11.maxHeight(229);
        Imagen11.maxWidth(285);
        lbl2.setVisible(false);
        lbl1.setVisible(false);


    }
    public void AddBtn(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("InsertarHabiacion2.fxml"));
        Principal.getChildren().setAll(pane);
    }
}
