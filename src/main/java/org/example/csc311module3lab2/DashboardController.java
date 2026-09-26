package org.example.csc311module3lab2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DashboardController {

    @FXML
    private Label usernameLabel;

    @FXML
    private ImageView welcomeImage;

    public void setUsername(String username) {

        if (username == null || username.trim().isEmpty()) {
            usernameLabel.setText("No Name");
        } else {
            usernameLabel.setText(username);
        }
    }

    @FXML
    public void initialize() {

        // Attempts to load the GIF only if you have added it.
        var imageURL = getClass().getResource("images/your-image.gif");

        if (imageURL != null) {
            Image image = new Image(imageURL.toExternalForm());
            welcomeImage.setImage(image);
        }
    }

    @FXML
    private void handleMenuOption() {
        // Dashboard, Collection, Friends, and Profile
        // intentionally remain on the Dashboard.
    }

    @FXML
    private void handleCloseApp() {
        Platform.exit();
    }
}
