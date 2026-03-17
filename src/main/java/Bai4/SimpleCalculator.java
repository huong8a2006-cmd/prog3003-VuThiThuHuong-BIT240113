/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author admin
 */
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Khởi tạo các thành phần
        TextField txtNum1 = new TextField();
        TextField txtNum2 = new TextField();
        Label lblResult = new Label("Kết quả: ");
        Button btnSum = new Button("Tính tổng");

        // Layout
        GridPane grid = new GridPane();
        grid.setHgap(10); grid.setVgap(10);
        grid.add(new Label("Số thứ nhất:"), 0, 0);
        grid.add(txtNum1, 1, 0);
        grid.add(new Label("Số thứ hai:"), 0, 1);
        grid.add(txtNum2, 1, 1);
        grid.add(btnSum, 0, 2);
        grid.add(lblResult, 1, 2);

        // Xử lý sự kiện (Event Handling)
        btnSum.setOnAction(e -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                lblResult.setText("Kết quả: " + (n1 + n2));
            } catch (NumberFormatException ex) {
                lblResult.setText("Lỗi!");
            }
        });

        primaryStage.setScene(new Scene(grid, 300, 200));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}