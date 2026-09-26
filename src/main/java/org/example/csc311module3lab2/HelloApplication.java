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
for the login screen. A login.css file was given to me to stylize the login screen similarly to the
splash screen. Finally, i was given code for the LoginController.java file so the login screen can go
to the landing screen after the user entered a username and password.

"now i need a login screen that allows users to enter their username and password. once again,
funcionalilty dousnt matter, so the user will be able to enter anything into the textboxes and
press a button to proceed no matter what. this login screen shows up after the splash screen
after a little delay. add a progress bar in the splash screen to show that the app is loading"

3. gave this prompt to CHATGPT to help me create a landing screen with a welcoming message and
a dropdown menu that wont lead to anything, it will keep you on the homepage unless you click the
close app option in the dropdown menu. CHATGPT gave me the dashboard-view.fxml file for the landing
screen and a dashboard.css file to go along with it for styling. i then recieved code for the DashboardController.java file
,which was used to handle any interaction made in the dropdown menu and used to display the username, if any.
if the user entered no username, the app will display noname instead. LoginController.java file was updated
to load the landing screen and send the username to that screen instead of just closing the app.

"finally, create me a landing screen that welcomes the user with their username and an image that i gif
that i will be able to insert. if the user has no name put the default name as no name. there will be
a label for the landing screen called dashboard at the top. along with a drop down menu that allows
the user a few options, dashboard, collection, friends, profile, and close app. of course they would
not go to anyother pages, just close the drop down menu once one of those are clicked and keep them
on the dashboard, unless they click close app, which will stop the program from running"
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
