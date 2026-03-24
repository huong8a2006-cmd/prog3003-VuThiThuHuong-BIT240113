/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */ 
public class Main {
    public static void main(String[] args) {
        // 2. Triển khai bằng Lambda Expression
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> (b != 0) ? a / b : 0;

        // 3. Chạy và in kết quả
        int x = 10, y = 5;
        System.out.println("Cộng: " + add.compute(x, y));
        System.out.println("Trừ: " + subtract.compute(x, y));
        System.out.println("Nhân: " + multiply.compute(x, y));
        System.out.println("Chia: " + divide.compute(x, y));
    }
}