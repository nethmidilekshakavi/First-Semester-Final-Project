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

public class Supplier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView SupplierPane;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colAmountDate;

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
    private TableView<?> employeeTable;

    @FXML
    private Text title;

    @FXML
    void addNewSupplier(ActionEvent event) throws IOException {
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

    @FXML
    void initialize() {
        assert SupplierPane != null : "fx:id=\"SupplierPane\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colAddress != null : "fx:id=\"colAddress\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colAmountDate != null : "fx:id=\"colAmountDate\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colDateOfPayment != null : "fx:id=\"colDateOfPayment\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colIngredients != null : "fx:id=\"colIngredients\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colMobile != null : "fx:id=\"colMobile\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colPaid != null : "fx:id=\"colPaid\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert colPaymentType != null : "fx:id=\"colPaymentType\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert coldateOfPurches != null : "fx:id=\"coldateOfPurches\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert employeeTable != null : "fx:id=\"employeeTable\" was not injected: check your FXML file 'Supplier.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Supplier.fxml'.";

    }

}
