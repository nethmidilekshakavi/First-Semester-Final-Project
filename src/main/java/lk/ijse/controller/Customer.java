package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Customer {

    @FXML
    private TableColumn<?, ?> ADDRESS;

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
    private TableColumn<?, ?> EMAIL;

    @FXML
    private TableColumn<?, ?> FNAME;

    @FXML
    private Text Fname;

    @FXML
    private TableColumn<?, ?> LNAME;

    @FXML
    private Text Lname;

    @FXML
    private TableColumn<?, ?> NIC;

    @FXML
    private TableColumn<?, ?> NUMBER;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<?> customerTable;

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

}
