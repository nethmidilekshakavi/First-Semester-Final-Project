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
import lk.ijse.Repository.CustomerRepo;

public class AddNewCustomer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView AddNewCustomerPage;

    @FXML
    private Text CID;

    @FXML
    private TextField Emailtxt;

    @FXML
    private Text address;

    @FXML
    private TextField addresstxt;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private TextField cidtxt;

    @FXML
    private Text customerinfor;

    @FXML
    private Text email;

    @FXML
    private Text fname;

    @FXML
    private TextField fnametxt;

    @FXML
    private Text lname;

    @FXML
    private TextField lnametxt;

    @FXML
    private Text nic;

    @FXML
    private TextField nictxt;

    @FXML
    private Text num;

    @FXML
    private TextField numtxt;

    @FXML
    void dontSaveCustomer(ActionEvent event) {
        Stage stage =(Stage)cidtxt.getScene().getWindow();
        stage.close();

        Stage stage1 =(Stage)cidtxt.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void saveCustomer(ActionEvent event) throws SQLException {

        String cid = cidtxt.getText();
        String nic = nictxt.getText();
        String fname = fnametxt.getText();
        String lname = lnametxt.getText();
        String address = addresstxt.getText();
        int mobile = Integer.parseInt(numtxt.getText());
        String email = Emailtxt.getText();

        CustomerModel customerModel=new CustomerModel(cid,nic,fname,lname,address,mobile,email);
        boolean a = CustomerRepo.savecustomer(customerModel);
        System.out.println(a);
        if (a){
            new Alert(Alert.AlertType.CONFIRMATION,"customer saved successfully").show();

        }else {
            new Alert(Alert.AlertType.ERROR,"something went wrong").show();
        }

    }

    @FXML
    void initialize() {
        assert AddNewCustomerPage != null : "fx:id=\"AddNewCustomerPage\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert CID != null : "fx:id=\"CID\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert Emailtxt != null : "fx:id=\"Emailtxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert addresstxt != null : "fx:id=\"addresstxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert cidtxt != null : "fx:id=\"cidtxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert customerinfor != null : "fx:id=\"customerinfor\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert fname != null : "fx:id=\"fname\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert fnametxt != null : "fx:id=\"fnametxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert lname != null : "fx:id=\"lname\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert lnametxt != null : "fx:id=\"lnametxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert nic != null : "fx:id=\"nic\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert nictxt != null : "fx:id=\"nictxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert num != null : "fx:id=\"num\" was not injected: check your FXML file 'addNewCustomer.fxml'.";
        assert numtxt != null : "fx:id=\"numtxt\" was not injected: check your FXML file 'addNewCustomer.fxml'.";

    }

}
