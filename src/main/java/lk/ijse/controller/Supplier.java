package lk.ijse.controller;

import java.awt.*;
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
import lk.ijse.Model.SupplierModel;
import lk.ijse.Model.TM.SupplierTM;
import lk.ijse.Model.TM.customerTM;
import lk.ijse.Repository.SupplierRepo;

public class Supplier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView SupplierPane;

    @FXML
    private TableView<SupplierTM> SupplierTable;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colAmountDue;

    @FXML
    private TableColumn<?, ?> colDateOfPayment;

    @FXML
    private TableColumn<?, ?> colIngredients;

    @FXML
    private TableColumn<?, ?> colMobile;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPaid;

    @FXML
    private TableColumn<?, ?> colPaymentType;

    @FXML
    private TableColumn<?, ?> coldateOfPurches;

    @FXML
    private Text title;

    @FXML
    void addNewSupplier(ActionEvent event) throws IOException, IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/AddNewSupplier.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Supplier Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) {

    }

    public void loadvalues() throws SQLException {
        ArrayList<SupplierModel> allSupplier= SupplierRepo.getAll();
        ObservableList<SupplierTM> observableList = FXCollections.observableArrayList();

        for (int i=0 ;i< allSupplier.size() ; i++){
            String mobile =String.valueOf(allSupplier.get(i).getPhone_Number());
            SupplierTM supplierTM =new SupplierTM(allSupplier.get(i).getS_ID(),allSupplier.get(i).getName(),allSupplier.get(i).getAddress(),mobile,allSupplier.get(i).getIngredient(),allSupplier.get(i).getDate_Of_Purchase(),allSupplier.get(i).getAmount_due(),allSupplier.get(i).getDate_of_Payment(),allSupplier.get(i).getPayment_Type(),allSupplier.get(i).getAmount_Paid());
            observableList.add(supplierTM);
            SupplierTable.setItems(observableList);
        }
    }
    public void setValues(){
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colMobile.setCellValueFactory(new PropertyValueFactory<>("Phone_Number"));
        colIngredients.setCellValueFactory(new PropertyValueFactory<>("Ingredients"));
        coldateOfPurches.setCellValueFactory(new PropertyValueFactory<>("Date_Of_Purchase"));
        colAmountDue.setCellValueFactory(new PropertyValueFactory<>("Amount_Due"));
        colDateOfPayment.setCellValueFactory(new PropertyValueFactory<>("Date_of_Payment"));
        colPaymentType.setCellValueFactory(new PropertyValueFactory<>("Payment_Type"));
        colPaid.setCellValueFactory(new PropertyValueFactory<>("Amount_Paid"));

    }


    @FXML
    void initialize() throws SQLException {
        assert SupplierPane != null : "fx:id=\"SupplierPane\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert SupplierTable != null : "fx:id=\"SupplierTable\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colAddress != null : "fx:id=\"colAddress\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colAmountDue != null : "fx:id=\"colAmountDue\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colDateOfPayment != null : "fx:id=\"colDateOfPayment\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colIngredients != null : "fx:id=\"colIngredients\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colMobile != null : "fx:id=\"colMobile\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colPaid != null : "fx:id=\"colPaid\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colPaymentType != null : "fx:id=\"colPaymentType\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert coldateOfPurches != null : "fx:id=\"coldateOfPurches\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Supplier.fxml'.";
        loadvalues();
        setValues();

    }

}
