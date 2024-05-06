package lk.ijse.util;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.paint.Paint;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.paint.Paint.valueOf;

public class Regex {
    public static boolean isTextFieldValid(TextField textField, String text) {
        String filed = "";

        switch (textField) {
            case ID:
                filed = "^([A-Z][0-9]{3})$";
                break;
            case FNAME:
                filed = "^[A-z|\\\\s]{3,}$";
                break;
            case LNAME:
                filed = "^[A-z|\\\\s]{3,}$";
            case EMAIL:
                filed = "^([A-z])([A-z0-9.]){1,}[@]([A-z0-9]){1,10}[.]([A-z]){2,5}$";
        }
        Pattern pattern = Pattern.compile(filed);

        if (text != null) {
            if (text.trim().isEmpty()) {
                return false;
            }
        } else {
            return false;
        }
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }


    public static boolean setTextColor(TextField textField, javafx.scene.control.TextField emailtxt) {
        if (Regex.isTextFieldValid(textField, emailtxt.getText())) {
            textField.setStyle("-fx-focus-color: green; -fx-unfocus-color: green;");
            return true;
        } else {
            textField.setStyle("-fx-focus-color: red; -fx-unfocus-color: red;");
            return false;
        }
    }

}




