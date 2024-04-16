package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView EmployeePane;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colMobile;

    @FXML
    private TableColumn<?, ?> colNIC;

    @FXML
    private TableColumn<?, ?> colName1;

    @FXML
    private TableColumn<?, ?> coldelete;

    @FXML
    private TableColumn<?, ?> colemail;

    @FXML
    private TableColumn<?, ?> colupdate;

    @FXML
    private TableView<?> employeeTable;

    @FXML
    private Text title;

    @FXML
    private TableColumn<?, ?> viewCustomer;

    @FXML
    void addNewCustomer(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/saveCustomerForm.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Customer Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert EmployeePane != null : "fx:id=\"EmployeePane\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colAddress != null : "fx:id=\"colAddress\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colMobile != null : "fx:id=\"colMobile\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colNIC != null : "fx:id=\"colNIC\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colName1 != null : "fx:id=\"colName1\" was not injected: check your FXML file 'Customer.fxml'.";
        assert coldelete != null : "fx:id=\"coldelete\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colemail != null : "fx:id=\"colemail\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colupdate != null : "fx:id=\"colupdate\" was not injected: check your FXML file 'Customer.fxml'.";
        assert employeeTable != null : "fx:id=\"employeeTable\" was not injected: check your FXML file 'Customer.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Customer.fxml'.";
        assert viewCustomer != null : "fx:id=\"viewCustomer\" was not injected: check your FXML file 'Customer.fxml'.";

    }

}
