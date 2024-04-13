package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Customer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text Address;

    @FXML
    private TextField CFnametxt;

    @FXML
    private TextField CSnametxt;

    @FXML
    private TextField Caddresstxt;

    @FXML
    private TextField Cemailtxt;

    @FXML
    private TextField Cidtxt;

    @FXML
    private TextField Cteltxt;

    @FXML
    private Text Fname;

    @FXML
    private Text Lname;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdate;

    @FXML
    private Text email;

    @FXML
    private Text id;

    @FXML
    private AnchorPane pane1;

    @FXML
    private Text phoneNumber;

    @FXML
    private Text topic;

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void saveOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Address != null : "fx:id=\"Address\" was not injected: check your FXML file 'Customer.fxml'.";
        assert CFnametxt != null : "fx:id=\"CFnametxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert CSnametxt != null : "fx:id=\"CSnametxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Caddresstxt != null : "fx:id=\"Caddresstxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cemailtxt != null : "fx:id=\"Cemailtxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cidtxt != null : "fx:id=\"Cidtxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cteltxt != null : "fx:id=\"Cteltxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Fname != null : "fx:id=\"Fname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Lname != null : "fx:id=\"Lname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnclear != null : "fx:id=\"btnclear\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btndelete != null : "fx:id=\"btndelete\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnsave != null : "fx:id=\"btnsave\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnupdate != null : "fx:id=\"btnupdate\" was not injected: check your FXML file 'Customer.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'Customer.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'Customer.fxml'.";
        assert pane1 != null : "fx:id=\"pane1\" was not injected: check your FXML file 'Customer.fxml'.";
        assert phoneNumber != null : "fx:id=\"phoneNumber\" was not injected: check your FXML file 'Customer.fxml'.";
        assert topic != null : "fx:id=\"topic\" was not injected: check your FXML file 'Customer.fxml'.";

    }

}
