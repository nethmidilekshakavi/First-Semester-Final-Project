package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import lk.ijse.DB.DbConnetion;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Repository.CustomerRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public Customer(String id, String fName, String lName, String address, int phoneNumber, String email) {
    }

    public Customer(String fName, String lName, String address, int phoneNumber, String email) {

    }

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void saveOnAction(ActionEvent event) throws SQLException {
        String id = Cidtxt.getText();
        String FName = CFnametxt.getText();
        String LName = CSnametxt.getText();
        String address = Caddresstxt.getText();
        int phoneNumber = Integer.parseInt(Cteltxt.getText());
        String email = Cemailtxt.getText();

        CustomerModel customer = new CustomerModel(id, FName, LName, address, phoneNumber, email);

        boolean isSave = CustomerRepo.saveCustomer(customer);
        if (isSave) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Saved!").show();
            clearFields();
        }

    }



    @FXML
    void updateOnAction(ActionEvent event) throws SQLException {
        String FName = CFnametxt.getText();
        String LName = CSnametxt.getText();
        String address = Caddresstxt.getText();
        int phoneNumber = Integer.parseInt(Cteltxt.getText());
        String email = Cemailtxt.getText();

        Customer customer = new Customer(FName, LName, address, phoneNumber, email);

        boolean isUpdated = CustomerRepo.updateCustomer(customer);
        if (isUpdated) {
            new Alert(Alert.AlertType.CONFIRMATION, "customer updated!").show();
        }

    }

    void btnDeleteOnAction(ActionEvent event) throws SQLException {
        String id = Cidtxt.getText();

        boolean isDeleted = CustomerRepo.delete(id);
        if (isDeleted) {
            new Alert(Alert.AlertType.CONFIRMATION, "customer deleted!").show();
        }
    }

    void btnClearOnAction(ActionEvent event) {
        clearFields();
    }


    private void clearFields () {
            Cidtxt.setText("");
            CFnametxt.setText("");
            CSnametxt.setText("");
            Caddresstxt.setText("");
            Cteltxt.setText("");
            Cemailtxt.setText("");
        }
    }
