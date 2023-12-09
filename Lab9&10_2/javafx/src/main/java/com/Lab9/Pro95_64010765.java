package com.Lab9;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import classToUse.Fan;

public class Pro95_64010765 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Create fan pane
        Fan fanPane = new Fan(75);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> fanPane.spin());

        Timeline fanTimeline = new Timeline(keyFrame);
        fanTimeline.setCycleCount(Timeline.INDEFINITE);

        // Buttons
        Button pause = new Button("Pause");
        pause.setOnAction(e -> fanTimeline.pause());

        Button resume = new Button("Resume");
        resume.setOnAction(e -> fanTimeline.play());

        Button reverse = new Button("Reverse");
        reverse.setOnAction(e -> fanPane.increment *= -1);

        HBox hButtons = new HBox(pause, resume, reverse);
        hButtons.setSpacing(10);
        hButtons.setAlignment(Pos.CENTER);
        hButtons.setPadding(new Insets(10, 10, 10, 10));
        BorderPane borderPane = new BorderPane(fanPane, null, null, hButtons, null);

        stage.setScene(new Scene(borderPane));
        stage.setTitle("Exercise15_28");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}