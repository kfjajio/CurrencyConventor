module com.example.currencyconventor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.currencyconventor to javafx.fxml;
    exports com.example.currencyconventor;
}