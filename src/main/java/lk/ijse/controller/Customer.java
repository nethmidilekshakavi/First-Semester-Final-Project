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
    private TableColumn<?, ?> colDelete;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colFname;

    @FXML
    private TableColumn<?, ?> colLname;

    @FXML
    private TableColumn<?, ?> colNIC;

    @FXML
    private TableColumn<?, ?> colUpdate;

    @FXML
    private TableColumn<?, ?> coladdress;

    @FXML
    private TableColumn<?, ?> colmobile;

    @FXML
    private TableView<?> customerTable;

    @FXML
    private Text title;



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
        assert colDelete != null : "fx:id=\"colDelete\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colEmail != null : "fx:id=\"colEmail\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colFname != null : "fx:id=\"colFname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colLname != null : "fx:id=\"colLname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colNIC != null : "fx:id=\"colNIC\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colUpdate != null : "fx:id=\"colUpdate\" was not injected: check your FXML file 'Customer.fxml'.";
        assert coladdress != null : "fx:id=\"coladdress\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colmobile != null : "fx:id=\"colmobile\" was not injected: check your FXML file 'Customer.fxml'.";
        assert customerTable != null : "fx:id=\"customerTable\" was not injected: check your FXML file 'Customer.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Customer.fxml'.";

    }

}
