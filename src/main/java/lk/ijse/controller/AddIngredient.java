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
import lk.ijse.Model.IngredientModel;
import lk.ijse.Repository.CustomerRepo;
import lk.ijse.Repository.IngredientRepo;

public class AddIngredient {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView AddNewIngredientPage;

    @FXML
    private Text IID;

    @FXML
    private Text QOH;

    @FXML
    private TextField QOHtxt;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private Text desc;

    @FXML
    private TextField desctxt;

    @FXML
    private Text igreinor;

    @FXML
    private TextField iidtxt;

    @FXML
    private Text supplier;

    @FXML
    private TextField suppliertxt;

    @FXML
    void dontSaveIngredient(ActionEvent event) {
        Stage stage =(Stage)iidtxt.getScene().getWindow();
        stage.close();
    }

    @FXML
    void saveIngredinet(ActionEvent event) throws SQLException {

        String iid = iidtxt.getText();
        String desc = desctxt.getText();
        int qoh = Integer.parseInt(QOHtxt.getText());
        String supplier = suppliertxt.getText();

        IngredientModel ingredientModel = new  IngredientModel(iid,desc,qoh,supplier);
        boolean a = IngredientRepo.saveIngredient(ingredientModel);
        System.out.println(a);
        if (a){
            new Alert(Alert.AlertType.CONFIRMATION,"Ingredient saved successfully").show();

        }else {
            new Alert(Alert.AlertType.ERROR,"something went wrong").show();
        }
        Stage stage1 =(Stage)iidtxt.getScene().getWindow();
        stage1.close();
    }

    @FXML
    void initialize() {
        assert AddNewIngredientPage != null : "fx:id=\"AddNewIngredientPage\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert IID != null : "fx:id=\"IID\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert QOH != null : "fx:id=\"QOH\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert QOHtxt != null : "fx:id=\"QOHtxt\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert desc != null : "fx:id=\"desc\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert desctxt != null : "fx:id=\"desctxt\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert igreinor != null : "fx:id=\"igreinor\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert iidtxt != null : "fx:id=\"iidtxt\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert supplier != null : "fx:id=\"supplier\" was not injected: check your FXML file 'addIngredient.fxml'.";
        assert suppliertxt != null : "fx:id=\"suppliertxt\" was not injected: check your FXML file 'addIngredient.fxml'.";

    }

}
