package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SaveCustomerForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ADDRESS;

    @FXML
    private TextField EMAIL;

    @FXML
    private TextField FNAME;

    @FXML
    private TextField LNAME;

    @FXML
    private TextField NIC;

    @FXML
    private TextField NUMBER;

    @FXML
    private Text customerForm;

    @FXML
    private Button saveBTN;

    @FXML
    void saveCustomer(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ADDRESS != null : "fx:id=\"ADDRESS\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert EMAIL != null : "fx:id=\"EMAIL\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert FNAME != null : "fx:id=\"FNAME\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert LNAME != null : "fx:id=\"LNAME\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert NIC != null : "fx:id=\"NIC\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert NUMBER != null : "fx:id=\"NUMBER\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert customerForm != null : "fx:id=\"customerForm\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";
        assert saveBTN != null : "fx:id=\"saveBTN\" was not injected: check your FXML file 'saveCustomerForm.fxml'.";

    }

}
