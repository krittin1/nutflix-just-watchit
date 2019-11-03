package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

    @FXML
    Label userInfo;






    public void goMovie1(ActionEvent a){
        Button b = (Button)a.getSource();

        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
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
            stage.setScene(new Scene(loader.load(), 1020, 573));
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
            stage.setScene(new Scene(loader.load(), 1020, 573));
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
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void LogOut(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void userInformation(String text){
        userInfo.setText(text);
    }
}
