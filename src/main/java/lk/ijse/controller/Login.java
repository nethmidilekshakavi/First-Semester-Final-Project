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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView FB;

    @FXML
    private Text FOODCOURT;

    @FXML
    private Text ForgotPW;

    @FXML
    private ImageView GOOGLE;

    @FXML
    private ImageView Insterpic;

    @FXML
    private Text OR;

    @FXML
    private Text TO;

    @FXML
    private ImageView eye1;

    @FXML
    private Button login;

    @FXML
    private ImageView loginphoto;

    @FXML
    private AnchorPane pane;

    @FXML
    private AnchorPane pane2;

    @FXML
    private Text password;

    @FXML
    private PasswordField txtpw;

    @FXML
    private TextField txtun;

    @FXML
    private Text username;

    @FXML
    private ImageView userpic;

    @FXML
    private Text welcome;

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
        assert FOODCOURT != null : "fx:id=\"FOODCOURT\" was not injected: check your FXML file 'Login.fxml'.";
        assert ForgotPW != null : "fx:id=\"ForgotPW\" was not injected: check your FXML file 'Login.fxml'.";
        assert GOOGLE != null : "fx:id=\"GOOGLE\" was not injected: check your FXML file 'Login.fxml'.";
        assert Insterpic != null : "fx:id=\"Insterpic\" was not injected: check your FXML file 'Login.fxml'.";
        assert OR != null : "fx:id=\"OR\" was not injected: check your FXML file 'Login.fxml'.";
        assert TO != null : "fx:id=\"TO\" was not injected: check your FXML file 'Login.fxml'.";
        assert eye1 != null : "fx:id=\"eye1\" was not injected: check your FXML file 'Login.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Login.fxml'.";
        assert loginphoto != null : "fx:id=\"loginphoto\" was not injected: check your FXML file 'Login.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'Login.fxml'.";
        assert pane2 != null : "fx:id=\"pane2\" was not injected: check your FXML file 'Login.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtpw != null : "fx:id=\"txtpw\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtun != null : "fx:id=\"txtun\" was not injected: check your FXML file 'Login.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'Login.fxml'.";
        assert userpic != null : "fx:id=\"userpic\" was not injected: check your FXML file 'Login.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'Login.fxml'.";

    }

}
