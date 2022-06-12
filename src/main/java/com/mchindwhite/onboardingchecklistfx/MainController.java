package com.mchindwhite.onboardingchecklistfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Window;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button helloButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button clearCheckBoxes;

    @FXML
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;
    @FXML
    private CheckBox checkbox4;
    @FXML
    private CheckBox checkbox5;
    @FXML
    private CheckBox checkbox6;
    @FXML
    private CheckBox checkbox7;
    @FXML
    private CheckBox checkbox8;
    @FXML
    private CheckBox checkbox9;
    @FXML
    private CheckBox checkbox10;


    //Disable the welcome button initially
    public void initialize() {
        helloButton.setDisable(true);
    }

    //Enable the welcome button if they check the first checkbox
    public void enableWelcomeButton() {
        if(checkbox1.isSelected()){
            helloButton.setDisable(false);
        } else {
            helloButton.setDisable(true);
            welcomeText.setText("");
        }
    }

    //When the Hello button is clicked, Welcome! will be displayed above the button
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome!");
    }

    //When the Clear Checkboxes button is clicked, it will clear all checkboxes...
    //would be nice if there was a way to iterate through all the check boxes, instead of each one...
    @FXML
    public void onClearButtonClick() {
        checkbox1.setSelected(false);
        checkbox2.setSelected(false);
        checkbox3.setSelected(false);
        checkbox4.setSelected(false);
        checkbox5.setSelected(false);
        checkbox6.setSelected(false);
        checkbox7.setSelected(false);
        checkbox8.setSelected(false);
        checkbox9.setSelected(false);
        checkbox10.setSelected(false);
        //when the checkboxes are all cleared, we need to disable the hello button again and clear it's text
        helloButton.setDisable(true);
        welcomeText.setText("");
    }

    //What should happen when they press cancel?
    public void onCancelButtonClick() {

        try{
//            Stage stage = (Stage) cancelButton.getScene().getWindow();
//            stage.close();
            Window window = cancelButton.getScene().getWindow();
            window.hide();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}