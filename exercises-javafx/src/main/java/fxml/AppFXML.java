package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String cssFile = getClass().getResource("/fxml/Login.css").toExternalForm();
        URL FXMLfile = getClass().getResource("/fxml/Login.fxml");
        GridPane root = FXMLLoader.load(FXMLfile);

        Scene scene = new Scene(root, 350, 400);
        scene.getStylesheets().add(cssFile);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
