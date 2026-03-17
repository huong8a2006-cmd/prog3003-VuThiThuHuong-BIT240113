/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author admin
 */
import java.util.HashMap;

public class EmployeeManager {
    public static void main(String[] args) {
        // 1. Khởi tạo HashMap
        HashMap<Integer, String> employees = new HashMap<>();

        // 2. Thêm nhân viên
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        // 3. Lấy tên nhân viên ID 102
        System.out.println("Nhân viên ID 102: " + employees.get(102));

        // 4. Kiểm tra ID 105
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }
        
        System.out.println("Danh sách nhân viên: " + employees);
    }
} 

