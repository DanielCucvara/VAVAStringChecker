module com.example.kontrolovacretazcov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kontrolovacretazcov to javafx.fxml;
    exports com.example.kontrolovacretazcov;
}