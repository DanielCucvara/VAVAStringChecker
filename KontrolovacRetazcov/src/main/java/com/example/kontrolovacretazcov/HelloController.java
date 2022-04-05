package com.example.kontrolovacretazcov;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Label regex, odnosda;
    @FXML
    public Label string;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField regexInput;
    @FXML
    private TextArea stringInput;

    @FXML
    protected void checkStrings() {
        if (stringInput.getText().toString().matches(regexInput.getText().toString())){
            welcomeText.setText("String is valid");
        }
        else welcomeText.setText("String is invlaid");
    }
}