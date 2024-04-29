package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class UpdateMeal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnMeal;

    @FXML
    private Text mid;

    @FXML
    private TextField midtxt;

    @FXML
    private Text name;

    @FXML
    private TextField nametxt;

    @FXML
    private Text newmid;

    @FXML
    private TextField newmidtxt;

    @FXML
    private Text price;

    @FXML
    private TextField pricetxt;

    @FXML
    private Text updatemeal;

    @FXML
    private ImageView updatemealpane;

    @FXML
    void dontSaveMeal(ActionEvent event) {

    }

    @FXML
    void updateMeal(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert btnMeal != null : "fx:id=\"btnMeal\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert mid != null : "fx:id=\"mid\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert midtxt != null : "fx:id=\"midtxt\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert nametxt != null : "fx:id=\"nametxt\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert newmid != null : "fx:id=\"newmid\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert newmidtxt != null : "fx:id=\"newmidtxt\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert pricetxt != null : "fx:id=\"pricetxt\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert updatemeal != null : "fx:id=\"updatemeal\" was not injected: check your FXML file 'updateMeal.fxml'.";
        assert updatemealpane != null : "fx:id=\"updatemealpane\" was not injected: check your FXML file 'updateMeal.fxml'.";

    }

}
