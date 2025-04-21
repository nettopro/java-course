package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = null;
        root = new TestAnchorPane();
        root = new TestBorderPane();
        root = new TestFlowPlane();

        Scene main = new Scene(root, 800, 600);

        primaryStage.setScene(main);
        primaryStage.setTitle("Layout Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
