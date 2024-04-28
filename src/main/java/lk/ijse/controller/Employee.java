package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Model.EmployeeModel;
import lk.ijse.Model.TM.EmployeeTM;
import lk.ijse.Repository.EmployeeRepo;

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
    private TableColumn<EmployeeTM, String> colNIC;

    @FXML
    private TableColumn<EmployeeTM, String> colPosition;

    @FXML
    private TableColumn<EmployeeTM, String> colSalary;

    @FXML
    private TableColumn<EmployeeTM, JFXButton> colUpadte;

    @FXML
    private TableColumn<EmployeeTM, String> coladdress;

    @FXML
    private TableColumn<EmployeeTM, JFXButton> coldelete;

    @FXML
    private TableColumn<EmployeeTM, String> colemail;

    @FXML
    private TableColumn<EmployeeTM, String> colfName;

    @FXML
    private TableColumn<EmployeeTM, String> collname;

    @FXML
    private TableColumn<EmployeeTM, String> colnum;

    @FXML
    private TableView<EmployeeTM> employeeTable;

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
    public void loadvalues() throws SQLException {
        ArrayList<EmployeeModel> allEmployee = EmployeeRepo.getAll();
        ObservableList<EmployeeTM>observableList= FXCollections.observableArrayList();

        for (int i=0; i< allEmployee.size() ; i++){
            String mobile = String.valueOf(allEmployee.get(i).getPhone_Number());
            EmployeeTM employeeTM = new EmployeeTM(allEmployee.get(i).getE_ID(),allEmployee.get(i).getNIC(),allEmployee.get(i).getFirst_Name(),allEmployee.get(i).getLast_Name(),allEmployee.get(i).getAddress(),mobile,allEmployee.get(i).getEmail(),allEmployee.get(i).getSalary(),allEmployee.get(i).getPosition(),new JFXButton("Update"),new JFXButton("Delete"));
            observableList.add(employeeTM);
            employeeTable.setItems(observableList);
        }
        for (int i=0; i<observableList.size(); i++){
            observableList.get(i).getUpdate().setStyle("-fx-background-color: rgba(96,120,205,0,97)");
            observableList.get(i).getDelete().setStyle("-fx-background-color: rgba(175,108,108,1)");
          observableList.get(i).getUpdate().setTextFill(Color.WHITE);
            observableList.get(i).getDelete().setTextFill(Color.WHITE);
        }
        for (int i=0 ;i<observableList.size();i++){
            String id =observableList.get(i).getE_ID();
            String  nic =observableList.get(i).getNIC();
            String fn =observableList.get(i).getFirst_Name();
            String ln =observableList.get(i).getLast_Name();
            String add =observableList.get(i).getAddress();
            String mobile =observableList.get(i).getPhone_Number();
            String email =observableList.get(i).getEmail();
            String salary = observableList.get(i).getSalary();
            String position = observableList.get(i).getPosition();
          observableList.get(i).getUpdate().setOnAction(actionEvent -> {});
            observableList.get(i).getDelete().setOnAction(actionEvent -> {});

        }

    }
    private void setValues() {
        colNIC.setCellValueFactory(new PropertyValueFactory<>("NIC"));
        colfName.setCellValueFactory(new PropertyValueFactory<>("First_Name"));
        collname.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));
        coladdress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colnum.setCellValueFactory(new PropertyValueFactory<>("Phone_Number"));
        colemail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("Salary"));
        colPosition.setCellValueFactory(new PropertyValueFactory<>("Position"));
        colUpadte.setCellValueFactory(new PropertyValueFactory<EmployeeTM, JFXButton>("Update"));
        coldelete.setCellValueFactory(new PropertyValueFactory<EmployeeTM,JFXButton>("Delete"));
    }

    @FXML
    void initialize() throws SQLException {
        assert EmployeePane != null : "fx:id=\"EmployeePane\" was not injected: check your FXML file 'Employee.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Employee.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Employee.fxml'.";
        assert cidtxt != null : "fx:id=\"cidtxt\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colNIC != null : "fx:id=\"colNIC\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colPosition != null : "fx:id=\"colPosition\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colSalary != null : "fx:id=\"colSalary\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colUpadte != null : "fx:id=\"colUpadte\" was not injected: check your FXML file 'Employee.fxml'.";
        assert coladdress != null : "fx:id=\"coladdress\" was not injected: check your FXML file 'Employee.fxml'.";
        assert coldelete != null : "fx:id=\"coldelete\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colemail != null : "fx:id=\"colemail\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colfName != null : "fx:id=\"colfName\" was not injected: check your FXML file 'Employee.fxml'.";
        assert collname != null : "fx:id=\"collname\" was not injected: check your FXML file 'Employee.fxml'.";
        assert colnum != null : "fx:id=\"colnum\" was not injected: check your FXML file 'Employee.fxml'.";
        assert employeeTable != null : "fx:id=\"employeeTable\" was not injected: check your FXML file 'Employee.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Employee.fxml'.";
        loadvalues();
        setValues();
    }

}
