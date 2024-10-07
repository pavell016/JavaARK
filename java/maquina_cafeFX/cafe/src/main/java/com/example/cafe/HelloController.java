package com.example.cafe;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public ToggleGroup cafe;
    @FXML
    private Label welcomeText;
    @FXML
    private RadioButton opt1,opt2,opt3,opt4;
    @FXML
    private Button buy;
    @FXML
    protected void cafeopt() {
        
        RadioButton selected = (RadioButton) cafe.getSelectedToggle();
        if (selected != null){

        }
        else if (selected == opt1) {
            alert.setTitle("OPTION");
            alert.setHeaderText(null);
            alert.setContentText("Pa ti un café solo");
            alert.showAndWait();
        }
        else if (selected == opt2) {
            alert.setTitle("OPTION");
            alert.setHeaderText(null);
            alert.setContentText("Pa ti un Latte");
            alert.showAndWait();
        }
        else if (selected == opt3) {
            alert.setTitle("OPTION");
            alert.setHeaderText(null);
            alert.setContentText("Pa ti un Cortado");
            alert.showAndWait();
        }
        else if (selected == opt4) {
            alert.setTitle("OPTION");
            alert.setHeaderText(null);
            alert.setContentText("Pa ti una Diarrea explosiva haha");
            alert.showAndWait();
        }
    }
}