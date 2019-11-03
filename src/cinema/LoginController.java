package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.ResourceBundle;

public class LoginController  implements Initializable {

    @FXML
    Pane blackground;

    @FXML
    Button button, signIn, signUp;

    @FXML
    Label username, password, text;

    @FXML
    TextField usernameLogin;

    @FXML
    PasswordField passwordLogin;








    private String filename = "account.csv";


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void ButtonOnClick(ActionEvent event){
        blackground.styleProperty().set("-fx-background-color: white");
        signIn.setText("เข้าสู่ระบบ");
        signUp.setText("สมัครบัญชี");
        username.setText("ชื่อผู้ใช้");
        password.setText("รหัสผ่าน");
        text.setText("ใหม่สำหรับ Nutflix ใช่ไหม ลองดูสิ");
        username.styleProperty().set("-fx-font-family: Verdana");
        button.setVisible(false);

    }

    public boolean veridate() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if (br != null) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] data = str.split(",");


                if (usernameLogin.getText().equals(data[3]) || passwordLogin.getText().equals(data[4])) {
                   return false;

                }

            }}
    return true;}



    public void goHomeFromLogin(ActionEvent a) throws IOException {
        if (!veridate()){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if (br != null) {
            String str;
            while ((str = br.readLine()) != null) {
                String[] data = str.split(",");


                if (!usernameLogin.getText().equals(data[3]) && passwordLogin.getText().equals(data[4])) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Cannot Sign in");

                    alert.setHeaderText("Sorry, we can't find an account with this\nusername. Please try again or create a\nnew account.");
                    alert.setContentText("Please enter a valid username or password.");
                    Optional<ButtonType> result = alert.showAndWait();

                    break;
                } else if (usernameLogin.getText().equals(data[3]) && !passwordLogin.getText().equals(data[4])) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Cannot Sign in");
                    alert.setHeaderText("Sorry, we can't find an account with this\npassword. Please try again or create a\nnew account.");
                    alert.setContentText("Please enter a valid username or password.");
                    Optional<ButtonType> result = alert.showAndWait();

                    break;


                } else if (usernameLogin.getText().equals(data[3]) && passwordLogin.getText().equals(data[4])) {
                    signIn = (Button) a.getSource();
                    Stage stage = (Stage) signIn.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));

                    try {
                        stage.setScene(new Scene(loader.load(), 1020, 573));
                        HomePageController homePageController = loader.getController();
                        homePageController.userInformation(usernameLogin.getText());
                        stage.centerOnScreen();
                        stage.show();

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }


            } }}else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cannot Sign in");
            alert.setHeaderText("Sorry, we can't find an account with this\nusername or password. Please try again or create a\nnew account.");
            alert.setContentText("Please enter a valid username or password.");
            Optional<ButtonType> result = alert.showAndWait();
        }
    }


            public void goRegister (ActionEvent a){

                Button b = (Button) a.getSource();

                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));

                try {
                    stage.setScene(new Scene(loader.load(), 1020, 573));
                    stage.centerOnScreen();
                    stage.show();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }


        }
