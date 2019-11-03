package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MovieDetail2Controller extends MovieDetail1Controller implements Initializable {

    @FXML
    private MediaView media;

    private static final String MEDIA_URL = "Weathering.mp4";
    private MediaPlayer mediaPlayer;

    @Override
    public void goHomeFromMovieDetail1(ActionEvent a) {
        super.goHomeFromMovieDetail1(a);
    }


    public void goBackFromMovieDetail2(ActionEvent a) {

        Button b = (Button) a.getSource();

        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("movie2.fxml"));
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
        System.out.println(location.toString());
        System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());

        MediaPlayer mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        media.setMediaPlayer(mediaPlayer);
    }
}
