package com.Lab9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import classToUse.ClockPane;

public class Pro93_64010765 extends Application {

    @Override
    public void start(Stage stage) {

        // Create object
        ClockPane clock = new ClockPane();

        // Create time
        int hour = (int) Math.floor(Math.random() * 12);
        int minute = (int) Math.floor(Math.random() * 31);

        // Set hand visibility
        clock.setSecondHand(false);

        // Create a clock with random time
        clock.setWidth(200);
        clock.setHeight(200);
        clock.setHour(hour);
        clock.setMinute(minute);

        // Output
        BorderPane pane = new BorderPane(clock);
        Text time = new Text(hour + ":" + minute + ":0");
        pane.setBottom(time);
        BorderPane.setAlignment(time, Pos.CENTER);

        // Stage setting
        stage.setTitle("Exercise14_28");
        stage.setScene(new Scene(pane));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
