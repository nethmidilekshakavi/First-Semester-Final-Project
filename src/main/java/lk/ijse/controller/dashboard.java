package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class dashboard {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Emptypane;

    @FXML
    private AnchorPane buttonSet;

    @FXML
    void initialize() {
        assert Emptypane != null : "fx:id=\"Emptypane\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert buttonSet != null : "fx:id=\"buttonSet\" was not injected: check your FXML file 'dashboard.fxml'.";

    }

}
