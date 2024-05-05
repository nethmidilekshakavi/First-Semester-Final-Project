package lk.ijse.controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import lk.ijse.Model.IngredientModel;
import lk.ijse.Model.SupplierModel;
import lk.ijse.Repository.IngredientRepo;
import lk.ijse.Repository.SupplierRepo;

public class UpdateSupplier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AmountDuetxt;

    @FXML
    private Text AmountPaid;

    @FXML
    private TextField AmountPaidtxt;

    @FXML
    private TextField PaymentTypetxt;

    @FXML
    private Text SID;

    @FXML
    private Text address;

    @FXML
    private TextField addresstxt;

    @FXML
    private Text amountDue;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField dataOfPaymenttxt;

    @FXML
    private Text dateOdPayment;

    @FXML
    private Text dateOdPayment1;

    @FXML
    private Text dateOdPurchase;

    @FXML
    private Text ingredient;

    @FXML
    private Text mobile;

    @FXML
    private TextField mobiletxt;

    @FXML
    private Text name;

    @FXML
    private TextField newSnametxt;
    @FXML
    private TextField purchasetxt;

    @FXML
    private TextField sidtxt;

    @FXML
    private TextField txtIngredient;

    @FXML
    private Text updateEmployeeinfor;

    @FXML
    private ImageView updateSupplierPane;

    @FXML
    void dontSaveSupplier(ActionEvent event) {

    }

    @FXML
    void updateSupplier(ActionEvent event) throws SQLException {
       String sid = sidtxt.getText();
       String newname = newSnametxt.getText();
       String addr = addresstxt.getText();
       int num = Integer.parseInt(mobiletxt.getText());
       String igre = txtIngredient.getText();
       String dopur = purchasetxt.getText();
       String amountdue = AmountDuetxt.getText();
       String dopay = dataOfPaymenttxt.getText();
       String PT = PaymentTypetxt.getText();
       String AP = AmountPaidtxt.getText();

        SupplierModel supplierModel = new SupplierModel(sid,newname,addr,num,igre,dopur,amountdue,dopay,PT,AP);
        boolean s = SupplierRepo.updateSupplier(supplierModel);

        if (s){new Alert(Alert.AlertType.CONFIRMATION,"Update Supplier Successfully!").show();}
        else {new Alert(Alert.AlertType.ERROR,"Somthing went Wrong!").show();}
    }

    @FXML
    void initialize() {
        assert AmountDuetxt != null : "fx:id=\"AmountDuetxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert AmountPaid != null : "fx:id=\"AmountPaid\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert AmountPaidtxt != null : "fx:id=\"AmountPaidtxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert PaymentTypetxt != null : "fx:id=\"PaymentTypetxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert SID != null : "fx:id=\"SID\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert amountDue != null : "fx:id=\"amountDue\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert dataOfPaymenttxt != null : "fx:id=\"dataOfPaymenttxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert dateOdPayment != null : "fx:id=\"dateOdPayment\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert dateOdPayment1 != null : "fx:id=\"dateOdPayment1\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert dateOdPurchase != null : "fx:id=\"dateOdPurchase\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert ingredient != null : "fx:id=\"ingredient\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert mobiletxt != null : "fx:id=\"mobiletxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert purchasetxt != null : "fx:id=\"purchasetxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert sidtxt != null : "fx:id=\"sidtxt\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert txtIngredient != null : "fx:id=\"txtIngredient\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert updateEmployeeinfor != null : "fx:id=\"updateEmployeeinfor\" was not injected: check your FXML file 'updateSupplier.fxml'.";
        assert updateSupplierPane != null : "fx:id=\"updateSupplierPane\" was not injected: check your FXML file 'updateSupplier.fxml'.";

    }

}
