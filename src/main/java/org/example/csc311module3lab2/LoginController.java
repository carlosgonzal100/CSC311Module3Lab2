package org.example.csc311module3lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;


public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("dashboard-view.fxml")
            );

            Parent root = loader.load();

            DashboardController dashboardController =
                    loader.getController();

            dashboardController.setUsername(usernameField.getText());

            Button button = (Button) event.getSource();

            Stage stage =
                    (Stage) button.getScene().getWindow();

            stage.setScene(new Scene(root, 700, 450));
            stage.setTitle("Dashboard");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}