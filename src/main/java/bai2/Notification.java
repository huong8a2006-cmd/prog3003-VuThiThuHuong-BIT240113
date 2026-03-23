/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
// 3. Lớp Notification sử dụng Setter Injection
public class Notification {
    private MessageService service;

    // Setter để inject dependency
    public void setService(MessageService service) {
        this.service = service;
    }

    public void send(String msg) {
        service.sendMessage(msg);
    }
}