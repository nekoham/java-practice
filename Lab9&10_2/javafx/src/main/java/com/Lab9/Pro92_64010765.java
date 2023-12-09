package com.Lab9;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Pro92_64010765 extends Application {

    @Override
    public void start(Stage stage) {
        // Create pane and
        GridPane gridPane = new GridPane();

        // Add text-field to pane
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                TextField text = new TextField(Integer.toString((int) Math.floor(Math.random() * 2)));
                text.setMaxWidth(23);
                gridPane.add(text, j, k);
            }
        }

        // Stage setting
        stage.setTitle("Exercise14_07");
        stage.setScene(new Scene(gridPane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
