package com.example.swing_chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField messageField;

    public void onSendButtonClick(ActionEvent actionEvent) {
        String message;
        mainTextArea.appendText("You: \n");
        message = messageField.getText();
        mainTextArea.appendText(message + "\n");
        messageField.setText("");

    }
}