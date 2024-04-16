package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

    @FXML
    void initialize() {
        assert CNIC != null : "fx:id=\"CNIC\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert QOHtxt != null : "fx:id=\"QOHtxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert RCODE != null : "fx:id=\"RCODE\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert RID != null : "fx:id=\"RID\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert btnPlaceOrder != null : "fx:id=\"btnPlaceOrder\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert btnback != null : "fx:id=\"btnback\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert btnnewCID != null : "fx:id=\"btnnewCID\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert colcode != null : "fx:id=\"colcode\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert coldesc != null : "fx:id=\"coldesc\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert colprice != null : "fx:id=\"colprice\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert colqty != null : "fx:id=\"colqty\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert coltotal != null : "fx:id=\"coltotal\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert datetxt != null : "fx:id=\"datetxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert desc != null : "fx:id=\"desc\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert nicList != null : "fx:id=\"nicList\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert orderPane != null : "fx:id=\"orderPane\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert orderTable != null : "fx:id=\"orderTable\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert pricetxt != null : "fx:id=\"pricetxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert qty != null : "fx:id=\"qty\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert qtyOnHand != null : "fx:id=\"qtyOnHand\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert qtytxt != null : "fx:id=\"qtytxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert reservationIDtxt != null : "fx:id=\"reservationIDtxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert reservationList != null : "fx:id=\"reservationList\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert totaltxt != null : "fx:id=\"totaltxt\" was not injected: check your FXML file 'Reservation.fxml'.";
        assert txtdesc != null : "fx:id=\"txtdesc\" was not injected: check your FXML file 'Reservation.fxml'.";

    }

}
