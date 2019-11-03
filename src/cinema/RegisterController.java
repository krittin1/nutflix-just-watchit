package cinema;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class RegisterController {


    @FXML
    TextField firstname, lastname, email, username;

    @FXML
    PasswordField password;

    @FXML
    Button confirmBtn, cancelBtn;




    private static String filename = "account.csv";

    List<Account> userAccounts = new ArrayList<>();
    List<Account> members = new ArrayList<>();

    public void initialize(){

        File file = new File("account.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //start();


    }

//    public void start(){
//        try {
//            loadData();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
    public void loadData() throws IOException {

        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try {
            while ((input = br.readLine()) != null) {
                String[] itemPieces = input.split(",");

                String firstnameFile = itemPieces[0];
                String lastnameFile = itemPieces[1];
                String emailFile = itemPieces[2];
                String usernameFile = itemPieces[3];
                String passwordFile= itemPieces[4];



                // todo : using file system to save data.
                /*
                 */
                Account member = new Account(firstnameFile, lastnameFile, emailFile, usernameFile,passwordFile);
                members.add(member);
            }
        }finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public boolean isNotMember(){

        try {
            loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Account i : members){
            if (email.getText().equals(i.getEmail())
            || username.getText().equals(i.getUsername())
            || password.getText().equals(i.getPassword())){
                return false;
            }




        }
        return true;
    }

    public boolean haveEmail(){
        try {
            loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Account i : members){
            if (email.getText().equals(i.getEmail()))
                   {
                return true;
            }
        }
        return false;
    }

    public boolean haveUsername(){
        try {
            loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Account i : members){
            if (username.getText().equals(i.getUsername()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean havePassword(){
        try {
            loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Account i : members){
            if (password.getText().equals(i.getPassword()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean veridate(){
       if (firstname.getText().isEmpty() ||
                lastname.getText().isEmpty() ||
                email.getText().isEmpty() ||
                username.getText().isEmpty() ||
                password.getText().isEmpty()){
           return true;
       }
       return false;
    }






        public void addData() throws IOException {


        if (isNotMember() && (!firstname.getText().isEmpty() &&
                        !lastname.getText().isEmpty() &&
                        !email.getText().isEmpty() &&
                        !username.getText().isEmpty() &&
                        !password.getText().isEmpty()
        )) {


            Path path = Paths.get(filename);
            FileWriter fileWriter;
            fileWriter = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            try {

                Iterator<Account> iter = userAccounts.iterator();

                bw.write(String.format("%s,%s,%s,%s,%s",
                        firstname.getText(),
                        lastname.getText(),
                        email.getText(),
                        username.getText(),
                        password.getText()));
                bw.newLine();

            } finally {
                if (bw != null) {

                    bw.close();
                }
            }
        }

    }




    public void ConfirmBtn(ActionEvent a) {

        if (haveEmail()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cannot Sign up");
            alert.setHeaderText("This Email have already");
            alert.setContentText("Please try another email");
            Optional<ButtonType> result = alert.showAndWait();

        }
        else if (haveUsername()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cannot Sign up");
            alert.setHeaderText("This Username have already");
            alert.setContentText("Please try another username");
            Optional<ButtonType> result = alert.showAndWait();

        }
        else if(havePassword()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Cannot Sign up");
            alert.setHeaderText("This Password have already");
            alert.setContentText("Please try another password");
            Optional<ButtonType> result = alert.showAndWait();

        }else if (veridate()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cannot Sign up");
            alert.setHeaderText("This field is required.");
            alert.setContentText("Please enter every valid fields");
            Optional<ButtonType> result = alert.showAndWait();

        }

        else if (isNotMember()) {
            try {
                addData();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    }

    public void goLogin(ActionEvent a) {
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

    public void CancelBtn(){

        firstname.setText("");
        lastname.setText("");
        email.setText("");
        username.setText("");
        password.setText("");
    }


}
