package com.example.prova1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText, OutText;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onOut(){OutText.setText("SIUUUUUU");}
    @FXML
    protected void end(ActionEvent event){System.exit(0);}
}