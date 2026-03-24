/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
// 4. Demo
public class DIDemo {
    public static void main(String[] args) {
        Notification notification = new Notification();

        // Gửi qua Email
        notification.setService(new EmailService());
        notification.send("Chào bạn, đây là thông báo Email!");

        // Gửi qua SMS
        notification.setService(new SMSService());
        notification.send("Chào bạn, đây là thông báo SMS!");
    }
}