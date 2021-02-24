package com.nandi.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**

 1772050-Nandi

 * */

public class MainLayout {
    public TextField txtInput;
    public Label lblOutput;

        public void SendQueryAction(ActionEvent actionEvent) {
            if(txtInput.getText().trim().isEmpty()){
                lblOutput.setText(txtInput.getText().trim());
        }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill Input");
                alert.showAndWait();
            }
    }
}
