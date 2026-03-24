/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */

// 2. Các lớp Implement
public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}





