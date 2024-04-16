package lk.ijse.controller;

import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class SaveCustomerForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addCustomerPane;

    @FXML
    private Text address;

    @FXML
    private JFXTextArea addresstxt;

    @FXML
    private Button cancelbtn;

    @FXML
    private Text cid;

    @FXML
    private TextField cidtxt;

    @FXML
    private Text customerForm;

    @FXML
    private Text email;

    @FXML
    private JFXTextArea emailtxt;

    @FXML
    private JFXTextArea firsttxt;

    @FXML
    private JFXTextArea lasttxt;

    @FXML
    private Text mobile;

    @FXML
    private JFXTextArea mobiletxt;

    @FXML
    private Text name;

    @FXML
    private Text nic;

    @FXML
    private JFXTextArea nictxt;

    @FXML
    private Button saveBTN;

    @FXML
    void dontSave(ActionEvent event) {

    }

    @FXML
    void saveCustomer(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert addCustomerPane != null : "fx:id=\"addCustomerPane\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert cancelbtn != null : "fx:id=\"cancelbtn\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert cid != null : "fx:id=\"cid\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert cidtxt != null : "fx:id=\"cidtxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert customerForm != null : "fx:id=\"customerForm\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert emailtxt != null : "fx:id=\"emailtxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert firsttxt != null : "fx:id=\"firsttxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert lasttxt != null : "fx:id=\"lasttxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert mobiletxt != null : "fx:id=\"mobiletxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert nic != null : "fx:id=\"nic\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert nictxt != null : "fx:id=\"nictxt\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert saveBTN != null : "fx:id=\"saveBTN\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";

    }

}
