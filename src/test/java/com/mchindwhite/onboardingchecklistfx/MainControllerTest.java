package com.mchindwhite.onboardingchecklistfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

public class MainControllerTest {
    private FXMLLoader fxmlLoader;
    private MainController mainController;

    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        URL fxmlUrl = MainController.class.getResource("resources/main-view.fxml");
        fxmlLoader = new FXMLLoader(fxmlUrl);
        fxmlLoader.setController(mainController);
        Scene scene = null;
        try {
            scene = fxmlLoader.load();
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to load the fxml", e);
        }
        stage.setScene(scene);
        stage.show();
    }

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void initialize() {

    }

    @org.junit.Test
    public void enableWelcomeButton() {
    }

    @org.junit.Test
    public void onHelloButtonClick() {
    }

    @org.junit.Test
    public void onClearButtonClick() {
    }

    @org.junit.Test
    public void onCancelButtonClick() {
    }
}