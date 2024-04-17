package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Ingredients {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView EmployeePane;

    @FXML
    private TableColumn<?, ?> colDesc;

    @FXML
    private TableColumn<?, ?> colIid;

    @FXML
    private TableColumn<?, ?> colQOh;

    @FXML
    private TableColumn<?, ?> colSID;

    @FXML
    private Text title;

    @FXML
    void initialize() {
        assert EmployeePane != null : "fx:id=\"EmployeePane\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colDesc != null : "fx:id=\"colDesc\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colIid != null : "fx:id=\"colIid\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colQOh != null : "fx:id=\"colQOh\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colSID != null : "fx:id=\"colSID\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Ingredients.fxml'.";

    }

}
