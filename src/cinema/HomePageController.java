package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    public void goMovie1(ActionEvent a){
        Button b = (Button)a.getSource();

        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 700, 634));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void goMovie2(ActionEvent a){
        Button b = (Button)a.getSource();

        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie2.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 700, 634));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }



    public void goMovie3(ActionEvent a){
        Button b = (Button)a.getSource();

        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie3.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 700, 634));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }



    public void goContact(ActionEvent a){
        Button b = (Button)a.getSource();

        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("contact.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 604, 427));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }





}
