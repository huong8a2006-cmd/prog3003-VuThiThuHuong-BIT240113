/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclassmate;

/**
 *
 * @author admin
 */
public class Main_bai1 {
    public static void main( String[]args ){
      StudentManager<Student> manager = new StudentManager<>();
        manager.add(new Student("S01", "Nguyen Van A", 3.5));
        manager.add(new Student("S02", "Le Thi B", 3.1));
        manager.add(new Student("S03", "Tran Van C", 3.8));
        manager.add(new Student("S04", "Pham Thi D", 2.9));

        System.out.println("--- Danh sách sinh viên ban đầu ---");
        manager.getAll().forEach(System.out::println);
    }
}

