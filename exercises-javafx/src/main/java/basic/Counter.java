package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    private int counter = 0;

    private void updateNumberLabel(Label label) {
        label.setText(Integer.toString(counter));

        label.getStyleClass().remove("green");
        label.getStyleClass().remove("red");

        if(counter > 0) {
            label.getStyleClass().add("green");
        } else if(counter <0) {
            label.getStyleClass().add("red");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Label labelTitle = new Label("Counter");
        labelTitle.getStyleClass().add("title");

        Label labelNumber = new Label("0");
        labelNumber.getStyleClass().add("number");

        Button buttonDecrement = new Button("-");
        buttonDecrement.getStyleClass().add("buttons");
        buttonDecrement.setOnAction(e -> {
            counter--;
            updateNumberLabel(labelNumber);
        });
        

        Button buttonIncrement = new Button("+");
        buttonIncrement.getStyleClass().add("buttons");
        buttonIncrement.setOnAction(e -> {
            counter++;
            updateNumberLabel(labelNumber);
        });

        HBox boxButtons = new HBox();
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.setSpacing(10);
        boxButtons.getChildren().add(buttonDecrement);
        boxButtons.getChildren().add(buttonIncrement);

        VBox boxContent = new VBox();
        boxContent.getStyleClass().add("content");
        boxContent.setAlignment(Pos.CENTER);
        boxContent.setSpacing(10);
        boxContent.getChildren().add(labelTitle);
        boxContent.getChildren().add(labelNumber);
        boxContent.getChildren().add(boxButtons);

        String cssPath = getClass()
            .getResource("Counter.css").toExternalForm();

        Scene mainScene = new Scene(boxContent, 400, 400);
        mainScene.getStylesheets().add(cssPath);
        mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Special+Gothic+Condensed+One");

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
