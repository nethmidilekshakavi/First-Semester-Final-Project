package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main  extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/Login.fxml"))));
        stage.show();
        stage.centerOnScreen();

    }
    
}

/* stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/dashboard.fxml"))));
        stage.show();
        stage.centerOnScreen();*/