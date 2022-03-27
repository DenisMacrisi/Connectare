module com.example.connectare {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connectare to javafx.fxml;
    exports com.example.connectare;
}