package lk.ijse.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

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
    private ImageView customerpic;

    @FXML
    private ImageView employeepic;

    @FXML
    private ImageView home;

    @FXML
    private ImageView homepic;

    @FXML
    private ImageView ingredientpic;

    @FXML
    private ImageView ingrepic;

    @FXML
    private ImageView mealpic;

    @FXML
    private ImageView orderpic;

    @FXML
    private AnchorPane owner;

    @FXML
    private ImageView reportpic;

    @FXML
    private ImageView supplierpic;

    @FXML
    void EmployeeOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Employee.fxml"));
        Emptypane.getChildren().setAll(parent);
    }



    @FXML
    void IngredientOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Ingredients.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void MealOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Meal.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void ReportOnAction(ActionEvent event) {

    }

    @FXML
    void ReservationOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Reservation.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void SupplierOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Supplier.fxml"));
        Emptypane.getChildren().setAll(parent);

    }

    @FXML
    void customerOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/Customer.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void dashboardOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/mainForm.fxml"));
        Emptypane.getChildren().setAll(parent);
    }

    @FXML
    void initialize() {
        assert Emptypane != null : "fx:id=\"Emptypane\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btnReport != null : "fx:id=\"btnReport\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btncustomer != null : "fx:id=\"btncustomer\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btndashboard != null : "fx:id=\"btndashboard\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btnemployee != null : "fx:id=\"btnemployee\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btningredients != null : "fx:id=\"btningredients\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btnmeal != null : "fx:id=\"btnmeal\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btnreservation != null : "fx:id=\"btnreservation\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert btnsupplier != null : "fx:id=\"btnsupplier\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert buttonSet != null : "fx:id=\"buttonSet\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert customerpic != null : "fx:id=\"customerpic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert employeepic != null : "fx:id=\"employeepic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert homepic != null : "fx:id=\"homepic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert ingredientpic != null : "fx:id=\"ingredientpic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert ingrepic != null : "fx:id=\"ingrepic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert mealpic != null : "fx:id=\"mealpic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert orderpic != null : "fx:id=\"orderpic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert owner != null : "fx:id=\"owner\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert reportpic != null : "fx:id=\"reportpic\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert supplierpic != null : "fx:id=\"supplierpic\" was not injected: check your FXML file 'dashboard.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Parent root =null;
        try {
            root = FXMLLoader.load(getClass().getResource("/view/mainForm.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Emptypane.getChildren().clear();
        Emptypane.getChildren().add(root);
    }
}
