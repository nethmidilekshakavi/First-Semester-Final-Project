package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
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
    private TextField CNICtxt;

    @FXML
    private TextField CSnametxt;

    @FXML
    private TextField Caddresstxt;

    @FXML
    private TextField Cemailtxt;

    @FXML
    private TextField Cidtxt;

    @FXML
    private TableView<?> Ctable;

    @FXML
    private TextField Cteltxt;

    @FXML
    private Text Fname;

    @FXML
    private Text Lname;

    @FXML
    private AnchorPane MainFormPane;

    @FXML
    private Text NIC;

    @FXML
    private ImageView PIC08;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdate;

    @FXML
    private TableColumn<?, ?> coladdress;

    @FXML
    private TableColumn<?, ?> colemail;

    @FXML
    private TableColumn<?, ?> colfname;

    @FXML
    private TableColumn<?, ?> collname;

    @FXML
    private TableColumn<?, ?> colnic;

    @FXML
    private TableColumn<?, ?> colnumber;

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
    void backtoDashboard(ActionEvent event) {

    }

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
        assert CNICtxt != null : "fx:id=\"CNICtxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert CSnametxt != null : "fx:id=\"CSnametxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Caddresstxt != null : "fx:id=\"Caddresstxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cemailtxt != null : "fx:id=\"Cemailtxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cidtxt != null : "fx:id=\"Cidtxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Ctable != null : "fx:id=\"Ctable\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Cteltxt != null : "fx:id=\"Cteltxt\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Fname != null : "fx:id=\"Fname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert Lname != null : "fx:id=\"Lname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert MainFormPane != null : "fx:id=\"MainFormPane\" was not injected: check your FXML file 'Customer.fxml'.";
        assert NIC != null : "fx:id=\"NIC\" was not injected: check your FXML file 'Customer.fxml'.";
        assert PIC08 != null : "fx:id=\"PIC08\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnclear != null : "fx:id=\"btnclear\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btndelete != null : "fx:id=\"btndelete\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnsave != null : "fx:id=\"btnsave\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnupdate != null : "fx:id=\"btnupdate\" was not injected: check your FXML file 'Customer.fxml'.";
        assert coladdress != null : "fx:id=\"coladdress\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colemail != null : "fx:id=\"colemail\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colfname != null : "fx:id=\"colfname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert collname != null : "fx:id=\"collname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colnic != null : "fx:id=\"colnic\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colnumber != null : "fx:id=\"colnumber\" was not injected: check your FXML file 'Customer.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'Customer.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'Customer.fxml'.";
        assert pane1 != null : "fx:id=\"pane1\" was not injected: check your FXML file 'Customer.fxml'.";
        assert phoneNumber != null : "fx:id=\"phoneNumber\" was not injected: check your FXML file 'Customer.fxml'.";
        assert topic != null : "fx:id=\"topic\" was not injected: check your FXML file 'Customer.fxml'.";

    }

}
