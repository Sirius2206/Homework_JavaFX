module com.example.swing_chat {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.swing_chat to javafx.fxml;
    exports com.example.swing_chat;
}