package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Movie3Controller extends Movie2Controller {
    @Override
    public void goThreatre1FromMovie1Time1(ActionEvent a) {
        super.goThreatre1FromMovie1Time1(a);
    }

    @Override
    public void goThreatre1FromMovie1Time2(ActionEvent a) {
        super.goThreatre1FromMovie1Time2(a);
    }

    @Override
    public void goThreatre2FromMovie2Time1(ActionEvent a) {
        super.goThreatre2FromMovie2Time1(a);
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
    public void goHomeFromMovie1(ActionEvent a) {
        super.goHomeFromMovie1(a);
    }

    public void goMovieDetail1FromMovie3(ActionEvent a) {

        Button b = (Button) a.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("moviedetail3.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 1020, 573));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
