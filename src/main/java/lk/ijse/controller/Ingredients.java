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

public class Ingredients {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView IngredientPage;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<?, ?> colDesc;

    @FXML
    private TableColumn<?, ?> colIid;

    @FXML
    private TableColumn<?, ?> colQOh;

    @FXML
    private TableColumn<?, ?> colSID;

    @FXML
    private TableColumn<?, ?> coldelete;

    @FXML
    private TableColumn<?, ?> colupdate;

    @FXML
    private TableView<?> ingredientTable;

    @FXML
    private Text title;

    @FXML
    void addNewEmployee(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/addIngredient.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Ingredient Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert IngredientPage != null : "fx:id=\"IngredientPage\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colDesc != null : "fx:id=\"colDesc\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colIid != null : "fx:id=\"colIid\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colQOh != null : "fx:id=\"colQOh\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colSID != null : "fx:id=\"colSID\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert coldelete != null : "fx:id=\"coldelete\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert colupdate != null : "fx:id=\"colupdate\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert ingredientTable != null : "fx:id=\"ingredientTable\" was not injected: check your FXML file 'Ingredients.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Ingredients.fxml'.";

    }

}
