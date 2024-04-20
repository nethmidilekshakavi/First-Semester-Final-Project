package lk.ijse.controller;

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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.Repository.CustomerRepo;
import lk.ijse.Repository.ReservationRepo;

public class Reservation {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text CNIC;

    @FXML
    private Text QOHtxt;

    @FXML
    private Text RCODE;

    @FXML
    private Text RID;

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
    private JFXComboBox<?> nicList;

    @FXML
    private ImageView orderPane;

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
    private Text reservationIDtxt;

    @FXML
    private JFXComboBox<?> reservationList;

    @FXML
    private Text title;

    @FXML
    private Text total;

    @FXML
    private Text totaltxt;

    @FXML
    private Text txtdesc;

    @FXML
    void backToDashboard(ActionEvent event) throws IOException {
        FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
    }

    public void initialize() {
        setDate();
        getCurrentOrderId();
       //getCustomerIds();
       // getItemCodes();
       // setCellValueFactory();
    }

  /*  private void getCustomerIds() {
        ObservableList<String> obList = FXCollections.observableArrayList();

        try {
            List<String> idList = CustomerRepo.getIds();

            for(String id : idList) {
                obList.add(id);
            }

            reservationList.setItems(obList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/

    private String generateNextOrderId(String currentId) {
        if(currentId != null) {
            String[] split = currentId.split("O");
            int idNum = Integer.parseInt(split[1]);
            return "O" + ++idNum;
        }
        return "O1";
    }

    private void getCurrentOrderId() {
        try {
            String currentId = ReservationRepo.getCurrentId();

            String nextOrderId = generateNextOrderId(currentId);
            RID.setText(nextOrderId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setDate() {
            LocalDate now = LocalDate.now();
            date.setText(String.valueOf(now));
        }





    }


