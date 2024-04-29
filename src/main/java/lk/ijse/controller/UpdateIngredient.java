package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class UpdateIngredient {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text IID;

    @FXML
    private Text NEWIID;

    @FXML
    private Text QOH;

    @FXML
    private TextField QOHtxt;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnUpdate;

    @FXML
    private Text desc;

    @FXML
    private TextField desctxt;

    @FXML
    private TextField iidtxt;

    @FXML
    private TextField newiddtxt;

    @FXML
    private Text supplier;

    @FXML
    private TextField suppliertxt;

    @FXML
    private ImageView updateIngredientPage;

    @FXML
    private Text updateIngreinfor;

    @FXML
    void dontSaveIngredient(ActionEvent event) {

    }

    @FXML
    void updateIngredient(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert IID != null : "fx:id=\"IID\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert NEWIID != null : "fx:id=\"NEWIID\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert QOH != null : "fx:id=\"QOH\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert QOHtxt != null : "fx:id=\"QOHtxt\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert desc != null : "fx:id=\"desc\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert desctxt != null : "fx:id=\"desctxt\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert iidtxt != null : "fx:id=\"iidtxt\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert newiddtxt != null : "fx:id=\"newiddtxt\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert supplier != null : "fx:id=\"supplier\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert suppliertxt != null : "fx:id=\"suppliertxt\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert updateIngredientPage != null : "fx:id=\"updateIngredientPage\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";
        assert updateIngreinfor != null : "fx:id=\"updateIngreinfor\" was not injected: check your FXML file 'UpdateIngredient.fxml'.";

    }

}
