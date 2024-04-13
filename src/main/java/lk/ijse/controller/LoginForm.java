package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView FB;

    @FXML
    private Text ForgotPW;

    @FXML
    private ImageView GOOGLE;

    @FXML
    private Text OR;

    @FXML
    private Text ResaurentName;

    @FXML
    private ImageView eye;

    @FXML
    private Button login;

    @FXML
    private ImageView loginPageGreen;

    @FXML
    private ImageView loginPagePic;

    @FXML
    private AnchorPane pane;

    @FXML
    private Text password;

    @FXML
    private TextField txtpw;

    @FXML
    private TextField txtun;

    @FXML
    private Text username;

    @FXML
    void loginOnAction(ActionEvent event) throws IOException {
        String username = "admin";
        String password = "1234";

        if (txtun.getText().equals(username) && txtpw.getText().equals(password)) {
            Object parent = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
            Scene scene = new Scene((Parent) parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("DashBoard");
            stage.show();
            Stage stage1 = (Stage) txtun.getScene().getWindow();
            stage1.close();
        }
        else if(txtun.getText()!=(username)){
            new Alert(Alert.AlertType.INFORMATION, "sorry! user id can't be find!").show();
        }
        else if(txtpw.getText()!=(password)) {
            new Alert(Alert.AlertType.INFORMATION, "sorry! user password can't be find!").show();
        }

    }

    @FXML
    void initialize() {
        assert FB != null : "fx:id=\"FB\" was not injected: check your FXML file 'Login.fxml'.";
        assert ForgotPW != null : "fx:id=\"ForgotPW\" was not injected: check your FXML file 'Login.fxml'.";
        assert GOOGLE != null : "fx:id=\"GOOGLE\" was not injected: check your FXML file 'Login.fxml'.";
        assert OR != null : "fx:id=\"OR\" was not injected: check your FXML file 'Login.fxml'.";
        assert ResaurentName != null : "fx:id=\"ResaurentName\" was not injected: check your FXML file 'Login.fxml'.";
        assert eye != null : "fx:id=\"eye\" was not injected: check your FXML file 'Login.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Login.fxml'.";
        assert loginPageGreen != null : "fx:id=\"loginPageGreen\" was not injected: check your FXML file 'Login.fxml'.";
        assert loginPagePic != null : "fx:id=\"loginPagePic\" was not injected: check your FXML file 'Login.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'Login.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtpw != null : "fx:id=\"txtpw\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtun != null : "fx:id=\"txtun\" was not injected: check your FXML file 'Login.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'Login.fxml'.";

    }

}
