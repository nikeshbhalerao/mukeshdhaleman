module com.example.mukesh2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mukesh2 to javafx.fxml;
    exports com.example.mukesh2;
}