package org.example;

import java.awt.*;
import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    public Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}