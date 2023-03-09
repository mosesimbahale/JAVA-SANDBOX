module com.example.javalesson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalesson2 to javafx.fxml;
    exports com.example.javalesson2;
}