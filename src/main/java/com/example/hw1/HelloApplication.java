package com.example.hw1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Label namelbl = new Label("Name:Lucas Ni");
        Label emaillbl = new Label("Email:nil1@montclair.edu");
        Label majorlbl = new Label("Major:Cybersecurity");



    }

    public static void main(String[] args) {
        launch();
    }
}