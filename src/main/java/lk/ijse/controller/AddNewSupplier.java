package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class AddNewSupplier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView AddNewSupplierPage;

    @FXML
    private Text SID;

    @FXML
    private Text SupplierInfor;

    @FXML
    private Text address;

    @FXML
    private TextField addresstxt;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private Text ingredient;

    @FXML
    private Text mobile;

    @FXML
    private TextField mobiletxt;

    @FXML
    private Text name;

    @FXML
    private TextField nametxt;

    @FXML
    private TextField sidtxt;

    @FXML
    private TextField txtIngredient;

    @FXML
    void dontSaveSupplier(ActionEvent event) {

    }

    @FXML
    void saveSupplier(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert AddNewSupplierPage != null : "fx:id=\"AddNewSupplierPage\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert SID != null : "fx:id=\"SID\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert SupplierInfor != null : "fx:id=\"SupplierInfor\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert ingredient != null : "fx:id=\"ingredient\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert mobiletxt != null : "fx:id=\"mobiletxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert nametxt != null : "fx:id=\"nametxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert sidtxt != null : "fx:id=\"sidtxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert txtIngredient != null : "fx:id=\"txtIngredient\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";

    }

}
