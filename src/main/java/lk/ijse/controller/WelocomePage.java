package lk.ijse.controller;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class WelocomePage  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text W;

    @FXML
    private Text foodcourt;

    @FXML
    private ImageView loading;

    @FXML
    private ImageView loadingpic;

    @FXML
    private Text loadingtxt;

    @FXML
    private AnchorPane pane2;

    @FXML
    private Rectangle rec;

    @FXML
    private Rectangle rec2;

    @FXML
    private ImageView welcomePage;


    @FXML
    void initialize() {
        assert W != null : "fx:id=\"W\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert foodcourt != null : "fx:id=\"foodcourt\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert loading != null : "fx:id=\"loading\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert loadingpic != null : "fx:id=\"loadingpic\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert loadingtxt != null : "fx:id=\"loadingtxt\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert pane2 != null : "fx:id=\"pane2\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert rec != null : "fx:id=\"rec\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert rec2 != null : "fx:id=\"rec2\" was not injected: check your FXML file 'welocomePage.fxml'.";
        assert welcomePage != null : "fx:id=\"welcomePage\" was not injected: check your FXML file 'welocomePage.fxml'.";

    }

    public void WelocomeOnAction(KeyEvent keyEvent) throws IOException {
         




        /*Duration duration = Duration.seconds(1.5);
        Timeline timeline = new Timeline(new KeyFrame(duration, event -> {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                // stage.setMaximized(true);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
        timeline.play();*/

    }


}
