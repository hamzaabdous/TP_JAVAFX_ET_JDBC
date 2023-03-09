package ma.enset.untiled4.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.sql.DriverManager;

public class ApplicationJavafx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            BorderPane root = FXMLLoader.load(getClass().getResource("views/productView.fxml"));
            Scene scene = new Scene(root,500,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Gestion products");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
