package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Model.TM.EmployeeTM;

public class Employee {

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
    private Text cidtxt;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colMobile;

    @FXML
    private TableColumn<?, ?> colNIC;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPosition;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<EmployeeTM, JFXButton> coldelete;

    @FXML
    private TableColumn<?, ?> colemail;

    @FXML
    private TableColumn<EmployeeTM, JFXButton> colupdate;

    @FXML
    private TableView<?> employeeTable;

    @FXML
    private Text title;

    @FXML
    void addNewEmployee(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/addNewEmployee.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Employee Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) {

    }

    public void setValues(){
        colNIC.setCellValueFactory(new PropertyValueFactory<>("NIC"));
        colName.setCellValueFactory(new PropertyValueFactory<>("First_Name"+" "+"Last_Name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colMobile.setCellValueFactory(new PropertyValueFactory<>("Phone_Number"));
        colemail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        coldelete.setCellValueFactory(new PropertyValueFactory<EmployeeTM,JFXButton>("Delete"));
        colupdate.setCellValueFactory(new PropertyValueFactory<EmployeeTM,JFXButton>("Update"));
    }

    @FXML
    void initialize() {
        assert EmployeePane != null : "fx:id=\"EmployeePane\" was not injected: check your FXML file 'Employee.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Employee.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Employee.fxml'.";
        assert cidtxt != null : "fx:id=\"cidtxt\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colAddress != null : "fx:id=\"colAddress\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colMobile != null : "fx:id=\"colMobile\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colNIC != null : "fx:id=\"colNIC\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colPosition != null : "fx:id=\"colPosition\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colSalary != null : "fx:id=\"colSalary\" was not injected: check your FXML file 'Employee.fxml'.";
        assert coldelete != null : "fx:id=\"coldelete\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colemail != null : "fx:id=\"colemail\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colupdate != null : "fx:id=\"colupdate\" was not injected: check your FXML file 'Employee.fxml'.";
        assert employeeTable != null : "fx:id=\"employeeTable\" was not injected: check your FXML file 'Employee.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Employee.fxml'.";

    }

}
