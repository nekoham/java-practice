package com.Lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Pro91_64010765 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane gridpane = new GridPane();
        Image[] images = new Image[4];

        for (int i = 0; i < 4; i++) {
            images[i] = new Image(getClass().getResourceAsStream("/bonus/flag" + (i + 1) + ".png"));
        }
        gridpane.add(new ImageView(images[0]), 0, 0);
        gridpane.add(new ImageView(images[1]), 1, 0);
        gridpane.add(new ImageView(images[2]), 0, 1);
        gridpane.add(new ImageView(images[3]), 1, 1);

        stage.setTitle("Exercise14_01");
        stage.setScene(new Scene(gridpane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
