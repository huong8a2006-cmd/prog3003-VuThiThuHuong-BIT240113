/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author admin
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Anh", 1200),
            new Employee(2, "Binh", 800),
            new Employee(3, "Dung", 1500),
            new Employee(4, "Cuong", 950)
        );

        // Xử lý Stream
        List<String> result = employees.stream()
            .filter(e -> e.getSalary() > 1000)        // Lọc lương > 1000
            .map(Employee::getName)                  // Lấy tên
            .sorted()                                // Sắp xếp Alpha-beta
            .collect(Collectors.toList());           // Gom về List

        System.out.println("Danh sách tên nhân viên lương > 1000: " + result);
    }
}