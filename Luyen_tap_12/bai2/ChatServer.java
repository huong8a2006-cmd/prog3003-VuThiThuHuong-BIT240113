/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

/**
 *
 * @author admin
 */
public class ChatServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader reader;
    private PrintWriter writer;

    public void startServer(int port, Consumer<String> onMessageReceived) {
        new Thread(() -> {
            try {
                serverSocket = new ServerSocket(port);
                System.out.println("Đang đợi kết nối...");
                clientSocket = serverSocket.accept(); // Chờ máy kia kết nối
                
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = new PrintWriter(clientSocket.getOutputStream(), true);

                String msg;
                while ((msg = reader.readLine()) != null) {
                    onMessageReceived.accept(msg); // Gửi tin nhắn nhận được về UI
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}