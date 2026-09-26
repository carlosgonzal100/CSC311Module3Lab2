
package org.example.csc311module3lab2;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SplashController {

    @FXML
    private ProgressBar loadingBar;

    @FXML
    public void initialize() {

        Timeline loading = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(loadingBar.progressProperty(), 0)
                ),
                new KeyFrame(
                        Duration.seconds(3),
                        new KeyValue(loadingBar.progressProperty(), 1)
                )
        );

        loading.setOnFinished(event -> openLogin());
        loading.play();
    }

    private void openLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("login-view.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage) loadingBar
                    .getScene()
                    .getWindow();

            stage.setScene(new Scene(root, 700, 450));
            stage.setTitle("Login");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}