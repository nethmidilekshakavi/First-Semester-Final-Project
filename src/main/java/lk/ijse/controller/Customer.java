package lk.ijse.controller;

import java.io.IOException;
import java.io.InputStream;
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
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.DB.DbConnection;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Model.TM.customerTM;
import lk.ijse.Repository.CustomerRepo;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

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
    private TableColumn<customerTM, JFXButton> colDelete;

    @FXML
    private TableColumn<customerTM, String> colEmail;

    @FXML
    private TableColumn<customerTM, String> colFname;

    @FXML
    private TableColumn<customerTM, String> colLname;

    @FXML
    private TableColumn<customerTM, String> colNIC;

    @FXML
    private TableColumn<customerTM, JFXButton> colUpdate;

    @FXML
    private TableColumn<customerTM, String> coladdress;

    @FXML
    private TableColumn<?,?> colmobile;

    @FXML
    private TableView<customerTM> customerTable;

    @FXML
    private Text title;

    @FXML
    private AnchorPane pane;

    @FXML
    void addNewCustomer(ActionEvent event) throws IOException {
        AddNewCustomer.apane = pane;
        UpdateCustomer.upane = pane;
        Parent parent = FXMLLoader.load(getClass().getResource("/view/addNewCustomer.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Customer Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) throws JRException, SQLException {
            InputStream resourceAsStream = getClass().getResourceAsStream("/Report/Customer.jrxml.fxml");
            JasperDesign load = JRXmlLoader.load(resourceAsStream);
            JasperReport jasperReport = JasperCompileManager.compileReport(load);
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    jasperReport,
                    null,
                    DbConnection.getInstance().getConnection()
            );

            JasperViewer.viewReport(jasperPrint,false);
        }


  public void loadvalues() throws SQLException {
        ArrayList<CustomerModel> allcustomer=CustomerRepo.getAll();
        ObservableList<customerTM>observableList =FXCollections.observableArrayList();

      for (int i=0 ;i< allcustomer.size() ; i++){
          String mobile =String.valueOf(allcustomer.get(i).getPhone_Number());
          customerTM customerTM =new customerTM(allcustomer.get(i).getC_ID(),allcustomer.get(i).getNIC(),allcustomer.get(i).getFirst_Name(),allcustomer.get(i).getLast_Name(),allcustomer.get(i).getAddress(),mobile,allcustomer.get(i).getEmail(), new JFXButton("Delete"),new JFXButton("Update"));
          observableList.add(customerTM);
          customerTable.setItems(observableList);
      }

      for (int i = 0; i < observableList.size(); i++) {
          observableList.get(i).getUpdate().setStyle("-fx-background-color: rgba(16, 176, 72)");
          observableList.get(i).getUpdate().setPrefWidth(130);
          observableList.get(i).getUpdate().setPrefHeight(30);
          observableList.get(i).getUpdate().setCursor(Cursor.HAND);
          observableList.get(i).getDelete().setStyle("-fx-background-color: rgba(166, 7, 33)");
          observableList.get(i).getDelete().setCursor(Cursor.HAND);
          observableList.get(i).getDelete().setPrefWidth(120);
          observableList.get(i).getDelete().setPrefHeight(30);
          observableList.get(i).getUpdate().setTextFill(Color.WHITE);
          observableList.get(i).getDelete().setTextFill(Color.WHITE);

      }
      for (int i=0 ;i<observableList.size();i++){
          String id =observableList.get(i).getC_ID();
          observableList.get(i).getDelete().setOnAction(actionEvent -> {

                      Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
                      confirmDialog.setTitle("Confirm Deletion");
                      confirmDialog.setHeaderText("Are you sure you want to delete this customer?");
                      confirmDialog.setContentText("Press OK to confirm or Cancel to abort.");

                      confirmDialog.showAndWait().ifPresent(response -> {
                          if (response == ButtonType.OK) {
                              try {
                                  boolean deleted = CustomerRepo.delete(id);
                                  if (deleted) {
                                      Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                                      successAlert.setTitle("Success");
                                      successAlert.setHeaderText(null);
                                      successAlert.setContentText("Customer Deleted Successfully");
                                      successAlert.showAndWait();
                                      // Reload values after successful deletion
                                  } else {
                                      // Handle deletion failure
                                      Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                                      errorAlert.setTitle("Error");
                                      errorAlert.setHeaderText(null);
                                      errorAlert.setContentText("Failed to delete customer.");
                                      errorAlert.showAndWait();
                                  }
                              } catch (SQLException e) {
                                  throw new RuntimeException(e);
                              }
                              try {
                                  loadvalues();
                              } catch (SQLException e) {
                                  throw new RuntimeException(e);
                              }
                          }
                      });
                  });

           /*   boolean b = false;
              try {
                   b = CustomerRepo.delete(id);
              }catch (SQLException e) {
                  throw new RuntimeException(e);
              }
                  if (b) {
                      new Alert(Alert.AlertType.CONFIRMATION, "Customer Deleted");
                  }
                  try{
                      loadvalues();
                  } catch (SQLException e) {
                  throw new RuntimeException(e);
              }*/

          observableList.get(i).getUpdate().setOnAction(actionEvent -> {
              Parent parent = null;
              try {
                  parent = FXMLLoader.load(getClass().getResource("/view/UpdateCustomer.fxml"));
              } catch (IOException e) {
                  throw new RuntimeException(e);
              }
              Scene scene =new Scene(parent);
              Stage stage = new Stage();
              stage.setScene(scene);
              stage.setTitle("Update Customer");
              stage.centerOnScreen();
              stage.show();

          });
      }
  }
        public void setValues(){
            colNIC.setCellValueFactory(new PropertyValueFactory<>("NIC"));
            colFname.setCellValueFactory(new PropertyValueFactory<>("First_Name"));
            colLname.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));
            coladdress.setCellValueFactory(new PropertyValueFactory<>("Address"));
            colmobile.setCellValueFactory(new PropertyValueFactory<>("Phone_Number"));
            colEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
            colDelete.setCellValueFactory(new PropertyValueFactory<customerTM,JFXButton>("Delete"));
            colUpdate.setCellValueFactory(new PropertyValueFactory<customerTM,JFXButton>("Update"));
        }

    @FXML
    void initialize() throws SQLException {
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
        loadvalues();
        setValues();
    }
}
