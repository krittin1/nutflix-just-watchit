package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Movie1Controller {

    public void goHomeFromMovie1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void goThreatre5FromMovie1Time1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre5.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre5FromMovie1Time2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre5.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre5FromMovie1Time3(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre5.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void goThreatre3FromMovie1Time1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre3.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre3FromMovie1Time2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre3.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre3FromMovie1Time3(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre3.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre1FromMovie1Time1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre1FromMovie1Time2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre1FromMovie1Time3(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void goMovieDetail1FromMovie1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("moviedetail1.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
