package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Movie2Controller extends Movie1Controller {




    public void goThreatre2FromMovie2Time1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre2.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre2FromMovie2Time2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre2.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre2FromMovie2Time3(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre2.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }




    public void goThreatre4FromMovie2Time1(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre4.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void goThreatre4FromMovie2Time2(ActionEvent a) {
        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("threatre4.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }




    public void goMovieDetail1FromMovie2(ActionEvent a) {

        Button b = (Button) a.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("moviedetail2.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 600, 665));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void goHomeFromMovie1(ActionEvent a) {
        super.goHomeFromMovie1(a);
    }


    @Override
    public void goThreatre3FromMovie1Time1(ActionEvent a) {
        super.goThreatre3FromMovie1Time1(a);


    }


    @Override
    public void goThreatre3FromMovie1Time2(ActionEvent a) {
        super.goThreatre3FromMovie1Time2(a);
    }


    @Override
    public void goThreatre3FromMovie1Time3(ActionEvent a) {
        super.goThreatre3FromMovie1Time3(a);
    }
}
