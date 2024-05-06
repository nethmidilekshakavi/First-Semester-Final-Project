package lk.ijse.controller;

import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import lk.ijse.Model.MealModel;
import lk.ijse.Repository.MealRepo;

public class AddMeal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addNewMeal;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private ImageView imageview;

    @FXML
    private Text mealInfor;

    @FXML
    private Text mid;

    @FXML
    private TextField midtxt;

    @FXML
    private Text name;

    @FXML
    private TextField nametxt;

    @FXML
    private Text price;

    @FXML
    private TextField pricetxt;
  //  String url;
//   String imagePath = null;

    @FXML
    void dontSaveMeal(ActionEvent event) {
        Stage stage = (Stage)midtxt.getScene().getWindow();
        stage.close();
    }

 /*  @FXML
    void imageOnClick(MouseEvent event) {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image");
        File file = fileChooser.showOpenDialog(stage);
        if(file != null){
            url = file.toURI().toString();
            Image image = new Image(url);
            imagePath = file.getPath();
            imageview.setImage(image);
        }

    }*/

    @FXML
    void saveMeal(ActionEvent event) throws SQLException {
        String mid = midtxt.getText();
        String name = nametxt.getText();
        String price = pricetxt.getText();



        MealModel mealModel = new MealModel(mid, name, price);
        boolean b = MealRepo.saveMeal(mealModel);
        if (b) {
            new Alert(Alert.AlertType.CONFIRMATION, "Meal Saves Successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "something went Wrong").show();
        }
    }
    @FXML
    void clearOnAction(ActionEvent event) {
        clear();
    }

    public void clear(){
        midtxt.clear();
        nametxt.clear();
        pricetxt.clear();
    }


    @FXML
    void initialize() {
        assert addNewMeal != null : "fx:id=\"addNewMeal\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert imageview != null : "fx:id=\"imageview\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert mealInfor != null : "fx:id=\"mealInfor\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert mid != null : "fx:id=\"mid\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert midtxt != null : "fx:id=\"midtxt\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert nametxt != null : "fx:id=\"nametxt\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'addMeal.fxml'.";
        assert pricetxt != null : "fx:id=\"pricetxt\" was not injected: check your FXML file 'addMeal.fxml'.";

    }

}
