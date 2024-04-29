package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class UpdateCustomer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text CID;

    @FXML
    private TextField NEWicdtxt;

    @FXML
    private Text address;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField cidtxt;

    @FXML
    private Text email;

    @FXML
    private Text fname;

    @FXML
    private Text lname;

    @FXML
    private TextField newEmailtxt;

    @FXML
    private TextField newaddresstxt;

    @FXML
    private Text newcid;

    @FXML
    private TextField newfnametxt;

    @FXML
    private TextField newlnametxt;

    @FXML
    private TextField newnictxt;

    @FXML
    private TextField newnumtxt;

    @FXML
    private Text nic;

    @FXML
    private Text num;

    @FXML
    private ImageView updateCustomerPage;

    @FXML
    private Text updatecustomerinfor;

    @FXML
    void dontSaveCustomer(ActionEvent event) {

    }

    @FXML
    void updateEmployee(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert CID != null : "fx:id=\"CID\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert NEWicdtxt != null : "fx:id=\"NEWicdtxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert cidtxt != null : "fx:id=\"cidtxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert fname != null : "fx:id=\"fname\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert lname != null : "fx:id=\"lname\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newEmailtxt != null : "fx:id=\"newEmailtxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newaddresstxt != null : "fx:id=\"newaddresstxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newcid != null : "fx:id=\"newcid\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newfnametxt != null : "fx:id=\"newfnametxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newlnametxt != null : "fx:id=\"newlnametxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newnictxt != null : "fx:id=\"newnictxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert newnumtxt != null : "fx:id=\"newnumtxt\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert nic != null : "fx:id=\"nic\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert num != null : "fx:id=\"num\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert updateCustomerPage != null : "fx:id=\"updateCustomerPage\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";
        assert updatecustomerinfor != null : "fx:id=\"updatecustomerinfor\" was not injected: check your FXML file 'UpdateCustomer.fxml'.";

    }

}