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
import javafx.stage.Stage;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Model.SupplierModel;
import lk.ijse.Repository.CustomerRepo;
import lk.ijse.Repository.SupplierRepo;

public class AddNewSupplier {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView AddNewSupplierPage;

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
    private Text SupplierInfor;

    @FXML
    private Text address;

    @FXML
    private TextField addresstxt;

    @FXML
    private Text amountDue;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

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
    private TextField nametxt;

    @FXML
    private TextField purchasetxt;

    @FXML
    private TextField sidtxt;

    @FXML
    private TextField txtIngredient;

    @FXML
    void dontSaveSupplier(ActionEvent event) {
        Stage stage =(Stage)sidtxt.getScene().getWindow();
        stage.close();

        Stage stage1 =(Stage)sidtxt.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void saveSupplier(ActionEvent event) throws SQLException {
        String sid = sidtxt.getText();
        String name = nametxt.getText();
        String address = addresstxt.getText();
        int mobile = Integer.parseInt(mobiletxt.getText());
        String ingredient = txtIngredient.getText();
        String dateOfPurchase = purchasetxt.getText();
        String AmountDue = AmountDuetxt.getText();
        String dateOfPayment = dataOfPaymenttxt.getText();
        String paymentType = PaymentTypetxt.getText();
        String amountPaid = AmountPaidtxt.getText();



       SupplierModel supplierModel = new SupplierModel(sid,name,address,mobile,ingredient,dateOfPurchase,AmountDue,dateOfPayment,paymentType,amountPaid);
        boolean a = SupplierRepo.saveSupplier(supplierModel);
        System.out.println(a);
        if (a){
            new Alert(Alert.AlertType.CONFIRMATION,"Supplier saved successfully").show();
        }else {
            new Alert(Alert.AlertType.ERROR,"something went wrong").show();
        }
    }



    @FXML
    void initialize() {
        assert AddNewSupplierPage != null : "fx:id=\"AddNewSupplierPage\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert AmountDuetxt != null : "fx:id=\"AmountDuetxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert AmountPaid != null : "fx:id=\"AmountPaid\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert AmountPaidtxt != null : "fx:id=\"AmountPaidtxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert PaymentTypetxt != null : "fx:id=\"PaymentTypetxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert SID != null : "fx:id=\"SID\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert SupplierInfor != null : "fx:id=\"SupplierInfor\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert amountDue != null : "fx:id=\"amountDue\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert dataOfPaymenttxt != null : "fx:id=\"dataOfPaymenttxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert dateOdPayment != null : "fx:id=\"dateOdPayment\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert dateOdPayment1 != null : "fx:id=\"dateOdPayment1\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert dateOdPurchase != null : "fx:id=\"dateOdPurchase\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert ingredient != null : "fx:id=\"ingredient\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert mobiletxt != null : "fx:id=\"mobiletxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert nametxt != null : "fx:id=\"nametxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert purchasetxt != null : "fx:id=\"purchasetxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert sidtxt != null : "fx:id=\"sidtxt\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";
        assert txtIngredient != null : "fx:id=\"txtIngredient\" was not injected: check your FXML file 'AddNewSupplier.fxml'.";


    }

}
