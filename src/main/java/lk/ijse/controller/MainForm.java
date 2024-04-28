package lk.ijse.controller;

import java.net.URL;
import java.sql.Time;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import static sun.awt.util.PerformanceLogger.setTime;

public class MainForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane AP01;

    @FXML
    private AnchorPane AP02;

    @FXML
    private AnchorPane AP03;

    @FXML
    private AnchorPane AP04;

    @FXML
    private Circle C4;

    @FXML
    private Circle C41;

    @FXML
    private Circle C42;

    @FXML
    private Circle C421;

    @FXML
    private Circle C4211;

    @FXML
    private AnchorPane MainFormPane;

    @FXML
    private ImageView PIC01;

    @FXML
    private ImageView PIC02;

    @FXML
    private ImageView PIC03;

    @FXML
    private ImageView PIC04;

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
    private AnchorPane buttionpane;

    @FXML
    private Circle c1;

    @FXML
    private Circle c11;

    @FXML
    private Text c1txt;

    @FXML
    private Text c1txt1;

    @FXML
    private Text c1txt11;

    @FXML
    private Text c1txt111;

    @FXML
    private Text c1txt1111;

    @FXML
    private Circle c2;

    @FXML
    private Text chainesfood;

    @FXML
    private Text chainesfood1;

    @FXML
    private Text chainesfood11;

    @FXML
    private ImageView chart;

    @FXML
    private ImageView chart1;

    @FXML
    private ImageView chart11;

    @FXML
    private Text dailyTrendingMenu;

    @FXML
    private Text date;

    @FXML
    private ImageView h1;

    @FXML
    private ImageView h2;

    @FXML
    private ImageView h3;

    @FXML
    private Text hello;

    @FXML
    private Text interesttxt;

    @FXML
    private Text interesttxt1;

    @FXML
    private Text interesttxt11;

    @FXML
    private Text juicetxt;

    @FXML
    private Text juicetxt1;

    @FXML
    private Text juicetxt11;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @FXML
    private Text liketxt;

    @FXML
    private Text liketxt1;

    @FXML
    private Text liketxt11;

    @FXML
    private ImageView line3;

    @FXML
    private ImageView linec1;

    @FXML
    private ImageView linec2;

    @FXML
    private ImageView morearrow;

    @FXML
    private Text msg5;

    @FXML
    private Text msg8;

    @FXML
    private Text msg81;

    @FXML
    private ImageView notification;

    @FXML
    private ImageView orangecake;

    @FXML
    private Text p180;

    @FXML
    private Text p1801;

    @FXML
    private Text p18011;

    @FXML
    private Text p760;

    @FXML
    private Text p7601;

    @FXML
    private Text p76011;

    @FXML
    private Text p760111;

    @FXML
    private Text p7601111;

    @FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;

    @FXML
    private AnchorPane pane3;

    @FXML
    private AnchorPane pane4;

    @FXML
    private AnchorPane pane5;

    @FXML
    private AnchorPane paneNew;

    @FXML
    private Text perera;

    @FXML
    private ImageView persantage180;

    @FXML
    private ImageView persatage80;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private ImageView pic3;

    @FXML
    private ImageView pic4;

    @FXML
    private ImageView pic5;

    @FXML
    private ImageView pwesatage30;

    @FXML
    private Text rs1;

    @FXML
    private Text rs2;

    @FXML
    private Text rs3;

    @FXML
    private Text rs4;

    @FXML
    private ImageView searchicon;

    @FXML
    private ImageView serachpic;

    @FXML
    private ImageView setting;

    @FXML
    private ImageView sk1113;

    @FXML
    private ImageView sk11131;

    @FXML
    private ImageView sk111311;

    @FXML
    private ImageView sk1113111;

    @FXML
    private ImageView sk111312;

    @FXML
    private ImageView sk11132;

    @FXML
    private ImageView star1;

    @FXML
    private ImageView star11;

    @FXML
    private ImageView star111;

    @FXML
    private ImageView star1111;

    @FXML
    private ImageView star11111;

    @FXML
    private ImageView star1112;

    @FXML
    private ImageView star112;

    @FXML
    private ImageView star12;

    @FXML
    private ImageView star13;

    @FXML
    private ImageView star131;

    @FXML
    private ImageView star1311;

    @FXML
    private ImageView star13111;

    @FXML
    private ImageView star1312;

    @FXML
    private ImageView star13121;

    @FXML
    private ImageView star131211;

    @FXML
    private ImageView star132;

    @FXML
    private ImageView star1321;

    @FXML
    private ImageView star13211;

    @FXML
    private ImageView star14;

    @FXML
    private ImageView starnew1;

    @FXML
    private ImageView starnew11;

    @FXML
    private ImageView starnew12;

    @FXML
    private ImageView starnew121;

    @FXML
    private ImageView starnew1211;

    @FXML
    private ImageView starnew13;

    @FXML
    private ImageView starnew131;

    @FXML
    private Text time;

    @FXML
    private Text total;

    @FXML
    private Text total1;

    @FXML
    private Text total11;

    @FXML
    private Text totaltxt;

    @FXML
    private Text totaltxt1;

    @FXML
    private Text totaltxt11;

    @FXML
    private Text txt01;

    @FXML
    private Text txt02;

    @FXML
    private Text txt1;

    @FXML
    private Text txt12;

    @FXML
    private Text txt121;

    @FXML
    private Text txt1211;

    @FXML
    private Text txt12111;

    @FXML
    private Text txt2;

    @FXML
    private Text txt3;

    @FXML
    private Text txt4;

    @FXML
    private Text txtC;

    @FXML
    private Text txtC1;

    @FXML
    private Text txtC2;

    @FXML
    private Text txtC21;

    @FXML
    private Text txtC211;

    @FXML
    private ImageView user;

    @FXML
    private ImageView watermelon;

    @FXML
    void initialize() {
        setDate();
        assert AP01 != null : "fx:id=\"AP01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP02 != null : "fx:id=\"AP02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP03 != null : "fx:id=\"AP03\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert AP04 != null : "fx:id=\"AP04\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert C4 != null : "fx:id=\"C4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert C41 != null : "fx:id=\"C41\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert C42 != null : "fx:id=\"C42\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert C421 != null : "fx:id=\"C421\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert C4211 != null : "fx:id=\"C4211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert MainFormPane != null : "fx:id=\"MainFormPane\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC01 != null : "fx:id=\"PIC01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC02 != null : "fx:id=\"PIC02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC03 != null : "fx:id=\"PIC03\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC04 != null : "fx:id=\"PIC04\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC09 != null : "fx:id=\"PIC09\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC10 != null : "fx:id=\"PIC10\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert PIC11 != null : "fx:id=\"PIC11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert Quection != null : "fx:id=\"Quection\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert SearchBar != null : "fx:id=\"SearchBar\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert buttionpane != null : "fx:id=\"buttionpane\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c11 != null : "fx:id=\"c11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1txt != null : "fx:id=\"c1txt\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1txt1 != null : "fx:id=\"c1txt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1txt11 != null : "fx:id=\"c1txt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1txt111 != null : "fx:id=\"c1txt111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c1txt1111 != null : "fx:id=\"c1txt1111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chainesfood != null : "fx:id=\"chainesfood\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chainesfood1 != null : "fx:id=\"chainesfood1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chainesfood11 != null : "fx:id=\"chainesfood11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chart != null : "fx:id=\"chart\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chart1 != null : "fx:id=\"chart1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert chart11 != null : "fx:id=\"chart11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert dailyTrendingMenu != null : "fx:id=\"dailyTrendingMenu\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert h1 != null : "fx:id=\"h1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert h2 != null : "fx:id=\"h2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert h3 != null : "fx:id=\"h3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert hello != null : "fx:id=\"hello\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert interesttxt != null : "fx:id=\"interesttxt\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert interesttxt1 != null : "fx:id=\"interesttxt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert interesttxt11 != null : "fx:id=\"interesttxt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert juicetxt != null : "fx:id=\"juicetxt\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert juicetxt1 != null : "fx:id=\"juicetxt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert juicetxt11 != null : "fx:id=\"juicetxt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert lblDate != null : "fx:id=\"lblDate\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert liketxt != null : "fx:id=\"liketxt\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert liketxt1 != null : "fx:id=\"liketxt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert liketxt11 != null : "fx:id=\"liketxt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert line3 != null : "fx:id=\"line3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert linec1 != null : "fx:id=\"linec1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert linec2 != null : "fx:id=\"linec2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert morearrow != null : "fx:id=\"morearrow\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert msg5 != null : "fx:id=\"msg5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert msg8 != null : "fx:id=\"msg8\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert msg81 != null : "fx:id=\"msg81\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert notification != null : "fx:id=\"notification\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert orangecake != null : "fx:id=\"orangecake\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p180 != null : "fx:id=\"p180\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p1801 != null : "fx:id=\"p1801\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p18011 != null : "fx:id=\"p18011\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p760 != null : "fx:id=\"p760\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p7601 != null : "fx:id=\"p7601\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p76011 != null : "fx:id=\"p76011\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p760111 != null : "fx:id=\"p760111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert p7601111 != null : "fx:id=\"p7601111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pane1 != null : "fx:id=\"pane1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pane2 != null : "fx:id=\"pane2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pane3 != null : "fx:id=\"pane3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pane4 != null : "fx:id=\"pane4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pane5 != null : "fx:id=\"pane5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert paneNew != null : "fx:id=\"paneNew\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert perera != null : "fx:id=\"perera\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert persantage180 != null : "fx:id=\"persantage180\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert persatage80 != null : "fx:id=\"persatage80\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pic3 != null : "fx:id=\"pic3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pic4 != null : "fx:id=\"pic4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pic5 != null : "fx:id=\"pic5\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert pwesatage30 != null : "fx:id=\"pwesatage30\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs1 != null : "fx:id=\"rs1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs2 != null : "fx:id=\"rs2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs3 != null : "fx:id=\"rs3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert rs4 != null : "fx:id=\"rs4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert searchicon != null : "fx:id=\"searchicon\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert serachpic != null : "fx:id=\"serachpic\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert setting != null : "fx:id=\"setting\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk1113 != null : "fx:id=\"sk1113\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk11131 != null : "fx:id=\"sk11131\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk111311 != null : "fx:id=\"sk111311\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk1113111 != null : "fx:id=\"sk1113111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk111312 != null : "fx:id=\"sk111312\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert sk11132 != null : "fx:id=\"sk11132\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1 != null : "fx:id=\"star1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star11 != null : "fx:id=\"star11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star111 != null : "fx:id=\"star111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1111 != null : "fx:id=\"star1111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star11111 != null : "fx:id=\"star11111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1112 != null : "fx:id=\"star1112\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star112 != null : "fx:id=\"star112\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star12 != null : "fx:id=\"star12\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star13 != null : "fx:id=\"star13\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star131 != null : "fx:id=\"star131\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1311 != null : "fx:id=\"star1311\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star13111 != null : "fx:id=\"star13111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1312 != null : "fx:id=\"star1312\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star13121 != null : "fx:id=\"star13121\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star131211 != null : "fx:id=\"star131211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star132 != null : "fx:id=\"star132\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star1321 != null : "fx:id=\"star1321\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star13211 != null : "fx:id=\"star13211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert star14 != null : "fx:id=\"star14\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew1 != null : "fx:id=\"starnew1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew11 != null : "fx:id=\"starnew11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew12 != null : "fx:id=\"starnew12\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew121 != null : "fx:id=\"starnew121\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew1211 != null : "fx:id=\"starnew1211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew13 != null : "fx:id=\"starnew13\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert starnew131 != null : "fx:id=\"starnew131\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert time != null : "fx:id=\"time\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert total1 != null : "fx:id=\"total1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert total11 != null : "fx:id=\"total11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert totaltxt != null : "fx:id=\"totaltxt\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert totaltxt1 != null : "fx:id=\"totaltxt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert totaltxt11 != null : "fx:id=\"totaltxt11\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt01 != null : "fx:id=\"txt01\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt02 != null : "fx:id=\"txt02\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt12 != null : "fx:id=\"txt12\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt121 != null : "fx:id=\"txt121\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt1211 != null : "fx:id=\"txt1211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt12111 != null : "fx:id=\"txt12111\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt2 != null : "fx:id=\"txt2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt3 != null : "fx:id=\"txt3\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txt4 != null : "fx:id=\"txt4\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txtC != null : "fx:id=\"txtC\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txtC1 != null : "fx:id=\"txtC1\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txtC2 != null : "fx:id=\"txtC2\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txtC21 != null : "fx:id=\"txtC21\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert txtC211 != null : "fx:id=\"txtC211\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert user != null : "fx:id=\"user\" was not injected: check your FXML file 'mainForm.fxml'.";
        assert watermelon != null : "fx:id=\"watermelon\" was not injected: check your FXML file 'mainForm.fxml'.";

    }



    private void setDate() {
        LocalDate now = LocalDate.now();
        date.setText(String.valueOf(now));
    }

}
