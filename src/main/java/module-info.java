module com.example.chatapptomkolesso {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens Klient to javafx.fxml;
    exports Klient;
}