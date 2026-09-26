package org.example.csc311module3lab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("splash-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 700, 450);

        stage.setTitle("Module3:Lab2");
        stage.setScene(scene);
        stage.show();
    }

}
