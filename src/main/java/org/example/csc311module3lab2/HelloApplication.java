package org.example.csc311module3lab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// AI- usage prompts are here:
/*
1. gave this prompt to CHATGPT to help me create a basic splash screen.
after telling it to not worry about the apps functionality and instead
its design, it gave me code for the splash-view.fxml file, which made a
very basic splash screen with a title and description. the title and the
description has placeholder text, which i changed and renamed it to what it
is now. it also put your app for the package name, which i had to change since
the app didnt run without the right package name. it then gave me code for a new
file, splash.css, which was used to style the splash screen. Finally, it gave me
code to set up and launch my splash screen in the helloApplication.java file. The
only thing i modified from CHATGPT's code in this file was the default name that
it had set for the stage which was your app, i changed it to Module3:Lab2.

"using java and javafx, first help me create a splash screen for an app.
use CSS files to style the app and dont worry about the functionality of
the app, just worry about the UI design"

2.gave this prompt to CHATGPT to help me make a login screen with no real functionality.
the user would be able to enter whatever gibberish into the 2 textboxe that need
a username and a password and proceed to the landing screen. i did this since the
project asks for design and not functionality. The prompt gave me and updated splash-view.fxml
file that updated the splash screens layout and added a progress bar to show the app is loading.
it then updated the splash.css file to include similar styling to the text for the loading bar
to give the screen a consistent color theme. then, it gave me code for the splash controller screen,
which was used to have the progress bar fill up in a course of 3 seconds, once full the login screen
would automatically load up. it then created a new fxml file called login-view.fxml, the new screen
for the login screen.
 */

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

    public static void main(String[] args) {
        launch();
    }
}
