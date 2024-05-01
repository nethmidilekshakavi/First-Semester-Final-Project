package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;

import java.io.IOException;
import java.net.URL;
import java.rmi.Remote;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Model.MealModel;
import lk.ijse.Model.OrderDetailsModel;
import lk.ijse.Model.ReservationModel;
import lk.ijse.Model.TM.OrderTM;
import lk.ijse.Model.TM.ReservationTM;
import lk.ijse.Repository.CustomerRepo;
import lk.ijse.Repository.MealRepo;
import lk.ijse.Repository.OrderDetailRepo;
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
    private TableView<ReservationTM> orderTable;

    @FXML
    private Text price;

    @FXML
    private Text qty;

    @FXML
    private Text qtyOnHand;

    @FXML
    private TextField qtytxt;

    @FXML
    private TableColumn<ReservationTM, JFXButton> remove;

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

    @FXML
    private Text ptxt;


    private ObservableList<OrderTM> oblist = FXCollections.observableArrayList();
    ObservableList<ReservationTM> observableList = FXCollections.observableArrayList();

    public void initialize() {
        setDate();
        //getCurrentOrderId();
        getCustomerIds();
        getItemCodes();
        setCellValueFactory();
    }

    private void setCellValueFactory() {
        colcode.setCellValueFactory(new PropertyValueFactory<>("code"));
        coldesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        colqty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        colprice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        coltotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        remove.setCellValueFactory(new PropertyValueFactory<ReservationTM,JFXButton>("Remove"));
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

  /*  private void getCurrentOrderId() {
        try {
            String currentId = ReservationRepo.getCurrentId();

            String nextOrderId = generateNextOrderId(currentId);
            reservationIDtxt.setText(nextOrderId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
 /*   private String generateNextOrderId(String currentId) {
        if(currentId != null) {
            String[] split = currentId.split("O");
            int idNum = Integer.parseInt(split[1]);
            return "O" + ++idNum;
        }
        return "O1";
    }*/

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
                ptxt.setText(mealModel.getPrice());
            }

            qtytxt.requestFocus();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    double alltotal = 0 ;
    @FXML
    void btnAddToCartOnAction(ActionEvent event) {
        String code = reservationList.getValue();
        String des = txtdesc.getText();
        int qty = Integer.parseInt(qtytxt.getText());
        System.out.println(ptxt.getText());
        double price = Double.parseDouble((ptxt.getText()));

        double total = qty*price;
        alltotal +=   total;
        totaltxt.setText(String.valueOf(alltotal));
        observableList.add(new ReservationTM(code,des,qty,price,total,new JFXButton("Remove")));

        orderTable.setItems(observableList);

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
    String orderid = reservationIDtxt.getText();
    String cusid = nicList.getValue();
    String date = String.valueOf(LocalDate.now());
    double t = alltotal;
        String des = txtdesc.getText();
    String time = String.valueOf(LocalTime.now());

    new ReservationModel(0,Integer.parseInt(cusid),date,des,time,String.valueOf(t),1,1);
        try {
            ReservationRepo.saveReservation(new ReservationModel(0,Integer.parseInt(cusid),date,des,time,String.valueOf(t),1,1));
            new Alert(Alert.AlertType.CONFIRMATION,"Saved to reservation").show();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < observableList.size(); i++) {
            String q = "0";
            String w  = observableList.get(i).getCode();
            String e = String.valueOf(observableList.get(i).getQty());
            String r = String.valueOf(observableList.get(i).getUnitPrice());
            OrderDetailRepo.saveOrderDetail(new OrderDetailsModel(q,w,e,r));

        }

    }

   private  void  caculateNetTotal(){
        String total = String.valueOf(0);
        for (int i = 0; i < orderTable.getItems().size(); i++){
            total += (String)coltotal.getCellData(i);
        }
        totaltxt.setText(total);
   }



}
