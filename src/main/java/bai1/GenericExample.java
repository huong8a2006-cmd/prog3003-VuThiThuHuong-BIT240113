/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
public class GenericExample {
    // Phương thức Generic tĩnh
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Mảng Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        // Mảng String
        String[] stringArray = {"Java", "Python", "C#", "C++"};

        System.out.print("Mảng số nguyên: ");
        printArray(intArray);

        System.out.print("Mảng chuỗi: ");
        printArray(stringArray);
    }
}

