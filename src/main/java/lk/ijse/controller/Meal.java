package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Meal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView MealPane;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<?, ?> colmid;

    @FXML
    private TableColumn<?, ?> colname;

    @FXML
    private TableColumn<?, ?> colprice;

    @FXML
    private TableView<?> mealTable;

    @FXML
    private Text title;

    @FXML
    void addNewEmployee(ActionEvent event) {

    }

    @FXML
    void getReport(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert MealPane != null : "fx:id=\"MealPane\" was not injected: check your FXML file 'Meal.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Meal.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Meal.fxml'.";
        assert colmid != null : "fx:id=\"colmid\" was not injected: check your FXML file 'Meal.fxml'.";
        assert colname != null : "fx:id=\"colname\" was not injected: check your FXML file 'Meal.fxml'.";
        assert colprice != null : "fx:id=\"colprice\" was not injected: check your FXML file 'Meal.fxml'.";
        assert mealTable != null : "fx:id=\"mealTable\" was not injected: check your FXML file 'Meal.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Meal.fxml'.";

    }

}
