package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieDetail3Controller extends MovieDetail2Controller {

    @Override
    public void goHomeFromMovieDetail1(ActionEvent a) {
        super.goHomeFromMovieDetail1(a);
    }

    public void goBackFromMovieDetail3(ActionEvent a) {

        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie3.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 700, 634));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
