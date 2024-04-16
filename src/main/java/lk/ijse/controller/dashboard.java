package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class dashboard implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Emptypane;

    @FXML
    private Button btnReport;

    @FXML
    private Button btncustomer;

    @FXML
    private Button btndashboard;

    @FXML
    private Button btnemployee;

    @FXML
    private Button btningredients;

    @FXML
    private Button btnmeal;

    @FXML
    private Button btnreservation;

    @FXML
    private Button btnsupplier;

    @FXML
    private AnchorPane buttonSet;

    @FXML
    void EmployeeOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/Employee.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void IngredientOnAction(ActionEvent event) {

    }

    @FXML
    void MealOnAction(ActionEvent event) {

    }

    @FXML
    void ReportOnAction(ActionEvent event) {

    }

    @FXML
    void ReservationOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/Reservation.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void SupplierOnAction(ActionEvent event) {

    }

    @FXML
    void customerOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/Customer.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void dashboardOnAction(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("/view/mainForm.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    void initialize() {
        assert Emptypane != null : "fx:id=\"Emptypane\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert buttonSet != null : "fx:id=\"buttonSet\" was not injected: check your FXML file 'dashboard.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/view/mainForm.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Emptypane.getChildren().clear();
        Emptypane.getChildren().add(root);
    }


}
