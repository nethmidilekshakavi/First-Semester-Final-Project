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

public class AddNewEmployee {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text CID;

    @FXML
    private Text NIC;

    @FXML
    private ImageView addEmployeePane;

    @FXML
    private Text address;

    @FXML
    private JFXTextArea addresstxt;

    @FXML
    private Text birthday;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private TextField daytxt;

    @FXML
    private Text email;

    @FXML
    private JFXTextArea emailtxt;

    @FXML
    private Text firstNmae1;

    @FXML
    private JFXTextArea fnametxt;

    @FXML
    private Text lastName;

    @FXML
    private JFXTextArea lname;

    @FXML
    private Text mobile;

    @FXML
    private JFXTextArea mobiletxt;

    @FXML
    private TextField monthtxt;

    @FXML
    private Text name;

    @FXML
    private JFXTextArea nictxt;

    @FXML
    private Text personalInformation;

    @FXML
    private Text position;

    @FXML
    private JFXTextArea positiontxt;

    @FXML
    private Text salary;

    @FXML
    private JFXTextArea salarytxt;

    @FXML
    private TextField yeartxt;

    @FXML
    void dontSaveEmployee(ActionEvent event) {

    }

    @FXML
    void saveEmployee(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert CID != null : "fx:id=\"CID\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert NIC != null : "fx:id=\"NIC\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert addEmployeePane != null : "fx:id=\"addEmployeePane\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert birthday != null : "fx:id=\"birthday\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert daytxt != null : "fx:id=\"daytxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert emailtxt != null : "fx:id=\"emailtxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert firstNmae1 != null : "fx:id=\"firstNmae1\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert fnametxt != null : "fx:id=\"fnametxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert lastName != null : "fx:id=\"lastName\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert lname != null : "fx:id=\"lname\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert mobiletxt != null : "fx:id=\"mobiletxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert monthtxt != null : "fx:id=\"monthtxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert nictxt != null : "fx:id=\"nictxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert personalInformation != null : "fx:id=\"personalInformation\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert position != null : "fx:id=\"position\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert positiontxt != null : "fx:id=\"positiontxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert salary != null : "fx:id=\"salary\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert salarytxt != null : "fx:id=\"salarytxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";
        assert yeartxt != null : "fx:id=\"yeartxt\" was not injected: check your FXML file 'addNewEmployee.fxml'.";

    }

}