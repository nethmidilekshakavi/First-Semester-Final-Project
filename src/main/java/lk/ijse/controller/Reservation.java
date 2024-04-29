package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Model.MealModel;
import lk.ijse.Model.TM.OrderTM;
import lk.ijse.Repository.CustomerRepo;
import lk.ijse.Repository.MealRepo;
import lk.ijse.Repository.ReservationRepo;

public class Reservation {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text CNIC;

    @FXML
    private ImageView pane;


    @FXML
    private Text QOHtxt;

    @FXML
    private Text RCODE;

    @FXML
    private Text RID;

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    private Button btnPlaceOrder;

    @FXML
    private Button btnback;

    @FXML
    private Button btnnewCID;

    @FXML
    private TableColumn<?, ?> colcode;

    @FXML
    private TableColumn<?, ?> coldesc;

    @FXML
    private TableColumn<?, ?> colprice;

    @FXML
    private TableColumn<?, ?> colqty;

    @FXML
    private TableColumn<?, ?> coltotal;

    @FXML
    private Text date;

    @FXML
    private Text datetxt;

    @FXML
    private Text desc;

    @FXML
    private JFXComboBox<String> nicList;

    @FXML
    private TableView<?> orderTable;

    @FXML
    private Text price;

    @FXML
    private Text pricetxt;

    @FXML
    private Text qty;

    @FXML
    private Text qtyOnHand;

    @FXML
    private TextField qtytxt;

    @FXML
    private TableColumn<?, ?> remove;

    @FXML
    private Text reservationIDtxt;

    @FXML
    private JFXComboBox<String> reservationList;

    @FXML
    private Text title;

    @FXML
    private Text total;

    @FXML
    private Text totaltxt;

    @FXML
    private Text txtdesc;
    @FXML
    private Text cusName;

    @FXML
    private Text nametxt;


    private ObservableList<OrderTM> oblist = FXCollections.observableArrayList();

    public void initialize() {
        setDate();
        getCurrentOrderId();
        getCustomerIds();
        getItemCodes();
        setCellValueFactory();
    }

    private void setCellValueFactory() {

    }

    private void getItemCodes() {
        ObservableList<String> oblist = FXCollections.observableArrayList();
        try {
            List<String> mealid = MealRepo.getIds();
             for (String id :mealid){
                 oblist.add(id);
             }

             reservationList.setItems(oblist);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void getCurrentOrderId() {
        try {
            String currentId = ReservationRepo.getCurrentId();

            String nextOrderId = generateNextOrderId(currentId);
            reservationIDtxt.setText(nextOrderId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private String generateNextOrderId(String currentId) {
        if(currentId != null) {
            String[] split = currentId.split("O");
            int idNum = Integer.parseInt(split[1]);
            return "O" + ++idNum;
        }
        return "O1";
    }

    private void getCustomerIds() {
        ObservableList<String> idlist = FXCollections.observableArrayList();
        try{
            List<String> cid1 = CustomerRepo.getIds();

            for (String cid : cid1){
                idlist.add(cid);
            }

            nicList.setItems(idlist);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        date.setText(String.valueOf(now));
    }

    @FXML
    void comboCustomerList(ActionEvent event) {
        String cid = nicList.getValue();
        try{
            CustomerModel customerModel = CustomerRepo.searchById(cid);
            nametxt.setText(customerModel.getFirst_Name());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void comboMealList(ActionEvent event) {
        String mid = reservationList.getValue();
        try{
            MealModel mealModel = MealRepo.searchById(mid);
            if(mealModel != null){
                txtdesc.setText(mealModel.getName());
             //   QOHtxt.setText(mealModel.);
                pricetxt.setText(mealModel.getPrice());
            }

            qtytxt.requestFocus();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    void btnNewCustomerOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/addNewCustomer.fxml"));
        Scene scene =new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Customer Form");
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }



}
