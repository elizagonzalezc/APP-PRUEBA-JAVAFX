module com.example.appprueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appprueba to javafx.fxml;
    exports com.example.appprueba;
}