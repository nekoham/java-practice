package com.Lab10_2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.*;

import classToUse.Loan;

public class Pro1021_64010765 extends Application {
    private TextField tfannualInterestRate = new TextField();
    private TextField tfnumberOfYears = new TextField();
    private TextField tfloanAmount = new TextField();
    private TextField tfmonthlyPayment = new TextField();
    private TextField tftotalPayment = new TextField();
    private Button calculateButton = new Button("Calculate");
    private Button clearButton = new Button("Clear");
    private Button loadButton = new Button("Load");
    private Button saveButton = new Button("Save");

    @Override
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        tfannualInterestRate.setPrefWidth(200); // Set width
        tfnumberOfYears.setPrefWidth(200);
        tfloanAmount.setPrefWidth(200);
        tfmonthlyPayment.setPrefWidth(200);
        tftotalPayment.setPrefWidth(200);

        gridPane.add(tfannualInterestRate, 1, 0); // Add text fields
        gridPane.add(tfnumberOfYears, 1, 1);
        gridPane.add(tfloanAmount, 1, 2);
        gridPane.add(tfmonthlyPayment, 1, 3);
        gridPane.add(tftotalPayment, 1, 4);

        gridPane.add(new Label("Annual Interest Rate:"), 0, 0); // Add label
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);

        gridPane.add(calculateButton, 1, 5); // Add buttons
        gridPane.add(clearButton, 1, 5);
        gridPane.add(loadButton, 0, 5);
        gridPane.add(saveButton, 0, 5);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);

        tfannualInterestRate.setAlignment(Pos.BOTTOM_RIGHT); // Text field setting
        tfnumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfloanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfmonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tftotalPayment.setAlignment(Pos.BOTTOM_RIGHT);

        tfmonthlyPayment.setEditable(false); // Set editable to false
        tftotalPayment.setEditable(false);

        GridPane.setHalignment(clearButton, HPos.CENTER); // Set h alignment so 2 buttons can stay in 1 column
        GridPane.setHalignment(calculateButton, HPos.RIGHT);
        GridPane.setHalignment(loadButton, HPos.RIGHT);

        // Process events
        EventHandler<ActionEvent> calculate = event -> loanCalculate(); // Set up event handler
        EventHandler<ActionEvent> clear = event -> loanClear();
        EventHandler<ActionEvent> save = event -> loanSave();
        EventHandler<ActionEvent> load = event -> loanLoad();

        calculateButton.setOnAction(calculate); // Set event on action
        clearButton.setOnAction(clear);
        saveButton.setOnAction(save);
        loadButton.setOnAction(load);

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 450, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.show();
    }

    private void loanCalculate() {
        // Get datas from textfields
        double annualInterestRate = Double.parseDouble(tfannualInterestRate.getText());
        int numberOfYears = Integer.parseInt(tfnumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfloanAmount.getText());

        // Create loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Calculate
        double monthlyPayment = loan.getMonthlyPayment();
        double totalPayment = loan.getTotalPayment();

        // Output
        tfmonthlyPayment.setText(String.format("$%.2f", monthlyPayment));
        tftotalPayment.setText(String.format("$%.2f", totalPayment));
    }

    private void loanClear() {
        tfannualInterestRate.clear();
        tfnumberOfYears.clear();
        tfloanAmount.clear();
        tfmonthlyPayment.clear();
        tftotalPayment.clear();
    }

    private void loanSave() {
        try {
            String annaulInterestRate = tfannualInterestRate.getText() + " "; // Get datas as strings
            String numberOfYears = tfnumberOfYears.getText() + " ";
            String loanAmount = tfloanAmount.getText() + " ";

            File file = new File("E:/drive_c/kmitl/1_2/OPP/javafx/Lab9/src/Lab10_2/loan.dat"); // Create file path
            FileOutputStream fileOutput = new FileOutputStream(file); // fileoutput and wrap it in bufferoutput
            BufferedOutputStream bufferOutput = new BufferedOutputStream(fileOutput);

            bufferOutput.write(annaulInterestRate.getBytes()); // Write data down to the file
            bufferOutput.write(numberOfYears.getBytes());
            bufferOutput.write(loanAmount.getBytes());

            bufferOutput.flush(); // Flush and close bufferoutput
            bufferOutput.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void loanLoad() {
        try {
            File file = new File("E:/drive_c/kmitl/1_2/OPP/javafx/Lab9/src/Lab10_2/loan.dat"); // Create file path
            FileInputStream fileInput = new FileInputStream(file); // fileinput and wrap it in bufferinput
            BufferedInputStream bufferInput = new BufferedInputStream(fileInput);

            // Read data
            int checker;
            String data = "";
            while ((checker = bufferInput.read()) != -1) {
                data += (char) checker;
            }
            String[] splitData = data.split(" ");
            tfannualInterestRate.setText(splitData[0]);
            tfnumberOfYears.setText(splitData[1]);
            tfloanAmount.setText(splitData[2]);

            // Close bufferinput
            bufferInput.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}