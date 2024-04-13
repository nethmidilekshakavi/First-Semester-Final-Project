package lk.ijse.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class MainForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane AP01;

    @FXML
    private AnchorPane AP010;

    @FXML
    private AnchorPane AP011;

    @FXML
    private AnchorPane AP02;

    @FXML
    private AnchorPane AP03;

    @FXML
    private AnchorPane AP04;

    @FXML
    private AnchorPane AP05;

    @FXML
    private AnchorPane AP06;

    @FXML
    private AnchorPane AP07;

    @FXML
    private AnchorPane AP08;

    @FXML
    private AnchorPane AP09;

    @FXML
    private AnchorPane MainFormPane;

    @FXML
    private ImageView Map;

    @FXML
    private ImageView PIC01;

    @FXML
    private ImageView PIC02;

    @FXML
    private ImageView PIC03;

    @FXML
    private ImageView PIC04;

    @FXML
    private ImageView PIC05;

    @FXML
    private ImageView PIC06;

    @FXML
    private ImageView PIC07;

    @FXML
    private ImageView PIC08;

    @FXML
    private ImageView PIC09;

    @FXML
    private ImageView PIC10;

    @FXML
    private ImageView PIC11;

    @FXML
    private ImageView Quection;

    @FXML
    private TextField SearchBar;

    @FXML
    private ImageView notification;

    @FXML
    private Button orderbtn1;

    @FXML
    private Button orderbtn2;

    @FXML
    private Button orderbtn3;

    @FXML
    private Button orderbtn4;

    @FXML
    private Button orderbtn5;

    @FXML
    private Button orderbtn6;

    @FXML
    private Button orderbtn7;

    @FXML
    private Button orderbtn8;

    @FXML
    private AnchorPane paneNew;

    @FXML
    private ImageView pieChart;

    @FXML
    private Text rs1;

    @FXML
    private Text rs2;

    @FXML
    private Text rs3;

    @FXML
    private Text rs4;

    @FXML
    private Text rs5;

    @FXML
    private Text rs6;

    @FXML
    private Text rs7;

    @FXML
    private Text rs8;

    @FXML
    private ImageView setting;

    @FXML
    private Text txt01;

    @FXML
    private Text txt02;

    @FXML
    private Text txt03;

    @FXML
    private Text txt1;

    @FXML
    private Text txt10;

    @FXML
    private Text txt11;

    @FXML
    private Text txt2;

    @FXML
    private Text txt3;

    @FXML
    private Text txt4;

    @FXML
    private Text txt5;

    @FXML
    private Text txt6;

    @FXML
    private Text txt7;

    @FXML
    private Text txt8;

    @FXML
    private Text txt9;

    @FXML
    void initialize() {
        assert AP01 != null : "fx:id=\"AP01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP010 != null : "fx:id=\"AP010\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP011 != null : "fx:id=\"AP011\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP02 != null : "fx:id=\"AP02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP03 != null : "fx:id=\"AP03\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP04 != null : "fx:id=\"AP04\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP05 != null : "fx:id=\"AP05\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP06 != null : "fx:id=\"AP06\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP07 != null : "fx:id=\"AP07\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP08 != null : "fx:id=\"AP08\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP09 != null : "fx:id=\"AP09\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert MainFormPane != null : "fx:id=\"MainFormPane\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert Map != null : "fx:id=\"Map\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC01 != null : "fx:id=\"PIC01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC02 != null : "fx:id=\"PIC02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC03 != null : "fx:id=\"PIC03\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC04 != null : "fx:id=\"PIC04\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC05 != null : "fx:id=\"PIC05\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC06 != null : "fx:id=\"PIC06\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC07 != null : "fx:id=\"PIC07\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC08 != null : "fx:id=\"PIC08\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC09 != null : "fx:id=\"PIC09\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC10 != null : "fx:id=\"PIC10\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC11 != null : "fx:id=\"PIC11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert Quection != null : "fx:id=\"Quection\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert SearchBar != null : "fx:id=\"SearchBar\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert notification != null : "fx:id=\"notification\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn1 != null : "fx:id=\"orderbtn1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn2 != null : "fx:id=\"orderbtn2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn3 != null : "fx:id=\"orderbtn3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn4 != null : "fx:id=\"orderbtn4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn5 != null : "fx:id=\"orderbtn5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn6 != null : "fx:id=\"orderbtn6\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn7 != null : "fx:id=\"orderbtn7\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orderbtn8 != null : "fx:id=\"orderbtn8\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert paneNew != null : "fx:id=\"paneNew\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pieChart != null : "fx:id=\"pieChart\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs1 != null : "fx:id=\"rs1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs2 != null : "fx:id=\"rs2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs3 != null : "fx:id=\"rs3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs4 != null : "fx:id=\"rs4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs5 != null : "fx:id=\"rs5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs6 != null : "fx:id=\"rs6\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs7 != null : "fx:id=\"rs7\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs8 != null : "fx:id=\"rs8\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert setting != null : "fx:id=\"setting\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt01 != null : "fx:id=\"txt01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt02 != null : "fx:id=\"txt02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt03 != null : "fx:id=\"txt03\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt10 != null : "fx:id=\"txt10\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt11 != null : "fx:id=\"txt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt2 != null : "fx:id=\"txt2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt3 != null : "fx:id=\"txt3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt4 != null : "fx:id=\"txt4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt5 != null : "fx:id=\"txt5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt6 != null : "fx:id=\"txt6\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt7 != null : "fx:id=\"txt7\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt8 != null : "fx:id=\"txt8\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt9 != null : "fx:id=\"txt9\" was not injected: check your FXML file 'mainForm.fxml'.";

    }

}
