/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
public class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi SMS: " + message);
    }
}