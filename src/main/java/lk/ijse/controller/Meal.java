package lk.ijse.controller;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Model.MealModel;
import lk.ijse.Model.TM.MealTM;
import lk.ijse.Repository.MealRepo;

public class Meal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnPrint;

    @FXML
    private TableColumn<MealTM, String> colmid;

    @FXML
    private TableColumn<MealTM, String> colname;

    @FXML
    private TableColumn<MealTM, String> colprice;
    @FXML
    private TableColumn<MealTM, ImageView> colimage;

    @FXML
    private ImageView mealPane;

    @FXML
    private TableView<MealTM> mealTable;

    @FXML
    private TableColumn<MealTM, JFXButton> colDelete;

    @FXML
    private TableColumn<MealTM, JFXButton> colUpdate;

    @FXML
    private Text title;

   //    Image meal = new Image(MealModel.getMeal());
    //   ImageView imageView = new ImageView(meal);

    @FXML
    void addNewEmployee(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/addMeal.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("ADD Meal");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void getReport(ActionEvent event) {

    }


    public void loadvalues() throws SQLException {
        ArrayList<MealModel> allMeal = MealRepo.getAll();
        ObservableList<MealTM>observableList = FXCollections.observableArrayList();
    //   Image image = new Image(MealModel.getMeal());
     //   ImageView imageView = new ImageView(meal);

        for (int i = 0; i < allMeal.size(); i++){
         //  Image image = new Image();
        //   ImageView imageView = new ImageView(meal);
            MealTM mealTM = new MealTM(allMeal.get(i).getMID(), allMeal.get(i).getName(), allMeal.get(i).getPrice(), new JFXButton("Upadte"), new JFXButton("Delete"));
            observableList.add(mealTM);
            mealTable.setItems(observableList);
        }

        for (int i = 0; i < allMeal.size(); i++){
            observableList.get(i).getUpdate().setStyle("-fx-background-color: rgba(96,120,205,0.97)");
            observableList.get(i).getDelete().setStyle("-fx-background-color: rgba(175,108,108,1)");
            observableList.get(i).getUpdate().setTextFill(Color.WHITE);
            observableList.get(i).getDelete().setTextFill(Color.WHITE);
        }
        for (int i=0 ;i<observableList.size();i++){
            String id =observableList.get(i).getMID();
            String name =observableList.get(i).getName();
            String price =observableList.get(i).getPrice();
          //  String meal = String.valueOf(observableList.get(i).getMeal());

            observableList.get(i).getUpdate();

            observableList.get(i).getDelete().setOnAction(actionEvent -> {
                try {
                    boolean b = MealRepo.delete(id);
                    if (b){
                        new Alert(Alert.AlertType.CONFIRMATION,"Meal Deleted");
                        loadvalues();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
            observableList.get(i).getUpdate().setOnAction(actionEvent -> {
                Parent parent = null;
                try {
                    parent = FXMLLoader.load(getClass().getResource("/view/updateMeal.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene =new Scene(parent);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Update Meal");
                stage.centerOnScreen();
                stage.show();
            });
        }

    }
    public void setValues() {
        colmid.setCellValueFactory(new PropertyValueFactory<>("MID"));
        colname.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colprice.setCellValueFactory(new PropertyValueFactory<>("Price"));
        colimage.setCellValueFactory(new PropertyValueFactory<>("Meal"));
        colDelete.setCellValueFactory(new PropertyValueFactory<MealTM,JFXButton>("Delete"));
        colUpdate.setCellValueFactory(new PropertyValueFactory<MealTM,JFXButton>("Update"));
    }

        @FXML
        void initialize () throws SQLException {
            assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Meal.fxml'.";
            assert btnPrint != null : "fx:id=\"btnPrint\" was not injected: check your FXML file 'Meal.fxml'.";
            assert colmid != null : "fx:id=\"colmid\" was not injected: check your FXML file 'Meal.fxml'.";
            assert colname != null : "fx:id=\"colname\" was not injected: check your FXML file 'Meal.fxml'.";
            assert colprice != null : "fx:id=\"colprice\" was not injected: check your FXML file 'Meal.fxml'.";
            assert mealPane != null : "fx:id=\"mealPane\" was not injected: check your FXML file 'Meal.fxml'.";
            assert mealTable != null : "fx:id=\"mealTable\" was not injected: check your FXML file 'Meal.fxml'.";
            assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Meal.fxml'.";
            assert colimage != null:"fx:id=\"colimage\" was not injected: check your FXML file 'Meal.fxml'.";
            loadvalues();
            setValues();

        }
    }


