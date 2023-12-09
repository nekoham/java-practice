package com.Lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import classToUse.Car;

public class Pro94_64010765 extends Application {

    @Override
    public void start(Stage stage) {
        // Create an object
        Car car = new Car();

        // Create car controls
        car.setOnMousePressed(e -> car.stopCar());
        car.setOnMouseReleased(e -> car.startCar());

        car.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                car.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN) {
                car.decreaseSpeed();
            }
        });

        // Stage setting
        Scene scene = new Scene(car, 300, 100);
        stage.setTitle("Exercise15_29");
        stage.setScene(scene);
        stage.show();

        car.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
