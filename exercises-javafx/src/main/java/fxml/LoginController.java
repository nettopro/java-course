package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void login() {

        boolean validEmail = emailField.getText().equals("student@edu.com");
        boolean validPassword = passwordField.getText().equals("12345678");

        if (validPassword && validEmail) {
            Notifications.create()
                .position(Pos.TOP_RIGHT)
                .title("Login FXML")
                .text("Login successful")
                .showInformation();
        } else {
            Notifications.create()
                .position(Pos.TOP_RIGHT)
                .title("Login FXML")
                .text("User/Password invalid")
                .showError();
        }
    }
}
