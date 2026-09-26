module org.example.csc311module3lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311module3lab2 to javafx.fxml;
    exports org.example.csc311module3lab2;
}