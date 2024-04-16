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
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> Ctable;

    @FXML
    private ImageView CustomerPane;

    @FXML
    private Text TITLE;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnprint;

    @FXML
    private TableColumn<?, ?> coladdress;

    @FXML
    private TableColumn<?, ?> coldelete;

    @FXML
    private TableColumn<?, ?> colemail;

    @FXML
    private TableColumn<?, ?> colfname;

    @FXML
    private TableColumn<?, ?> collname;

    @FXML
    private TableColumn<?, ?> colnic;

    @FXML
    private TableColumn<?, ?> colnumber;

    @FXML
    private TableColumn<?, ?> colupdate;

    @FXML
    void addNewCustomer(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/saveCustomerForm.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Customer Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void initialize() {
        assert Ctable != null : "fx:id=\"Ctable\" was not injected: check your FXML file 'Customer.fxml'.";
        assert CustomerPane != null : "fx:id=\"CustomerPane\" was not injected: check your FXML file 'Customer.fxml'.";
        assert TITLE != null : "fx:id=\"TITLE\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnadd != null : "fx:id=\"btnadd\" was not injected: check your FXML file 'Customer.fxml'.";
        assert btnprint != null : "fx:id=\"btnprint\" was not injected: check your FXML file 'Customer.fxml'.";
        assert coladdress != null : "fx:id=\"coladdress\" was not injected: check your FXML file 'Customer.fxml'.";
        assert coldelete != null : "fx:id=\"coldelete\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colemail != null : "fx:id=\"colemail\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colfname != null : "fx:id=\"colfname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert collname != null : "fx:id=\"collname\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colnic != null : "fx:id=\"colnic\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colnumber != null : "fx:id=\"colnumber\" was not injected: check your FXML file 'Customer.fxml'.";
        assert colupdate != null : "fx:id=\"colupdate\" was not injected: check your FXML file 'Customer.fxml'.";

    }

}
